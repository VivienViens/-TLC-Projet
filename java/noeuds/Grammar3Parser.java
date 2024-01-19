// $ANTLR 3.5.1 C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g 2024-01-19 12:09:30
package noeuds ;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class Grammar3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMANDS", "COMMENT", "CONS", 
		"Dec", "EXPR", "EXPRS", "FOR", "FOREACH", "FUNCTION", "HD", "IF", "INPUTS", 
		"LET", "LEXPR", "LIST", "Maj", "Min", "NIL", "NOP", "OUTPUTS", "PRINT", 
		"PROGRAM", "SYMB", "Symbol", "TL", "VARS", "Variable", "WHILE", "WS", 
		"'%'", "'('", "')'", "','", "':'", "':='", "';'", "'=?'", "'cons'", "'do'", 
		"'else'", "'fi'", "'for'", "'foreach'", "'function'", "'hd'", "'if'", 
		"'in'", "'list'", "'nil'", "'nop'", "'od'", "'print'", "'read'", "'then'", 
		"'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int COMMANDS=4;
	public static final int COMMENT=5;
	public static final int CONS=6;
	public static final int Dec=7;
	public static final int EXPR=8;
	public static final int EXPRS=9;
	public static final int FOR=10;
	public static final int FOREACH=11;
	public static final int FUNCTION=12;
	public static final int HD=13;
	public static final int IF=14;
	public static final int INPUTS=15;
	public static final int LET=16;
	public static final int LEXPR=17;
	public static final int LIST=18;
	public static final int Maj=19;
	public static final int Min=20;
	public static final int NIL=21;
	public static final int NOP=22;
	public static final int OUTPUTS=23;
	public static final int PRINT=24;
	public static final int PROGRAM=25;
	public static final int SYMB=26;
	public static final int Symbol=27;
	public static final int TL=28;
	public static final int VARS=29;
	public static final int Variable=30;
	public static final int WHILE=31;
	public static final int WS=32;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public Grammar3Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public Grammar3Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return Grammar3Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:47:1: program : ( function )+ -> ^( PROGRAM ( function )+ ) ;
	public final Grammar3Parser.program_return program() throws RecognitionException {
		Grammar3Parser.program_return retval = new Grammar3Parser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;

		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:47:9: ( ( function )+ -> ^( PROGRAM ( function )+ ) )
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:47:11: ( function )+
			{
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:47:11: ( function )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==47) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:47:11: function
					{
					pushFollow(FOLLOW_function_in_program291);
					function1=function();
					state._fsp--;

					stream_function.add(function1.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// AST REWRITE
			// elements: function
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 47:21: -> ^( PROGRAM ( function )+ )
			{
				// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:47:24: ^( PROGRAM ( function )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_function.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_function.hasNext() ) {
					adaptor.addChild(root_1, stream_function.nextTree());
				}
				stream_function.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:48:1: function : 'function' Symbol ':' definition -> ^( FUNCTION Symbol definition ) ;
	public final Grammar3Parser.function_return function() throws RecognitionException {
		Grammar3Parser.function_return retval = new Grammar3Parser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal2=null;
		Token Symbol3=null;
		Token char_literal4=null;
		ParserRuleReturnScope definition5 =null;

		Object string_literal2_tree=null;
		Object Symbol3_tree=null;
		Object char_literal4_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:48:9: ( 'function' Symbol ':' definition -> ^( FUNCTION Symbol definition ) )
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:48:11: 'function' Symbol ':' definition
			{
			string_literal2=(Token)match(input,47,FOLLOW_47_in_function307);  
			stream_47.add(string_literal2);

			Symbol3=(Token)match(input,Symbol,FOLLOW_Symbol_in_function309);  
			stream_Symbol.add(Symbol3);

			char_literal4=(Token)match(input,37,FOLLOW_37_in_function311);  
			stream_37.add(char_literal4);

			pushFollow(FOLLOW_definition_in_function313);
			definition5=definition();
			state._fsp--;

			stream_definition.add(definition5.getTree());
			// AST REWRITE
			// elements: definition, Symbol
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 48:44: -> ^( FUNCTION Symbol definition )
			{
				// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:48:47: ^( FUNCTION Symbol definition )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_Symbol.nextNode());
				adaptor.addChild(root_1, stream_definition.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:49:1: definition : 'read' input '%' commands '%' 'write' output -> input commands output ;
	public final Grammar3Parser.definition_return definition() throws RecognitionException {
		Grammar3Parser.definition_return retval = new Grammar3Parser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal6=null;
		Token char_literal8=null;
		Token char_literal10=null;
		Token string_literal11=null;
		ParserRuleReturnScope input7 =null;
		ParserRuleReturnScope commands9 =null;
		ParserRuleReturnScope output12 =null;

		Object string_literal6_tree=null;
		Object char_literal8_tree=null;
		Object char_literal10_tree=null;
		Object string_literal11_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:49:11: ( 'read' input '%' commands '%' 'write' output -> input commands output )
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:49:13: 'read' input '%' commands '%' 'write' output
			{
			string_literal6=(Token)match(input,56,FOLLOW_56_in_definition329);  
			stream_56.add(string_literal6);

			pushFollow(FOLLOW_input_in_definition331);
			input7=input();
			state._fsp--;

			stream_input.add(input7.getTree());
			char_literal8=(Token)match(input,33,FOLLOW_33_in_definition333);  
			stream_33.add(char_literal8);

			pushFollow(FOLLOW_commands_in_definition335);
			commands9=commands();
			state._fsp--;

			stream_commands.add(commands9.getTree());
			char_literal10=(Token)match(input,33,FOLLOW_33_in_definition337);  
			stream_33.add(char_literal10);

			string_literal11=(Token)match(input,60,FOLLOW_60_in_definition339);  
			stream_60.add(string_literal11);

			pushFollow(FOLLOW_output_in_definition341);
			output12=output();
			state._fsp--;

			stream_output.add(output12.getTree());
			// AST REWRITE
			// elements: output, input, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 49:58: -> input commands output
			{
				adaptor.addChild(root_0, stream_input.nextTree());
				adaptor.addChild(root_0, stream_commands.nextTree());
				adaptor.addChild(root_0, stream_output.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:51:1: input : inputSub -> inputSub ;
	public final Grammar3Parser.input_return input() throws RecognitionException {
		Grammar3Parser.input_return retval = new Grammar3Parser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub13 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:51:7: ( inputSub -> inputSub )
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:51:9: inputSub
			{
			pushFollow(FOLLOW_inputSub_in_input357);
			inputSub13=inputSub();
			state._fsp--;

			stream_inputSub.add(inputSub13.getTree());
			// AST REWRITE
			// elements: inputSub
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 51:18: -> inputSub
			{
				adaptor.addChild(root_0, stream_inputSub.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "input"


	public static class inputSub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inputSub"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:52:1: inputSub : ( Variable )? ( ',' Variable )* -> ^( INPUTS ( Variable )* ) ;
	public final Grammar3Parser.inputSub_return inputSub() throws RecognitionException {
		Grammar3Parser.inputSub_return retval = new Grammar3Parser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable14=null;
		Token char_literal15=null;
		Token Variable16=null;

		Object Variable14_tree=null;
		Object char_literal15_tree=null;
		Object Variable16_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:52:9: ( ( Variable )? ( ',' Variable )* -> ^( INPUTS ( Variable )* ) )
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:52:11: ( Variable )? ( ',' Variable )*
			{
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:52:11: ( Variable )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Variable) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:52:11: Variable
					{
					Variable14=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub367);  
					stream_Variable.add(Variable14);

					}
					break;

			}

			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:52:21: ( ',' Variable )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==36) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:52:22: ',' Variable
					{
					char_literal15=(Token)match(input,36,FOLLOW_36_in_inputSub371);  
					stream_36.add(char_literal15);

					Variable16=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub373);  
					stream_Variable.add(Variable16);

					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 52:37: -> ^( INPUTS ( Variable )* )
			{
				// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:52:40: ^( INPUTS ( Variable )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);
				// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:52:49: ( Variable )*
				while ( stream_Variable.hasNext() ) {
					adaptor.addChild(root_1, stream_Variable.nextNode());
				}
				stream_Variable.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inputSub"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:53:1: output : Variable ( ',' Variable )* -> ^( OUTPUTS ( Variable )+ ) ;
	public final Grammar3Parser.output_return output() throws RecognitionException {
		Grammar3Parser.output_return retval = new Grammar3Parser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable17=null;
		Token char_literal18=null;
		Token Variable19=null;

		Object Variable17_tree=null;
		Object char_literal18_tree=null;
		Object Variable19_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:53:8: ( Variable ( ',' Variable )* -> ^( OUTPUTS ( Variable )+ ) )
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:53:10: Variable ( ',' Variable )*
			{
			Variable17=(Token)match(input,Variable,FOLLOW_Variable_in_output391);  
			stream_Variable.add(Variable17);

			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:53:19: ( ',' Variable )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==36) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:53:20: ',' Variable
					{
					char_literal18=(Token)match(input,36,FOLLOW_36_in_output394);  
					stream_36.add(char_literal18);

					Variable19=(Token)match(input,Variable,FOLLOW_Variable_in_output396);  
					stream_Variable.add(Variable19);

					}
					break;

				default :
					break loop4;
				}
			}

			// AST REWRITE
			// elements: Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 53:35: -> ^( OUTPUTS ( Variable )+ )
			{
				// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:53:38: ^( OUTPUTS ( Variable )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUTS, "OUTPUTS"), root_1);
				if ( !(stream_Variable.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Variable.hasNext() ) {
					adaptor.addChild(root_1, stream_Variable.nextNode());
				}
				stream_Variable.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "output"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:55:1: commands : command ( ';' command )* -> ^( COMMANDS ( command )+ ) ;
	public final Grammar3Parser.commands_return commands() throws RecognitionException {
		Grammar3Parser.commands_return retval = new Grammar3Parser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal21=null;
		ParserRuleReturnScope command20 =null;
		ParserRuleReturnScope command22 =null;

		Object char_literal21_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:55:9: ( command ( ';' command )* -> ^( COMMANDS ( command )+ ) )
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:55:11: command ( ';' command )*
			{
			pushFollow(FOLLOW_command_in_commands414);
			command20=command();
			state._fsp--;

			stream_command.add(command20.getTree());
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:55:19: ( ';' command )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==39) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:55:20: ';' command
					{
					char_literal21=(Token)match(input,39,FOLLOW_39_in_commands417);  
					stream_39.add(char_literal21);

					pushFollow(FOLLOW_command_in_commands419);
					command22=command();
					state._fsp--;

					stream_command.add(command22.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: command
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 55:34: -> ^( COMMANDS ( command )+ )
			{
				// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:55:37: ^( COMMANDS ( command )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_1);
				if ( !(stream_command.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_command.hasNext() ) {
					adaptor.addChild(root_1, stream_command.nextTree());
				}
				stream_command.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commands"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:56:1: command : ( 'nop' -> NOP | vars ':=' exprs -> ^( LET vars exprs ) | 'if' expression 'then' commands ( 'else' commands )? 'fi' -> ^( IF expression commands ( commands )? ) | 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) | 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) | 'foreach' Variable 'in' expression 'do' commands 'od' -> ^( FOREACH Variable expression commands ) | ( 'print' expression ) -> ^( PRINT expression ) );
	public final Grammar3Parser.command_return command() throws RecognitionException {
		Grammar3Parser.command_return retval = new Grammar3Parser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal23=null;
		Token string_literal25=null;
		Token string_literal27=null;
		Token string_literal29=null;
		Token string_literal31=null;
		Token string_literal33=null;
		Token string_literal34=null;
		Token string_literal36=null;
		Token string_literal38=null;
		Token string_literal39=null;
		Token string_literal41=null;
		Token string_literal43=null;
		Token string_literal44=null;
		Token Variable45=null;
		Token string_literal46=null;
		Token string_literal48=null;
		Token string_literal50=null;
		Token string_literal51=null;
		ParserRuleReturnScope vars24 =null;
		ParserRuleReturnScope exprs26 =null;
		ParserRuleReturnScope expression28 =null;
		ParserRuleReturnScope commands30 =null;
		ParserRuleReturnScope commands32 =null;
		ParserRuleReturnScope expression35 =null;
		ParserRuleReturnScope commands37 =null;
		ParserRuleReturnScope expression40 =null;
		ParserRuleReturnScope commands42 =null;
		ParserRuleReturnScope expression47 =null;
		ParserRuleReturnScope commands49 =null;
		ParserRuleReturnScope expression52 =null;

		Object string_literal23_tree=null;
		Object string_literal25_tree=null;
		Object string_literal27_tree=null;
		Object string_literal29_tree=null;
		Object string_literal31_tree=null;
		Object string_literal33_tree=null;
		Object string_literal34_tree=null;
		Object string_literal36_tree=null;
		Object string_literal38_tree=null;
		Object string_literal39_tree=null;
		Object string_literal41_tree=null;
		Object string_literal43_tree=null;
		Object string_literal44_tree=null;
		Object Variable45_tree=null;
		Object string_literal46_tree=null;
		Object string_literal48_tree=null;
		Object string_literal50_tree=null;
		Object string_literal51_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:56:9: ( 'nop' -> NOP | vars ':=' exprs -> ^( LET vars exprs ) | 'if' expression 'then' commands ( 'else' commands )? 'fi' -> ^( IF expression commands ( commands )? ) | 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) | 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) | 'foreach' Variable 'in' expression 'do' commands 'od' -> ^( FOREACH Variable expression commands ) | ( 'print' expression ) -> ^( PRINT expression ) )
			int alt7=7;
			switch ( input.LA(1) ) {
			case 53:
				{
				alt7=1;
				}
				break;
			case Variable:
				{
				alt7=2;
				}
				break;
			case 49:
				{
				alt7=3;
				}
				break;
			case 59:
				{
				alt7=4;
				}
				break;
			case 45:
				{
				alt7=5;
				}
				break;
			case 46:
				{
				alt7=6;
				}
				break;
			case 55:
				{
				alt7=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:56:11: 'nop'
					{
					string_literal23=(Token)match(input,53,FOLLOW_53_in_command437);  
					stream_53.add(string_literal23);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 56:17: -> NOP
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NOP, "NOP"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:57:9: vars ':=' exprs
					{
					pushFollow(FOLLOW_vars_in_command451);
					vars24=vars();
					state._fsp--;

					stream_vars.add(vars24.getTree());
					string_literal25=(Token)match(input,38,FOLLOW_38_in_command453);  
					stream_38.add(string_literal25);

					pushFollow(FOLLOW_exprs_in_command455);
					exprs26=exprs();
					state._fsp--;

					stream_exprs.add(exprs26.getTree());
					// AST REWRITE
					// elements: exprs, vars
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 57:25: -> ^( LET vars exprs )
					{
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:57:28: ^( LET vars exprs )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LET, "LET"), root_1);
						adaptor.addChild(root_1, stream_vars.nextTree());
						adaptor.addChild(root_1, stream_exprs.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:58:4: 'if' expression 'then' commands ( 'else' commands )? 'fi'
					{
					string_literal27=(Token)match(input,49,FOLLOW_49_in_command470);  
					stream_49.add(string_literal27);

					pushFollow(FOLLOW_expression_in_command472);
					expression28=expression();
					state._fsp--;

					stream_expression.add(expression28.getTree());
					string_literal29=(Token)match(input,57,FOLLOW_57_in_command474);  
					stream_57.add(string_literal29);

					pushFollow(FOLLOW_commands_in_command476);
					commands30=commands();
					state._fsp--;

					stream_commands.add(commands30.getTree());
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:58:36: ( 'else' commands )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==43) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:58:37: 'else' commands
							{
							string_literal31=(Token)match(input,43,FOLLOW_43_in_command479);  
							stream_43.add(string_literal31);

							pushFollow(FOLLOW_commands_in_command481);
							commands32=commands();
							state._fsp--;

							stream_commands.add(commands32.getTree());
							}
							break;

					}

					string_literal33=(Token)match(input,44,FOLLOW_44_in_command485);  
					stream_44.add(string_literal33);

					// AST REWRITE
					// elements: expression, commands, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 58:60: -> ^( IF expression commands ( commands )? )
					{
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:58:63: ^( IF expression commands ( commands )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_commands.nextTree());
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:58:88: ( commands )?
						if ( stream_commands.hasNext() ) {
							adaptor.addChild(root_1, stream_commands.nextTree());
						}
						stream_commands.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:59:4: 'while' expression 'do' commands 'od'
					{
					string_literal34=(Token)match(input,59,FOLLOW_59_in_command503);  
					stream_59.add(string_literal34);

					pushFollow(FOLLOW_expression_in_command505);
					expression35=expression();
					state._fsp--;

					stream_expression.add(expression35.getTree());
					string_literal36=(Token)match(input,42,FOLLOW_42_in_command507);  
					stream_42.add(string_literal36);

					pushFollow(FOLLOW_commands_in_command509);
					commands37=commands();
					state._fsp--;

					stream_commands.add(commands37.getTree());
					string_literal38=(Token)match(input,54,FOLLOW_54_in_command511);  
					stream_54.add(string_literal38);

					// AST REWRITE
					// elements: commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 59:42: -> ^( WHILE expression commands )
					{
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:59:45: ^( WHILE expression commands )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_commands.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:60:4: 'for' expression 'do' commands 'od'
					{
					string_literal39=(Token)match(input,45,FOLLOW_45_in_command526);  
					stream_45.add(string_literal39);

					pushFollow(FOLLOW_expression_in_command528);
					expression40=expression();
					state._fsp--;

					stream_expression.add(expression40.getTree());
					string_literal41=(Token)match(input,42,FOLLOW_42_in_command530);  
					stream_42.add(string_literal41);

					pushFollow(FOLLOW_commands_in_command532);
					commands42=commands();
					state._fsp--;

					stream_commands.add(commands42.getTree());
					string_literal43=(Token)match(input,54,FOLLOW_54_in_command534);  
					stream_54.add(string_literal43);

					// AST REWRITE
					// elements: expression, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 60:40: -> ^( FOR expression commands )
					{
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:60:43: ^( FOR expression commands )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_commands.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:61:4: 'foreach' Variable 'in' expression 'do' commands 'od'
					{
					string_literal44=(Token)match(input,46,FOLLOW_46_in_command549);  
					stream_46.add(string_literal44);

					Variable45=(Token)match(input,Variable,FOLLOW_Variable_in_command551);  
					stream_Variable.add(Variable45);

					string_literal46=(Token)match(input,50,FOLLOW_50_in_command553);  
					stream_50.add(string_literal46);

					pushFollow(FOLLOW_expression_in_command555);
					expression47=expression();
					state._fsp--;

					stream_expression.add(expression47.getTree());
					string_literal48=(Token)match(input,42,FOLLOW_42_in_command557);  
					stream_42.add(string_literal48);

					pushFollow(FOLLOW_commands_in_command559);
					commands49=commands();
					state._fsp--;

					stream_commands.add(commands49.getTree());
					string_literal50=(Token)match(input,54,FOLLOW_54_in_command561);  
					stream_54.add(string_literal50);

					// AST REWRITE
					// elements: Variable, commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 61:58: -> ^( FOREACH Variable expression commands )
					{
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:61:61: ^( FOREACH Variable expression commands )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
						adaptor.addChild(root_1, stream_Variable.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_commands.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:62:17: ( 'print' expression )
					{
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:62:17: ( 'print' expression )
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:62:18: 'print' expression
					{
					string_literal51=(Token)match(input,55,FOLLOW_55_in_command592);  
					stream_55.add(string_literal51);

					pushFollow(FOLLOW_expression_in_command594);
					expression52=expression();
					state._fsp--;

					stream_expression.add(expression52.getTree());
					}

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 62:38: -> ^( PRINT expression )
					{
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:62:41: ^( PRINT expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRINT, "PRINT"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:64:1: vars : Variable ( ',' Variable )* -> ^( VARS ( Variable )+ ) ;
	public final Grammar3Parser.vars_return vars() throws RecognitionException {
		Grammar3Parser.vars_return retval = new Grammar3Parser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable53=null;
		Token char_literal54=null;
		Token Variable55=null;

		Object Variable53_tree=null;
		Object char_literal54_tree=null;
		Object Variable55_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:64:6: ( Variable ( ',' Variable )* -> ^( VARS ( Variable )+ ) )
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:64:8: Variable ( ',' Variable )*
			{
			Variable53=(Token)match(input,Variable,FOLLOW_Variable_in_vars612);  
			stream_Variable.add(Variable53);

			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:64:17: ( ',' Variable )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==36) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:64:18: ',' Variable
					{
					char_literal54=(Token)match(input,36,FOLLOW_36_in_vars615);  
					stream_36.add(char_literal54);

					Variable55=(Token)match(input,Variable,FOLLOW_Variable_in_vars617);  
					stream_Variable.add(Variable55);

					}
					break;

				default :
					break loop8;
				}
			}

			// AST REWRITE
			// elements: Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 64:33: -> ^( VARS ( Variable )+ )
			{
				// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:64:36: ^( VARS ( Variable )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARS, "VARS"), root_1);
				if ( !(stream_Variable.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Variable.hasNext() ) {
					adaptor.addChild(root_1, stream_Variable.nextNode());
				}
				stream_Variable.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vars"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:66:1: exprs : expression ( ',' expression )* -> ^( EXPRS ( expression )+ ) ;
	public final Grammar3Parser.exprs_return exprs() throws RecognitionException {
		Grammar3Parser.exprs_return retval = new Grammar3Parser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal57=null;
		ParserRuleReturnScope expression56 =null;
		ParserRuleReturnScope expression58 =null;

		Object char_literal57_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:66:8: ( expression ( ',' expression )* -> ^( EXPRS ( expression )+ ) )
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:66:11: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprs638);
			expression56=expression();
			state._fsp--;

			stream_expression.add(expression56.getTree());
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:66:22: ( ',' expression )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==36) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:66:23: ',' expression
					{
					char_literal57=(Token)match(input,36,FOLLOW_36_in_exprs641);  
					stream_36.add(char_literal57);

					pushFollow(FOLLOW_expression_in_exprs643);
					expression58=expression();
					state._fsp--;

					stream_expression.add(expression58.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:40: -> ^( EXPRS ( expression )+ )
			{
				// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:66:43: ^( EXPRS ( expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRS, "EXPRS"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprs"


	public static class exprBase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprBase"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:67:1: exprBase : ( 'nil' -> NIL | Variable -> Variable | Symbol -> Symbol | '(' 'cons' ( lexpr )? ')' -> ^( CONS ( lexpr )? ) | '(' 'list' ( lexpr )? ')' -> ^( LIST ( lexpr )? ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' Symbol ( lexpr )? ')' -> ^( SYMB Symbol ( lexpr )? ) );
	public final Grammar3Parser.exprBase_return exprBase() throws RecognitionException {
		Grammar3Parser.exprBase_return retval = new Grammar3Parser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal59=null;
		Token Variable60=null;
		Token Symbol61=null;
		Token char_literal62=null;
		Token string_literal63=null;
		Token char_literal65=null;
		Token char_literal66=null;
		Token string_literal67=null;
		Token char_literal69=null;
		Token char_literal70=null;
		Token string_literal71=null;
		Token char_literal73=null;
		Token char_literal74=null;
		Token string_literal75=null;
		Token char_literal77=null;
		Token char_literal78=null;
		Token Symbol79=null;
		Token char_literal81=null;
		ParserRuleReturnScope lexpr64 =null;
		ParserRuleReturnScope lexpr68 =null;
		ParserRuleReturnScope exprBase72 =null;
		ParserRuleReturnScope exprBase76 =null;
		ParserRuleReturnScope lexpr80 =null;

		Object string_literal59_tree=null;
		Object Variable60_tree=null;
		Object Symbol61_tree=null;
		Object char_literal62_tree=null;
		Object string_literal63_tree=null;
		Object char_literal65_tree=null;
		Object char_literal66_tree=null;
		Object string_literal67_tree=null;
		Object char_literal69_tree=null;
		Object char_literal70_tree=null;
		Object string_literal71_tree=null;
		Object char_literal73_tree=null;
		Object char_literal74_tree=null;
		Object string_literal75_tree=null;
		Object char_literal77_tree=null;
		Object char_literal78_tree=null;
		Object Symbol79_tree=null;
		Object char_literal81_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:67:9: ( 'nil' -> NIL | Variable -> Variable | Symbol -> Symbol | '(' 'cons' ( lexpr )? ')' -> ^( CONS ( lexpr )? ) | '(' 'list' ( lexpr )? ')' -> ^( LIST ( lexpr )? ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' Symbol ( lexpr )? ')' -> ^( SYMB Symbol ( lexpr )? ) )
			int alt13=8;
			switch ( input.LA(1) ) {
			case 52:
				{
				alt13=1;
				}
				break;
			case Variable:
				{
				alt13=2;
				}
				break;
			case Symbol:
				{
				alt13=3;
				}
				break;
			case 34:
				{
				switch ( input.LA(2) ) {
				case 41:
					{
					alt13=4;
					}
					break;
				case 51:
					{
					alt13=5;
					}
					break;
				case 48:
					{
					alt13=6;
					}
					break;
				case 58:
					{
					alt13=7;
					}
					break;
				case Symbol:
					{
					alt13=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:67:11: 'nil'
					{
					string_literal59=(Token)match(input,52,FOLLOW_52_in_exprBase660);  
					stream_52.add(string_literal59);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 67:17: -> NIL
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:68:5: Variable
					{
					Variable60=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase670);  
					stream_Variable.add(Variable60);

					// AST REWRITE
					// elements: Variable
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 68:14: -> Variable
					{
						adaptor.addChild(root_0, stream_Variable.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:69:5: Symbol
					{
					Symbol61=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase680);  
					stream_Symbol.add(Symbol61);

					// AST REWRITE
					// elements: Symbol
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 69:12: -> Symbol
					{
						adaptor.addChild(root_0, stream_Symbol.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:70:4: '(' 'cons' ( lexpr )? ')'
					{
					char_literal62=(Token)match(input,34,FOLLOW_34_in_exprBase689);  
					stream_34.add(char_literal62);

					string_literal63=(Token)match(input,41,FOLLOW_41_in_exprBase691);  
					stream_41.add(string_literal63);

					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:70:15: ( lexpr )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==Symbol||LA10_0==Variable||LA10_0==34||LA10_0==52) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:70:15: lexpr
							{
							pushFollow(FOLLOW_lexpr_in_exprBase693);
							lexpr64=lexpr();
							state._fsp--;

							stream_lexpr.add(lexpr64.getTree());
							}
							break;

					}

					char_literal65=(Token)match(input,35,FOLLOW_35_in_exprBase696);  
					stream_35.add(char_literal65);

					// AST REWRITE
					// elements: lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 70:26: -> ^( CONS ( lexpr )? )
					{
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:70:29: ^( CONS ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:70:36: ( lexpr )?
						if ( stream_lexpr.hasNext() ) {
							adaptor.addChild(root_1, stream_lexpr.nextTree());
						}
						stream_lexpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:71:4: '(' 'list' ( lexpr )? ')'
					{
					char_literal66=(Token)match(input,34,FOLLOW_34_in_exprBase710);  
					stream_34.add(char_literal66);

					string_literal67=(Token)match(input,51,FOLLOW_51_in_exprBase712);  
					stream_51.add(string_literal67);

					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:71:15: ( lexpr )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==Symbol||LA11_0==Variable||LA11_0==34||LA11_0==52) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:71:15: lexpr
							{
							pushFollow(FOLLOW_lexpr_in_exprBase714);
							lexpr68=lexpr();
							state._fsp--;

							stream_lexpr.add(lexpr68.getTree());
							}
							break;

					}

					char_literal69=(Token)match(input,35,FOLLOW_35_in_exprBase717);  
					stream_35.add(char_literal69);

					// AST REWRITE
					// elements: lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 71:26: -> ^( LIST ( lexpr )? )
					{
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:71:29: ^( LIST ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:71:36: ( lexpr )?
						if ( stream_lexpr.hasNext() ) {
							adaptor.addChild(root_1, stream_lexpr.nextTree());
						}
						stream_lexpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:72:4: '(' 'hd' exprBase ')'
					{
					char_literal70=(Token)match(input,34,FOLLOW_34_in_exprBase731);  
					stream_34.add(char_literal70);

					string_literal71=(Token)match(input,48,FOLLOW_48_in_exprBase733);  
					stream_48.add(string_literal71);

					pushFollow(FOLLOW_exprBase_in_exprBase735);
					exprBase72=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase72.getTree());
					char_literal73=(Token)match(input,35,FOLLOW_35_in_exprBase737);  
					stream_35.add(char_literal73);

					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 72:27: -> ^( HD exprBase )
					{
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:72:30: ^( HD exprBase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:73:4: '(' 'tl' exprBase ')'
					{
					char_literal74=(Token)match(input,34,FOLLOW_34_in_exprBase751);  
					stream_34.add(char_literal74);

					string_literal75=(Token)match(input,58,FOLLOW_58_in_exprBase753);  
					stream_58.add(string_literal75);

					pushFollow(FOLLOW_exprBase_in_exprBase755);
					exprBase76=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase76.getTree());
					char_literal77=(Token)match(input,35,FOLLOW_35_in_exprBase757);  
					stream_35.add(char_literal77);

					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 73:26: -> ^( TL exprBase )
					{
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:73:29: ^( TL exprBase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:74:4: '(' Symbol ( lexpr )? ')'
					{
					char_literal78=(Token)match(input,34,FOLLOW_34_in_exprBase770);  
					stream_34.add(char_literal78);

					Symbol79=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase772);  
					stream_Symbol.add(Symbol79);

					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:74:15: ( lexpr )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==Symbol||LA12_0==Variable||LA12_0==34||LA12_0==52) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:74:15: lexpr
							{
							pushFollow(FOLLOW_lexpr_in_exprBase774);
							lexpr80=lexpr();
							state._fsp--;

							stream_lexpr.add(lexpr80.getTree());
							}
							break;

					}

					char_literal81=(Token)match(input,35,FOLLOW_35_in_exprBase777);  
					stream_35.add(char_literal81);

					// AST REWRITE
					// elements: lexpr, Symbol
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 74:26: -> ^( SYMB Symbol ( lexpr )? )
					{
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:74:29: ^( SYMB Symbol ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYMB, "SYMB"), root_1);
						adaptor.addChild(root_1, stream_Symbol.nextNode());
						// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:74:43: ( lexpr )?
						if ( stream_lexpr.hasNext() ) {
							adaptor.addChild(root_1, stream_lexpr.nextTree());
						}
						stream_lexpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprBase"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:76:1: expression : exprBase ( '=?' exprBase )? -> ( exprBase )+ ;
	public final Grammar3Parser.expression_return expression() throws RecognitionException {
		Grammar3Parser.expression_return retval = new Grammar3Parser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal83=null;
		ParserRuleReturnScope exprBase82 =null;
		ParserRuleReturnScope exprBase84 =null;

		Object string_literal83_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:77:2: ( exprBase ( '=?' exprBase )? -> ( exprBase )+ )
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:77:4: exprBase ( '=?' exprBase )?
			{
			pushFollow(FOLLOW_exprBase_in_expression797);
			exprBase82=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase82.getTree());
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:77:13: ( '=?' exprBase )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==40) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:77:14: '=?' exprBase
					{
					string_literal83=(Token)match(input,40,FOLLOW_40_in_expression800);  
					stream_40.add(string_literal83);

					pushFollow(FOLLOW_exprBase_in_expression802);
					exprBase84=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase84.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: exprBase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 77:30: -> ( exprBase )+
			{
				if ( !(stream_exprBase.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_exprBase.hasNext() ) {
					adaptor.addChild(root_0, stream_exprBase.nextTree());
				}
				stream_exprBase.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class lexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexpr"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:78:1: lexpr : ( exprBase )+ -> ( exprBase )+ ;
	public final Grammar3Parser.lexpr_return lexpr() throws RecognitionException {
		Grammar3Parser.lexpr_return retval = new Grammar3Parser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprBase85 =null;

		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:78:7: ( ( exprBase )+ -> ( exprBase )+ )
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:78:9: ( exprBase )+
			{
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:78:9: ( exprBase )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==Symbol||LA15_0==Variable||LA15_0==34||LA15_0==52) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:78:9: exprBase
					{
					pushFollow(FOLLOW_exprBase_in_lexpr816);
					exprBase85=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase85.getTree());
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			// AST REWRITE
			// elements: exprBase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 78:19: -> ( exprBase )+
			{
				if ( !(stream_exprBase.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_exprBase.hasNext() ) {
					adaptor.addChild(root_0, stream_exprBase.nextTree());
				}
				stream_exprBase.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr"


	public static class startRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "startRule"
	// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:82:1: startRule : program ;
	public final Grammar3Parser.startRule_return startRule() throws RecognitionException {
		Grammar3Parser.startRule_return retval = new Grammar3Parser.startRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program86 =null;


		try {
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:83:9: ( program )
			// C:\\Users\\vivie\\OneDrive\\Documents\\ESIR2\\TLC\\Projet\\code\\ANTLR\\Grammar3\\Grammar3.g:83:11: program
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_program_in_startRule881);
			program86=program();
			state._fsp--;

			adaptor.addChild(root_0, program86.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "startRule"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program291 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_function307 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Symbol_in_function309 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_function311 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_definition_in_function313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_definition329 = new BitSet(new long[]{0x0000001040000000L});
	public static final BitSet FOLLOW_input_in_definition331 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_definition333 = new BitSet(new long[]{0x08A2600040000000L});
	public static final BitSet FOLLOW_commands_in_definition335 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_definition337 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_definition339 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_output_in_definition341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub367 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_inputSub371 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Variable_in_inputSub373 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_Variable_in_output391 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_output394 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Variable_in_output396 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_command_in_commands414 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_commands417 = new BitSet(new long[]{0x08A2600040000000L});
	public static final BitSet FOLLOW_command_in_commands419 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_53_in_command437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command451 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_command453 = new BitSet(new long[]{0x0010000448000000L});
	public static final BitSet FOLLOW_exprs_in_command455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_command470 = new BitSet(new long[]{0x0010000448000000L});
	public static final BitSet FOLLOW_expression_in_command472 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_command474 = new BitSet(new long[]{0x08A2600040000000L});
	public static final BitSet FOLLOW_commands_in_command476 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_43_in_command479 = new BitSet(new long[]{0x08A2600040000000L});
	public static final BitSet FOLLOW_commands_in_command481 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_command485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_command503 = new BitSet(new long[]{0x0010000448000000L});
	public static final BitSet FOLLOW_expression_in_command505 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_command507 = new BitSet(new long[]{0x08A2600040000000L});
	public static final BitSet FOLLOW_commands_in_command509 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_command511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_command526 = new BitSet(new long[]{0x0010000448000000L});
	public static final BitSet FOLLOW_expression_in_command528 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_command530 = new BitSet(new long[]{0x08A2600040000000L});
	public static final BitSet FOLLOW_commands_in_command532 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_command534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_command549 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Variable_in_command551 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command553 = new BitSet(new long[]{0x0010000448000000L});
	public static final BitSet FOLLOW_expression_in_command555 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_command557 = new BitSet(new long[]{0x08A2600040000000L});
	public static final BitSet FOLLOW_commands_in_command559 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_command561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_command592 = new BitSet(new long[]{0x0010000448000000L});
	public static final BitSet FOLLOW_expression_in_command594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars612 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_vars615 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_Variable_in_vars617 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_expression_in_exprs638 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_exprs641 = new BitSet(new long[]{0x0010000448000000L});
	public static final BitSet FOLLOW_expression_in_exprs643 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_52_in_exprBase660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_exprBase670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_exprBase680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_exprBase689 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_exprBase691 = new BitSet(new long[]{0x0010000C48000000L});
	public static final BitSet FOLLOW_lexpr_in_exprBase693 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_exprBase696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_exprBase710 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_exprBase712 = new BitSet(new long[]{0x0010000C48000000L});
	public static final BitSet FOLLOW_lexpr_in_exprBase714 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_exprBase717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_exprBase731 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_exprBase733 = new BitSet(new long[]{0x0010000448000000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase735 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_exprBase737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_exprBase751 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_exprBase753 = new BitSet(new long[]{0x0010000448000000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase755 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_exprBase757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_exprBase770 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Symbol_in_exprBase772 = new BitSet(new long[]{0x0010000C48000000L});
	public static final BitSet FOLLOW_lexpr_in_exprBase774 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_exprBase777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression797 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_expression800 = new BitSet(new long[]{0x0010000448000000L});
	public static final BitSet FOLLOW_exprBase_in_expression802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lexpr816 = new BitSet(new long[]{0x0010000448000002L});
	public static final BitSet FOLLOW_program_in_startRule881 = new BitSet(new long[]{0x0000000000000002L});
}
