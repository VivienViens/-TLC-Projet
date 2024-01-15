// $ANTLR 3.5.1 /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g 2023-12-05 10:52:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class whileParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMANDES", "CONDITION", "CONS", 
		"DEFINITION", "DO", "Dec", "ELSE", "EXPR", "FONCTION", "FOR", "FOREACH", 
		"IF", "IN", "Maj", "Min", "NOM", "NOP", "OUTPUT", "READ", "Symbol", "THEN", 
		"VARIABLE", "Variable", "WHILE", "WS", "'%'", "'('", "')'", "','", "':'", 
		"':='", "';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", "'for'", "'foreach'", 
		"'function'", "'hd'", "'if'", "'in'", "'list'", "'nil'", "'nop'", "'od'", 
		"'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
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
	public static final int COMMANDES=4;
	public static final int CONDITION=5;
	public static final int CONS=6;
	public static final int DEFINITION=7;
	public static final int DO=8;
	public static final int Dec=9;
	public static final int ELSE=10;
	public static final int EXPR=11;
	public static final int FONCTION=12;
	public static final int FOR=13;
	public static final int FOREACH=14;
	public static final int IF=15;
	public static final int IN=16;
	public static final int Maj=17;
	public static final int Min=18;
	public static final int NOM=19;
	public static final int NOP=20;
	public static final int OUTPUT=21;
	public static final int READ=22;
	public static final int Symbol=23;
	public static final int THEN=24;
	public static final int VARIABLE=25;
	public static final int Variable=26;
	public static final int WHILE=27;
	public static final int WS=28;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "command", "inputSub", "program", "vars", "output", "expression", 
		"exprs", "lExpr", "function", "exprBase", "input", "definition", "commands"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public whileParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public whileParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public whileParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return whileParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g"; }


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:46:1: input : inputSub -> ^( inputSub ) ;
	public final whileParser.input_return input() throws RecognitionException {
		whileParser.input_return retval = new whileParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub1 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:46:7: ( inputSub -> ^( inputSub ) )
			dbg.enterAlt(1);

			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:46:9: inputSub
			{
			dbg.location(46,9);
			pushFollow(FOLLOW_inputSub_in_input222);
			inputSub1=inputSub();
			state._fsp--;

			stream_inputSub.add(inputSub1.getTree());
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
			// 46:18: -> ^( inputSub )
			{
				dbg.location(46,21);
				// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:46:21: ^( inputSub )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(46,23);
				root_1 = (Object)adaptor.becomeRoot(stream_inputSub.nextNode(), root_1);
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
		dbg.location(46, 31);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:47:1: inputSub : Variable ( ',' inputSub )? ;
	public final whileParser.inputSub_return inputSub() throws RecognitionException {
		whileParser.inputSub_return retval = new whileParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable2=null;
		Token char_literal3=null;
		ParserRuleReturnScope inputSub4 =null;

		Object Variable2_tree=null;
		Object char_literal3_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "inputSub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:47:9: ( Variable ( ',' inputSub )? )
			dbg.enterAlt(1);

			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:47:11: Variable ( ',' inputSub )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(47,11);
			Variable2=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub234); 
			Variable2_tree = (Object)adaptor.create(Variable2);
			adaptor.addChild(root_0, Variable2_tree);
			dbg.location(47,20);
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:47:20: ( ',' inputSub )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==32) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:47:21: ',' inputSub
					{
					dbg.location(47,21);
					char_literal3=(Token)match(input,32,FOLLOW_32_in_inputSub237); 
					char_literal3_tree = (Object)adaptor.create(char_literal3);
					adaptor.addChild(root_0, char_literal3_tree);
					dbg.location(47,25);
					pushFollow(FOLLOW_inputSub_in_inputSub239);
					inputSub4=inputSub();
					state._fsp--;

					adaptor.addChild(root_0, inputSub4.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}

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
		dbg.location(47, 34);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inputSub");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:48:1: output : Variable ( ',' output )? ;
	public final whileParser.output_return output() throws RecognitionException {
		whileParser.output_return retval = new whileParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable5=null;
		Token char_literal6=null;
		ParserRuleReturnScope output7 =null;

		Object Variable5_tree=null;
		Object char_literal6_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:48:8: ( Variable ( ',' output )? )
			dbg.enterAlt(1);

			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:48:10: Variable ( ',' output )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(48,10);
			Variable5=(Token)match(input,Variable,FOLLOW_Variable_in_output248); 
			Variable5_tree = (Object)adaptor.create(Variable5);
			adaptor.addChild(root_0, Variable5_tree);
			dbg.location(48,19);
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:48:19: ( ',' output )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==32) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:48:20: ',' output
					{
					dbg.location(48,20);
					char_literal6=(Token)match(input,32,FOLLOW_32_in_output251); 
					char_literal6_tree = (Object)adaptor.create(char_literal6);
					adaptor.addChild(root_0, char_literal6_tree);
					dbg.location(48,24);
					pushFollow(FOLLOW_output_in_output253);
					output7=output();
					state._fsp--;

					adaptor.addChild(root_0, output7.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(2);}

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
		dbg.location(48, 31);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "output");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "output"


	public static class exprBase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprBase"
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:50:1: exprBase : ( ( '(' 'hd' exprBase ')' -> 'hd' ^( exprBase ) | '(' 'tl' exprBase ')' -> 'tl' ^( exprBase ) ) | ( 'nil' | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) ) | ( '(' 'cons' lExpr ')' -> lExpr | '(' 'list' ( lExpr )? ')' ) -> ( lExpr )? | ( '(' Symbol ( lExpr )? ')' -> ^( EXPR Symbol ( lExpr )? ) ) );
	public final whileParser.exprBase_return exprBase() throws RecognitionException {
		whileParser.exprBase_return retval = new whileParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal8=null;
		Token string_literal9=null;
		Token char_literal11=null;
		Token char_literal12=null;
		Token string_literal13=null;
		Token char_literal15=null;
		Token string_literal16=null;
		Token Variable17=null;
		Token Symbol18=null;
		Token char_literal19=null;
		Token string_literal20=null;
		Token char_literal22=null;
		Token char_literal23=null;
		Token string_literal24=null;
		Token char_literal26=null;
		Token char_literal27=null;
		Token Symbol28=null;
		Token char_literal30=null;
		ParserRuleReturnScope exprBase10 =null;
		ParserRuleReturnScope exprBase14 =null;
		ParserRuleReturnScope lExpr21 =null;
		ParserRuleReturnScope lExpr25 =null;
		ParserRuleReturnScope lExpr29 =null;

		Object char_literal8_tree=null;
		Object string_literal9_tree=null;
		Object char_literal11_tree=null;
		Object char_literal12_tree=null;
		Object string_literal13_tree=null;
		Object char_literal15_tree=null;
		Object string_literal16_tree=null;
		Object Variable17_tree=null;
		Object Symbol18_tree=null;
		Object char_literal19_tree=null;
		Object string_literal20_tree=null;
		Object char_literal22_tree=null;
		Object char_literal23_tree=null;
		Object string_literal24_tree=null;
		Object char_literal26_tree=null;
		Object char_literal27_tree=null;
		Object Symbol28_tree=null;
		Object char_literal30_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "exprBase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:50:9: ( ( '(' 'hd' exprBase ')' -> 'hd' ^( exprBase ) | '(' 'tl' exprBase ')' -> 'tl' ^( exprBase ) ) | ( 'nil' | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) ) | ( '(' 'cons' lExpr ')' -> lExpr | '(' 'list' ( lExpr )? ')' ) -> ( lExpr )? | ( '(' Symbol ( lExpr )? ')' -> ^( EXPR Symbol ( lExpr )? ) ) )
			int alt8=4;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==30) ) {
				switch ( input.LA(2) ) {
				case 44:
				case 53:
					{
					alt8=1;
					}
					break;
				case 37:
				case 47:
					{
					alt8=3;
					}
					break;
				case Symbol:
					{
					alt8=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA8_0==Symbol||LA8_0==Variable||LA8_0==48) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:50:11: ( '(' 'hd' exprBase ')' -> 'hd' ^( exprBase ) | '(' 'tl' exprBase ')' -> 'tl' ^( exprBase ) )
					{
					dbg.location(50,11);
					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:50:11: ( '(' 'hd' exprBase ')' -> 'hd' ^( exprBase ) | '(' 'tl' exprBase ')' -> 'tl' ^( exprBase ) )
					int alt3=2;
					try { dbg.enterSubRule(3);
					try { dbg.enterDecision(3, decisionCanBacktrack[3]);

					int LA3_0 = input.LA(1);
					if ( (LA3_0==30) ) {
						int LA3_1 = input.LA(2);
						if ( (LA3_1==44) ) {
							alt3=1;
						}
						else if ( (LA3_1==53) ) {
							alt3=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 3, 1, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(3);}

					switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:50:12: '(' 'hd' exprBase ')'
							{
							dbg.location(50,12);
							char_literal8=(Token)match(input,30,FOLLOW_30_in_exprBase263);  
							stream_30.add(char_literal8);
							dbg.location(50,16);
							string_literal9=(Token)match(input,44,FOLLOW_44_in_exprBase265);  
							stream_44.add(string_literal9);
							dbg.location(50,21);
							pushFollow(FOLLOW_exprBase_in_exprBase267);
							exprBase10=exprBase();
							state._fsp--;

							stream_exprBase.add(exprBase10.getTree());dbg.location(50,30);
							char_literal11=(Token)match(input,31,FOLLOW_31_in_exprBase269);  
							stream_31.add(char_literal11);

							// AST REWRITE
							// elements: 44, exprBase
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 50:34: -> 'hd' ^( exprBase )
							{
								dbg.location(50,37);
								adaptor.addChild(root_0, stream_44.nextNode());dbg.location(50,42);
								// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:50:42: ^( exprBase )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(50,44);
								root_1 = (Object)adaptor.becomeRoot(stream_exprBase.nextNode(), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:50:55: '(' 'tl' exprBase ')'
							{
							dbg.location(50,55);
							char_literal12=(Token)match(input,30,FOLLOW_30_in_exprBase280);  
							stream_30.add(char_literal12);
							dbg.location(50,59);
							string_literal13=(Token)match(input,53,FOLLOW_53_in_exprBase282);  
							stream_53.add(string_literal13);
							dbg.location(50,64);
							pushFollow(FOLLOW_exprBase_in_exprBase284);
							exprBase14=exprBase();
							state._fsp--;

							stream_exprBase.add(exprBase14.getTree());dbg.location(50,73);
							char_literal15=(Token)match(input,31,FOLLOW_31_in_exprBase286);  
							stream_31.add(char_literal15);

							// AST REWRITE
							// elements: 53, exprBase
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 50:77: -> 'tl' ^( exprBase )
							{
								dbg.location(50,80);
								adaptor.addChild(root_0, stream_53.nextNode());dbg.location(50,85);
								// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:50:85: ^( exprBase )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(50,87);
								root_1 = (Object)adaptor.becomeRoot(stream_exprBase.nextNode(), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(3);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:52:3: ( 'nil' | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) )
					{
					dbg.location(52,3);
					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:52:3: ( 'nil' | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) )
					int alt4=3;
					try { dbg.enterSubRule(4);
					try { dbg.enterDecision(4, decisionCanBacktrack[4]);

					switch ( input.LA(1) ) {
					case 48:
						{
						alt4=1;
						}
						break;
					case Variable:
						{
						alt4=2;
						}
						break;
					case Symbol:
						{
						alt4=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(4);}

					switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:52:4: 'nil'
							{
							dbg.location(52,4);
							string_literal16=(Token)match(input,48,FOLLOW_48_in_exprBase305);  
							stream_48.add(string_literal16);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:52:12: Variable
							{
							dbg.location(52,12);
							Variable17=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase309);  
							stream_Variable.add(Variable17);

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
							// 52:21: -> ^( Variable )
							{
								dbg.location(52,24);
								// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:52:24: ^( Variable )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(52,26);
								root_1 = (Object)adaptor.becomeRoot(stream_Variable.nextNode(), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:52:38: Symbol
							{
							dbg.location(52,38);
							Symbol18=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase319);  
							stream_Symbol.add(Symbol18);

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
							// 52:45: -> ^( Symbol )
							{
								dbg.location(52,48);
								// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:52:48: ^( Symbol )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(52,50);
								root_1 = (Object)adaptor.becomeRoot(stream_Symbol.nextNode(), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(4);}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:53:5: ( '(' 'cons' lExpr ')' -> lExpr | '(' 'list' ( lExpr )? ')' )
					{
					dbg.location(53,5);
					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:53:5: ( '(' 'cons' lExpr ')' -> lExpr | '(' 'list' ( lExpr )? ')' )
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( (LA6_0==30) ) {
						int LA6_1 = input.LA(2);
						if ( (LA6_1==37) ) {
							alt6=1;
						}
						else if ( (LA6_1==47) ) {
							alt6=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 6, 1, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(6);}

					switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:53:6: '(' 'cons' lExpr ')'
							{
							dbg.location(53,6);
							char_literal19=(Token)match(input,30,FOLLOW_30_in_exprBase334);  
							stream_30.add(char_literal19);
							dbg.location(53,10);
							string_literal20=(Token)match(input,37,FOLLOW_37_in_exprBase336);  
							stream_37.add(string_literal20);
							dbg.location(53,17);
							pushFollow(FOLLOW_lExpr_in_exprBase338);
							lExpr21=lExpr();
							state._fsp--;

							stream_lExpr.add(lExpr21.getTree());dbg.location(53,23);
							char_literal22=(Token)match(input,31,FOLLOW_31_in_exprBase340);  
							stream_31.add(char_literal22);

							// AST REWRITE
							// elements: lExpr
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 53:27: -> lExpr
							{
								dbg.location(53,30);
								adaptor.addChild(root_0, stream_lExpr.nextTree());
							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:53:38: '(' 'list' ( lExpr )? ')'
							{
							dbg.location(53,38);
							char_literal23=(Token)match(input,30,FOLLOW_30_in_exprBase348);  
							stream_30.add(char_literal23);
							dbg.location(53,42);
							string_literal24=(Token)match(input,47,FOLLOW_47_in_exprBase350);  
							stream_47.add(string_literal24);
							dbg.location(53,49);
							// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:53:49: ( lExpr )?
							int alt5=2;
							try { dbg.enterSubRule(5);
							try { dbg.enterDecision(5, decisionCanBacktrack[5]);

							int LA5_0 = input.LA(1);
							if ( (LA5_0==Symbol||LA5_0==Variable||LA5_0==30||LA5_0==48) ) {
								alt5=1;
							}
							} finally {dbg.exitDecision(5);}

							switch (alt5) {
								case 1 :
									dbg.enterAlt(1);

									// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:53:50: lExpr
									{
									dbg.location(53,50);
									pushFollow(FOLLOW_lExpr_in_exprBase353);
									lExpr25=lExpr();
									state._fsp--;

									stream_lExpr.add(lExpr25.getTree());
									}
									break;

							}
							} finally {dbg.exitSubRule(5);}
							dbg.location(53,58);
							char_literal26=(Token)match(input,31,FOLLOW_31_in_exprBase357);  
							stream_31.add(char_literal26);

							}
							break;

					}
					} finally {dbg.exitSubRule(6);}

					// AST REWRITE
					// elements: lExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 53:63: -> ( lExpr )?
					{
						dbg.location(53,66);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:53:66: ( lExpr )?
						if ( stream_lExpr.hasNext() ) {
							dbg.location(53,66);
							adaptor.addChild(root_0, stream_lExpr.nextTree());
						}
						stream_lExpr.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:55:3: ( '(' Symbol ( lExpr )? ')' -> ^( EXPR Symbol ( lExpr )? ) )
					{
					dbg.location(55,3);
					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:55:3: ( '(' Symbol ( lExpr )? ')' -> ^( EXPR Symbol ( lExpr )? ) )
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:55:4: '(' Symbol ( lExpr )? ')'
					{
					dbg.location(55,4);
					char_literal27=(Token)match(input,30,FOLLOW_30_in_exprBase373);  
					stream_30.add(char_literal27);
					dbg.location(55,8);
					Symbol28=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase375);  
					stream_Symbol.add(Symbol28);
					dbg.location(55,15);
					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:55:15: ( lExpr )?
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					int LA7_0 = input.LA(1);
					if ( (LA7_0==Symbol||LA7_0==Variable||LA7_0==30||LA7_0==48) ) {
						alt7=1;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:55:16: lExpr
							{
							dbg.location(55,16);
							pushFollow(FOLLOW_lExpr_in_exprBase378);
							lExpr29=lExpr();
							state._fsp--;

							stream_lExpr.add(lExpr29.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(7);}
					dbg.location(55,24);
					char_literal30=(Token)match(input,31,FOLLOW_31_in_exprBase382);  
					stream_31.add(char_literal30);

					// AST REWRITE
					// elements: lExpr, Symbol
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 55:28: -> ^( EXPR Symbol ( lExpr )? )
					{
						dbg.location(55,31);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:55:31: ^( EXPR Symbol ( lExpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(55,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
						dbg.location(55,38);
						adaptor.addChild(root_1, stream_Symbol.nextNode());dbg.location(55,45);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:55:45: ( lExpr )?
						if ( stream_lExpr.hasNext() ) {
							dbg.location(55,45);
							adaptor.addChild(root_1, stream_lExpr.nextTree());
						}
						stream_lExpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

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
		dbg.location(55, 53);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprBase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:57:1: expression : exprBase ( '=?' exprBase )? ;
	public final whileParser.expression_return expression() throws RecognitionException {
		whileParser.expression_return retval = new whileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal32=null;
		ParserRuleReturnScope exprBase31 =null;
		ParserRuleReturnScope exprBase33 =null;

		Object string_literal32_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:58:2: ( exprBase ( '=?' exprBase )? )
			dbg.enterAlt(1);

			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:58:4: exprBase ( '=?' exprBase )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(58,4);
			pushFollow(FOLLOW_exprBase_in_expression405);
			exprBase31=exprBase();
			state._fsp--;

			adaptor.addChild(root_0, exprBase31.getTree());
			dbg.location(58,13);
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:58:13: ( '=?' exprBase )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==36) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:58:14: '=?' exprBase
					{
					dbg.location(58,14);
					string_literal32=(Token)match(input,36,FOLLOW_36_in_expression408); 
					string_literal32_tree = (Object)adaptor.create(string_literal32);
					adaptor.addChild(root_0, string_literal32_tree);
					dbg.location(58,19);
					pushFollow(FOLLOW_exprBase_in_expression410);
					exprBase33=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase33.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

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
		dbg.location(58, 29);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression"


	public static class lExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lExpr"
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:60:1: lExpr : exprBase lExpr ;
	public final whileParser.lExpr_return lExpr() throws RecognitionException {
		whileParser.lExpr_return retval = new whileParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprBase34 =null;
		ParserRuleReturnScope lExpr35 =null;


		try { dbg.enterRule(getGrammarFileName(), "lExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:60:7: ( exprBase lExpr )
			dbg.enterAlt(1);

			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:60:9: exprBase lExpr
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(60,9);
			pushFollow(FOLLOW_exprBase_in_lExpr423);
			exprBase34=exprBase();
			state._fsp--;

			adaptor.addChild(root_0, exprBase34.getTree());
			dbg.location(60,18);
			pushFollow(FOLLOW_lExpr_in_lExpr425);
			lExpr35=lExpr();
			state._fsp--;

			adaptor.addChild(root_0, lExpr35.getTree());

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
		dbg.location(60, 22);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "lExpr"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:62:1: vars : v1= Variable ( ',' v2= Variable )* -> ^( VARIABLE $v1 ( $v2)* ) ;
	public final whileParser.vars_return vars() throws RecognitionException {
		whileParser.vars_return retval = new whileParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v1=null;
		Token v2=null;
		Token char_literal36=null;

		Object v1_tree=null;
		Object v2_tree=null;
		Object char_literal36_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:62:6: (v1= Variable ( ',' v2= Variable )* -> ^( VARIABLE $v1 ( $v2)* ) )
			dbg.enterAlt(1);

			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:62:8: v1= Variable ( ',' v2= Variable )*
			{
			dbg.location(62,10);
			v1=(Token)match(input,Variable,FOLLOW_Variable_in_vars435);  
			stream_Variable.add(v1);
			dbg.location(62,20);
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:62:20: ( ',' v2= Variable )*
			try { dbg.enterSubRule(10);

			loop10:
			while (true) {
				int alt10=2;
				try { dbg.enterDecision(10, decisionCanBacktrack[10]);

				int LA10_0 = input.LA(1);
				if ( (LA10_0==32) ) {
					alt10=1;
				}

				} finally {dbg.exitDecision(10);}

				switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:62:21: ',' v2= Variable
					{
					dbg.location(62,21);
					char_literal36=(Token)match(input,32,FOLLOW_32_in_vars438);  
					stream_32.add(char_literal36);
					dbg.location(62,27);
					v2=(Token)match(input,Variable,FOLLOW_Variable_in_vars442);  
					stream_Variable.add(v2);

					}
					break;

				default :
					break loop10;
				}
			}
			} finally {dbg.exitSubRule(10);}

			// AST REWRITE
			// elements: v1, v2
			// token labels: v1, v2
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v1=new RewriteRuleTokenStream(adaptor,"token v1",v1);
			RewriteRuleTokenStream stream_v2=new RewriteRuleTokenStream(adaptor,"token v2",v2);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 62:39: -> ^( VARIABLE $v1 ( $v2)* )
			{
				dbg.location(62,42);
				// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:62:42: ^( VARIABLE $v1 ( $v2)* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(62,44);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);
				dbg.location(62,54);
				adaptor.addChild(root_1, stream_v1.nextNode());dbg.location(62,57);
				// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:62:57: ( $v2)*
				while ( stream_v2.hasNext() ) {
					dbg.location(62,59);
					adaptor.addChild(root_1, stream_v2.nextNode());
				}
				stream_v2.reset();

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
		dbg.location(62, 63);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vars");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:63:1: exprs : expression ( ',' exprs )? ;
	public final whileParser.exprs_return exprs() throws RecognitionException {
		whileParser.exprs_return retval = new whileParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal38=null;
		ParserRuleReturnScope expression37 =null;
		ParserRuleReturnScope exprs39 =null;

		Object char_literal38_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:63:7: ( expression ( ',' exprs )? )
			dbg.enterAlt(1);

			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:63:9: expression ( ',' exprs )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(63,9);
			pushFollow(FOLLOW_expression_in_exprs466);
			expression37=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression37.getTree());
			dbg.location(63,20);
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:63:20: ( ',' exprs )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==32) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:63:21: ',' exprs
					{
					dbg.location(63,21);
					char_literal38=(Token)match(input,32,FOLLOW_32_in_exprs469); 
					char_literal38_tree = (Object)adaptor.create(char_literal38);
					adaptor.addChild(root_0, char_literal38_tree);
					dbg.location(63,25);
					pushFollow(FOLLOW_exprs_in_exprs471);
					exprs39=exprs();
					state._fsp--;

					adaptor.addChild(root_0, exprs39.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

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
		dbg.location(63, 31);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprs"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:65:1: definition : 'read' ( input )? '%' commands '%' 'write' output -> ^( DEFINITION ^( READ ( input )? ) ^( COMMANDES commands ) ^( OUTPUT output ) ) ;
	public final whileParser.definition_return definition() throws RecognitionException {
		whileParser.definition_return retval = new whileParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal40=null;
		Token char_literal42=null;
		Token char_literal44=null;
		Token string_literal45=null;
		ParserRuleReturnScope input41 =null;
		ParserRuleReturnScope commands43 =null;
		ParserRuleReturnScope output46 =null;

		Object string_literal40_tree=null;
		Object char_literal42_tree=null;
		Object char_literal44_tree=null;
		Object string_literal45_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:65:12: ( 'read' ( input )? '%' commands '%' 'write' output -> ^( DEFINITION ^( READ ( input )? ) ^( COMMANDES commands ) ^( OUTPUT output ) ) )
			dbg.enterAlt(1);

			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:65:14: 'read' ( input )? '%' commands '%' 'write' output
			{
			dbg.location(65,14);
			string_literal40=(Token)match(input,51,FOLLOW_51_in_definition481);  
			stream_51.add(string_literal40);
			dbg.location(65,21);
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:65:21: ( input )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==Variable) ) {
				alt12=1;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:65:22: input
					{
					dbg.location(65,22);
					pushFollow(FOLLOW_input_in_definition484);
					input41=input();
					state._fsp--;

					stream_input.add(input41.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(12);}
			dbg.location(65,30);
			char_literal42=(Token)match(input,29,FOLLOW_29_in_definition488);  
			stream_29.add(char_literal42);
			dbg.location(65,34);
			pushFollow(FOLLOW_commands_in_definition490);
			commands43=commands();
			state._fsp--;

			stream_commands.add(commands43.getTree());dbg.location(65,43);
			char_literal44=(Token)match(input,29,FOLLOW_29_in_definition492);  
			stream_29.add(char_literal44);
			dbg.location(65,47);
			string_literal45=(Token)match(input,55,FOLLOW_55_in_definition494);  
			stream_55.add(string_literal45);
			dbg.location(65,55);
			pushFollow(FOLLOW_output_in_definition496);
			output46=output();
			state._fsp--;

			stream_output.add(output46.getTree());
			// AST REWRITE
			// elements: output, commands, input
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 65:62: -> ^( DEFINITION ^( READ ( input )? ) ^( COMMANDES commands ) ^( OUTPUT output ) )
			{
				dbg.location(65,65);
				// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:65:65: ^( DEFINITION ^( READ ( input )? ) ^( COMMANDES commands ) ^( OUTPUT output ) )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(65,67);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				dbg.location(65,78);
				// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:65:78: ^( READ ( input )? )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(65,80);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_2);
				dbg.location(65,85);
				// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:65:85: ( input )?
				if ( stream_input.hasNext() ) {
					dbg.location(65,85);
					adaptor.addChild(root_2, stream_input.nextTree());
				}
				stream_input.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(65,93);
				// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:65:93: ^( COMMANDES commands )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(65,95);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDES, "COMMANDES"), root_2);
				dbg.location(65,105);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(65,115);
				// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:65:115: ^( OUTPUT output )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(65,117);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_2);
				dbg.location(65,124);
				adaptor.addChild(root_2, stream_output.nextTree());
				adaptor.addChild(root_1, root_2);
				}

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
		dbg.location(65, 133);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "definition"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:66:1: function : 'function' Symbol ':' definition -> ^( FONCTION ^( NOM Symbol ) definition ) ;
	public final whileParser.function_return function() throws RecognitionException {
		whileParser.function_return retval = new whileParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal47=null;
		Token Symbol48=null;
		Token char_literal49=null;
		ParserRuleReturnScope definition50 =null;

		Object string_literal47_tree=null;
		Object Symbol48_tree=null;
		Object char_literal49_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:66:9: ( 'function' Symbol ':' definition -> ^( FONCTION ^( NOM Symbol ) definition ) )
			dbg.enterAlt(1);

			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:66:11: 'function' Symbol ':' definition
			{
			dbg.location(66,11);
			string_literal47=(Token)match(input,43,FOLLOW_43_in_function529);  
			stream_43.add(string_literal47);
			dbg.location(66,22);
			Symbol48=(Token)match(input,Symbol,FOLLOW_Symbol_in_function531);  
			stream_Symbol.add(Symbol48);
			dbg.location(66,29);
			char_literal49=(Token)match(input,33,FOLLOW_33_in_function533);  
			stream_33.add(char_literal49);
			dbg.location(66,33);
			pushFollow(FOLLOW_definition_in_function535);
			definition50=definition();
			state._fsp--;

			stream_definition.add(definition50.getTree());
			// AST REWRITE
			// elements: Symbol, definition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:44: -> ^( FONCTION ^( NOM Symbol ) definition )
			{
				dbg.location(66,47);
				// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:66:47: ^( FONCTION ^( NOM Symbol ) definition )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(66,49);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FONCTION, "FONCTION"), root_1);
				dbg.location(66,58);
				// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:66:58: ^( NOM Symbol )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(66,60);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOM, "NOM"), root_2);
				dbg.location(66,64);
				adaptor.addChild(root_2, stream_Symbol.nextNode());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(66,72);
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
		dbg.location(66, 83);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "function"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:68:1: command : ( 'nop' -> ^( NOP ) | ( vars ':=' exprs ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) ) | 'fi' -> ^( IF ^( expression ) ^( THEN $c1) ) ) ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( CONDITION expression ) ^( DO commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( EXPR expression ) ^( DO commands ) ) | ( 'foreach' Variable 'in' expression 'do' commands 'od' ) -> ^( FOREACH Variable ^( IN expression ) ^( DO commands ) ) );
	public final whileParser.command_return command() throws RecognitionException {
		whileParser.command_return retval = new whileParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal51=null;
		Token string_literal53=null;
		Token string_literal55=null;
		Token string_literal57=null;
		Token string_literal58=null;
		Token string_literal59=null;
		Token string_literal60=null;
		Token string_literal61=null;
		Token string_literal63=null;
		Token string_literal65=null;
		Token string_literal66=null;
		Token string_literal68=null;
		Token string_literal70=null;
		Token string_literal71=null;
		Token Variable72=null;
		Token string_literal73=null;
		Token string_literal75=null;
		Token string_literal77=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope vars52 =null;
		ParserRuleReturnScope exprs54 =null;
		ParserRuleReturnScope expression56 =null;
		ParserRuleReturnScope expression62 =null;
		ParserRuleReturnScope commands64 =null;
		ParserRuleReturnScope expression67 =null;
		ParserRuleReturnScope commands69 =null;
		ParserRuleReturnScope expression74 =null;
		ParserRuleReturnScope commands76 =null;

		Object string_literal51_tree=null;
		Object string_literal53_tree=null;
		Object string_literal55_tree=null;
		Object string_literal57_tree=null;
		Object string_literal58_tree=null;
		Object string_literal59_tree=null;
		Object string_literal60_tree=null;
		Object string_literal61_tree=null;
		Object string_literal63_tree=null;
		Object string_literal65_tree=null;
		Object string_literal66_tree=null;
		Object string_literal68_tree=null;
		Object string_literal70_tree=null;
		Object string_literal71_tree=null;
		Object Variable72_tree=null;
		Object string_literal73_tree=null;
		Object string_literal75_tree=null;
		Object string_literal77_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(68, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:68:9: ( 'nop' -> ^( NOP ) | ( vars ':=' exprs ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) ) | 'fi' -> ^( IF ^( expression ) ^( THEN $c1) ) ) ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( CONDITION expression ) ^( DO commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( EXPR expression ) ^( DO commands ) ) | ( 'foreach' Variable 'in' expression 'do' commands 'od' ) -> ^( FOREACH Variable ^( IN expression ) ^( DO commands ) ) )
			int alt14=6;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			switch ( input.LA(1) ) {
			case 49:
				{
				alt14=1;
				}
				break;
			case Variable:
				{
				alt14=2;
				}
				break;
			case 45:
				{
				alt14=3;
				}
				break;
			case 54:
				{
				alt14=4;
				}
				break;
			case 41:
				{
				alt14=5;
				}
				break;
			case 42:
				{
				alt14=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:68:11: 'nop'
					{
					dbg.location(68,11);
					string_literal51=(Token)match(input,49,FOLLOW_49_in_command558);  
					stream_49.add(string_literal51);

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
					// 68:17: -> ^( NOP )
					{
						dbg.location(68,20);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:68:20: ^( NOP )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(68,22);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOP, "NOP"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:68:29: ( vars ':=' exprs )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(68,29);
					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:68:29: ( vars ':=' exprs )
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:68:30: vars ':=' exprs
					{
					dbg.location(68,30);
					pushFollow(FOLLOW_vars_in_command569);
					vars52=vars();
					state._fsp--;

					adaptor.addChild(root_0, vars52.getTree());
					dbg.location(68,35);
					string_literal53=(Token)match(input,34,FOLLOW_34_in_command571); 
					string_literal53_tree = (Object)adaptor.create(string_literal53);
					adaptor.addChild(root_0, string_literal53_tree);
					dbg.location(68,40);
					pushFollow(FOLLOW_exprs_in_command573);
					exprs54=exprs();
					state._fsp--;

					adaptor.addChild(root_0, exprs54.getTree());

					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:5: ( 'if' expression 'then' c1= commands ( 'else' c2= commands 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) ) | 'fi' -> ^( IF ^( expression ) ^( THEN $c1) ) ) )
					{
					dbg.location(69,5);
					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:5: ( 'if' expression 'then' c1= commands ( 'else' c2= commands 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) ) | 'fi' -> ^( IF ^( expression ) ^( THEN $c1) ) ) )
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:6: 'if' expression 'then' c1= commands ( 'else' c2= commands 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) ) | 'fi' -> ^( IF ^( expression ) ^( THEN $c1) ) )
					{
					dbg.location(69,6);
					string_literal55=(Token)match(input,45,FOLLOW_45_in_command581);  
					stream_45.add(string_literal55);
					dbg.location(69,11);
					pushFollow(FOLLOW_expression_in_command583);
					expression56=expression();
					state._fsp--;

					stream_expression.add(expression56.getTree());dbg.location(69,22);
					string_literal57=(Token)match(input,52,FOLLOW_52_in_command585);  
					stream_52.add(string_literal57);
					dbg.location(69,31);
					pushFollow(FOLLOW_commands_in_command589);
					c1=commands();
					state._fsp--;

					stream_commands.add(c1.getTree());dbg.location(69,41);
					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:41: ( 'else' c2= commands 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) ) | 'fi' -> ^( IF ^( expression ) ^( THEN $c1) ) )
					int alt13=2;
					try { dbg.enterSubRule(13);
					try { dbg.enterDecision(13, decisionCanBacktrack[13]);

					int LA13_0 = input.LA(1);
					if ( (LA13_0==39) ) {
						alt13=1;
					}
					else if ( (LA13_0==40) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(13);}

					switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:42: 'else' c2= commands 'fi'
							{
							dbg.location(69,42);
							string_literal58=(Token)match(input,39,FOLLOW_39_in_command592);  
							stream_39.add(string_literal58);
							dbg.location(69,51);
							pushFollow(FOLLOW_commands_in_command596);
							c2=commands();
							state._fsp--;

							stream_commands.add(c2.getTree());dbg.location(69,61);
							string_literal59=(Token)match(input,40,FOLLOW_40_in_command598);  
							stream_40.add(string_literal59);

							// AST REWRITE
							// elements: c2, expression, c1
							// token labels: 
							// rule labels: c1, retval, c2
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 69:66: -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) )
							{
								dbg.location(69,69);
								// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:69: ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(69,71);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
								dbg.location(69,74);
								// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:74: ^( CONDITION expression )
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(69,76);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);
								dbg.location(69,86);
								adaptor.addChild(root_2, stream_expression.nextTree());
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(69,98);
								// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:98: ^( THEN $c1)
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(69,100);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
								dbg.location(69,106);
								adaptor.addChild(root_2, stream_c1.nextTree());
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(69,110);
								// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:110: ^( ELSE $c2)
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(69,112);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);
								dbg.location(69,118);
								adaptor.addChild(root_2, stream_c2.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:125: 'fi'
							{
							dbg.location(69,125);
							string_literal60=(Token)match(input,40,FOLLOW_40_in_command628);  
							stream_40.add(string_literal60);

							// AST REWRITE
							// elements: c1, expression
							// token labels: 
							// rule labels: c1, retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 69:130: -> ^( IF ^( expression ) ^( THEN $c1) )
							{
								dbg.location(69,133);
								// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:133: ^( IF ^( expression ) ^( THEN $c1) )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(69,135);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
								dbg.location(69,138);
								// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:138: ^( expression )
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(69,140);
								root_2 = (Object)adaptor.becomeRoot(stream_expression.nextNode(), root_2);
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(69,152);
								// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:69:152: ^( THEN $c1)
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(69,154);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
								dbg.location(69,160);
								adaptor.addChild(root_2, stream_c1.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(13);}

					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:71:5: ( 'while' expression 'do' commands 'od' )
					{
					dbg.location(71,5);
					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:71:5: ( 'while' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:71:6: 'while' expression 'do' commands 'od'
					{
					dbg.location(71,6);
					string_literal61=(Token)match(input,54,FOLLOW_54_in_command658);  
					stream_54.add(string_literal61);
					dbg.location(71,14);
					pushFollow(FOLLOW_expression_in_command660);
					expression62=expression();
					state._fsp--;

					stream_expression.add(expression62.getTree());dbg.location(71,25);
					string_literal63=(Token)match(input,38,FOLLOW_38_in_command662);  
					stream_38.add(string_literal63);
					dbg.location(71,30);
					pushFollow(FOLLOW_commands_in_command664);
					commands64=commands();
					state._fsp--;

					stream_commands.add(commands64.getTree());dbg.location(71,39);
					string_literal65=(Token)match(input,50,FOLLOW_50_in_command666);  
					stream_50.add(string_literal65);

					}

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
					// 71:45: -> ^( WHILE ^( CONDITION expression ) ^( DO commands ) )
					{
						dbg.location(71,48);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:71:48: ^( WHILE ^( CONDITION expression ) ^( DO commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(71,50);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
						dbg.location(71,56);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:71:56: ^( CONDITION expression )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(71,58);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);
						dbg.location(71,68);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(71,80);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:71:80: ^( DO commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(71,82);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_2);
						dbg.location(71,85);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:72:5: ( 'for' expression 'do' commands 'od' )
					{
					dbg.location(72,5);
					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:72:5: ( 'for' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:72:6: 'for' expression 'do' commands 'od'
					{
					dbg.location(72,6);
					string_literal66=(Token)match(input,41,FOLLOW_41_in_command693);  
					stream_41.add(string_literal66);
					dbg.location(72,12);
					pushFollow(FOLLOW_expression_in_command695);
					expression67=expression();
					state._fsp--;

					stream_expression.add(expression67.getTree());dbg.location(72,23);
					string_literal68=(Token)match(input,38,FOLLOW_38_in_command697);  
					stream_38.add(string_literal68);
					dbg.location(72,28);
					pushFollow(FOLLOW_commands_in_command699);
					commands69=commands();
					state._fsp--;

					stream_commands.add(commands69.getTree());dbg.location(72,37);
					string_literal70=(Token)match(input,50,FOLLOW_50_in_command701);  
					stream_50.add(string_literal70);

					}

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
					// 72:43: -> ^( FOR ^( EXPR expression ) ^( DO commands ) )
					{
						dbg.location(72,46);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:72:46: ^( FOR ^( EXPR expression ) ^( DO commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(72,48);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
						dbg.location(72,52);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:72:52: ^( EXPR expression )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(72,54);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);
						dbg.location(72,59);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(72,71);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:72:71: ^( DO commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(72,73);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_2);
						dbg.location(72,76);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:73:5: ( 'foreach' Variable 'in' expression 'do' commands 'od' )
					{
					dbg.location(73,5);
					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:73:5: ( 'foreach' Variable 'in' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:73:6: 'foreach' Variable 'in' expression 'do' commands 'od'
					{
					dbg.location(73,6);
					string_literal71=(Token)match(input,42,FOLLOW_42_in_command728);  
					stream_42.add(string_literal71);
					dbg.location(73,16);
					Variable72=(Token)match(input,Variable,FOLLOW_Variable_in_command730);  
					stream_Variable.add(Variable72);
					dbg.location(73,25);
					string_literal73=(Token)match(input,46,FOLLOW_46_in_command732);  
					stream_46.add(string_literal73);
					dbg.location(73,30);
					pushFollow(FOLLOW_expression_in_command734);
					expression74=expression();
					state._fsp--;

					stream_expression.add(expression74.getTree());dbg.location(73,41);
					string_literal75=(Token)match(input,38,FOLLOW_38_in_command736);  
					stream_38.add(string_literal75);
					dbg.location(73,46);
					pushFollow(FOLLOW_commands_in_command738);
					commands76=commands();
					state._fsp--;

					stream_commands.add(commands76.getTree());dbg.location(73,55);
					string_literal77=(Token)match(input,50,FOLLOW_50_in_command740);  
					stream_50.add(string_literal77);

					}

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
					// 73:60: -> ^( FOREACH Variable ^( IN expression ) ^( DO commands ) )
					{
						dbg.location(73,63);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:73:63: ^( FOREACH Variable ^( IN expression ) ^( DO commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(73,65);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
						dbg.location(73,73);
						adaptor.addChild(root_1, stream_Variable.nextNode());dbg.location(73,82);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:73:82: ^( IN expression )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(73,84);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
						dbg.location(73,87);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(73,99);
						// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:73:99: ^( DO commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(73,101);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_2);
						dbg.location(73,104);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

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
		dbg.location(73, 113);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "command"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:74:1: commands : command ( ';' commands )? -> command ( commands )? ;
	public final whileParser.commands_return commands() throws RecognitionException {
		whileParser.commands_return retval = new whileParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal79=null;
		ParserRuleReturnScope command78 =null;
		ParserRuleReturnScope commands80 =null;

		Object char_literal79_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:74:9: ( command ( ';' commands )? -> command ( commands )? )
			dbg.enterAlt(1);

			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:74:11: command ( ';' commands )?
			{
			dbg.location(74,11);
			pushFollow(FOLLOW_command_in_commands766);
			command78=command();
			state._fsp--;

			stream_command.add(command78.getTree());dbg.location(74,19);
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:74:19: ( ';' commands )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==35) ) {
				alt15=1;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:74:20: ';' commands
					{
					dbg.location(74,20);
					char_literal79=(Token)match(input,35,FOLLOW_35_in_commands769);  
					stream_35.add(char_literal79);
					dbg.location(74,24);
					pushFollow(FOLLOW_commands_in_commands771);
					commands80=commands();
					state._fsp--;

					stream_commands.add(commands80.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(15);}

			// AST REWRITE
			// elements: command, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 74:35: -> command ( commands )?
			{
				dbg.location(74,38);
				adaptor.addChild(root_0, stream_command.nextTree());dbg.location(74,46);
				// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:74:46: ( commands )?
				if ( stream_commands.hasNext() ) {
					dbg.location(74,47);
					adaptor.addChild(root_0, stream_commands.nextTree());
				}
				stream_commands.reset();

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
		dbg.location(74, 56);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "commands");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "commands"


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:76:1: program : ( function )+ ;
	public final whileParser.program_return program() throws RecognitionException {
		whileParser.program_return retval = new whileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function81 =null;


		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:76:9: ( ( function )+ )
			dbg.enterAlt(1);

			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:76:11: ( function )+
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(76,11);
			// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:76:11: ( function )+
			int cnt16=0;
			try { dbg.enterSubRule(16);

			loop16:
			while (true) {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				int LA16_0 = input.LA(1);
				if ( (LA16_0==43) ) {
					alt16=1;
				}

				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /private/student/e/ne/vjulienne/Documents/ESIR2/TLC/projet/grammaire_while/while.g:76:11: function
					{
					dbg.location(76,11);
					pushFollow(FOLLOW_function_in_program790);
					function81=function();
					state._fsp--;

					adaptor.addChild(root_0, function81.getTree());

					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt16++;
			}
			} finally {dbg.exitSubRule(16);}

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
		dbg.location(76, 20);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "program"

	// Delegated rules



	public static final BitSet FOLLOW_inputSub_in_input222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub234 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_inputSub237 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output248 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_output251 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_output_in_output253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_exprBase263 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_exprBase265 = new BitSet(new long[]{0x0001000044800000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase267 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_exprBase269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_exprBase280 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_exprBase282 = new BitSet(new long[]{0x0001000044800000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase284 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_exprBase286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_exprBase305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_exprBase309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_exprBase319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_exprBase334 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_exprBase336 = new BitSet(new long[]{0x0001000044800000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase338 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_exprBase340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_exprBase348 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_exprBase350 = new BitSet(new long[]{0x00010000C4800000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase353 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_exprBase357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_exprBase373 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Symbol_in_exprBase375 = new BitSet(new long[]{0x00010000C4800000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase378 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_exprBase382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression405 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_expression408 = new BitSet(new long[]{0x0001000044800000L});
	public static final BitSet FOLLOW_exprBase_in_expression410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr423 = new BitSet(new long[]{0x0001000044800000L});
	public static final BitSet FOLLOW_lExpr_in_lExpr425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars435 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_vars438 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Variable_in_vars442 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_expression_in_exprs466 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_exprs469 = new BitSet(new long[]{0x0001000044800000L});
	public static final BitSet FOLLOW_exprs_in_exprs471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_definition481 = new BitSet(new long[]{0x0000000024000000L});
	public static final BitSet FOLLOW_input_in_definition484 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_definition488 = new BitSet(new long[]{0x0042260004000000L});
	public static final BitSet FOLLOW_commands_in_definition490 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_definition492 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_definition494 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_output_in_definition496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_function529 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Symbol_in_function531 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_function533 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_definition_in_function535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_command558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command569 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_command571 = new BitSet(new long[]{0x0001000044800000L});
	public static final BitSet FOLLOW_exprs_in_command573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_command581 = new BitSet(new long[]{0x0001000044800000L});
	public static final BitSet FOLLOW_expression_in_command583 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_command585 = new BitSet(new long[]{0x0042260004000000L});
	public static final BitSet FOLLOW_commands_in_command589 = new BitSet(new long[]{0x0000018000000000L});
	public static final BitSet FOLLOW_39_in_command592 = new BitSet(new long[]{0x0042260004000000L});
	public static final BitSet FOLLOW_commands_in_command596 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_command598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_command628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_command658 = new BitSet(new long[]{0x0001000044800000L});
	public static final BitSet FOLLOW_expression_in_command660 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_command662 = new BitSet(new long[]{0x0042260004000000L});
	public static final BitSet FOLLOW_commands_in_command664 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_command693 = new BitSet(new long[]{0x0001000044800000L});
	public static final BitSet FOLLOW_expression_in_command695 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_command697 = new BitSet(new long[]{0x0042260004000000L});
	public static final BitSet FOLLOW_commands_in_command699 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_command728 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Variable_in_command730 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command732 = new BitSet(new long[]{0x0001000044800000L});
	public static final BitSet FOLLOW_expression_in_command734 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_command736 = new BitSet(new long[]{0x0042260004000000L});
	public static final BitSet FOLLOW_commands_in_command738 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands766 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_commands769 = new BitSet(new long[]{0x0042260004000000L});
	public static final BitSet FOLLOW_commands_in_commands771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program790 = new BitSet(new long[]{0x0000080000000002L});
}
