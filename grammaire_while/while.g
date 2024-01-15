grammar while;


options {
output=AST;
}
//TOKENS
tokens {
EXPR;
CONDITION;
CONS;
IF;
ELSE;
DEFINITION;
READ;
COMMANDES;
OUTPUT;
FONCTION;
NOM;
NOP;
WHILE;
FOR;
FOREACH;
THEN;
DO;
IN;
VARIABLE;
}

Maj	:	'A'..'Z';
Min	:	'a'..'z';
Dec	:	'0'..'9';

Variable	:	Maj(Maj|Min|Dec)*('!'|'?')?;
Symbol	:	Min(Maj|Min|Dec)*('!'|'?')?;


WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;


input	:	inputSub -> ^(inputSub);
inputSub:	Variable (',' inputSub)?;
output	:	Variable (',' output)?;

exprBase:	('(' 'hd' exprBase ')' -> 'hd' ^(exprBase)| '(' 'tl' exprBase ')' -> 'tl' ^(exprBase))
		| //('nil' | Variable | Symbol)
		('nil' | Variable -> ^(Variable) | Symbol -> ^(Symbol)) 
		| ('(' 'cons' lExpr ')' -> lExpr | '(' 'list' (lExpr)? ')') -> lExpr?
		| //('(' Symbol (lExpr)? ')') ;
		('(' Symbol (lExpr)? ')' -> ^(EXPR Symbol lExpr?)) ;
	
expression
	:	exprBase ('=?' exprBase)? ;
		
lExpr	:	exprBase lExpr;

vars	:	v1=Variable (',' v2=Variable)* -> ^(VARIABLE $v1 ($v2)*);
exprs	:	expression (',' exprs)?;

definition	:	'read' (input)? '%' commands '%' 'write' output -> ^(DEFINITION ^(READ input?) ^(COMMANDES commands) ^(OUTPUT output))  ;
function:	'function' Symbol ':' definition -> ^(FONCTION ^(NOM Symbol) definition) ;

command	:	'nop' -> ^(NOP) | (vars ':=' exprs)
		| ('if' expression 'then' c1=commands ('else' c2=commands 'fi' -> ^(IF ^(CONDITION expression) ^(THEN $c1) ^(ELSE $c2)) | 'fi' -> ^(IF ^(expression) ^(THEN $c1)) ))
		//('if' expression 'then' commands ('else' commands )?  'fi' )
		| ('while' expression 'do' commands 'od') -> ^(WHILE ^(CONDITION expression) ^(DO commands)) 
		| ('for' expression 'do' commands 'od') -> ^(FOR ^(EXPR expression) ^(DO commands)) 
		| ('foreach' Variable 'in' expression 'do' commands 'od')-> ^(FOREACH Variable ^(IN expression) ^(DO commands));
commands:	command (';' commands)? -> command (commands)?;

program	:	function+ ;










