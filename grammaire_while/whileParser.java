// $ANTLR 3.5.3 while.g 2023-12-01 09:48:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class whileParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMANDES", "CONDITION", "CONS", 
		"DEFINITION", "DO", "Dec", "ELSE", "EXPR", "FONCTION", "FOR", "FOREACH", 
		"IF", "IN", "Maj", "Min", "NOM", "NOP", "OUTPUT", "READ", "Symbol", "THEN", 
		"VARIABLE", "Variable", "WHILE", "'%'", "'('", "')'", "','", "':'", "':='", 
		"';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", "'for'", "'foreach'", 
		"'function'", "'hd'", "'if'", "'in'", "'list'", "'nil'", "'nop'", "'od'", 
		"'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__28=28;
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public whileParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public whileParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return whileParser.tokenNames; }
	@Override public String getGrammarFileName() { return "while.g"; }


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// while.g:37:1: input : inputSub -> ^( inputSub ) ;
	public final whileParser.input_return input() throws RecognitionException {
		whileParser.input_return retval = new whileParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub1 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// while.g:37:7: ( inputSub -> ^( inputSub ) )
			// while.g:37:9: inputSub
			{
			pushFollow(FOLLOW_inputSub_in_input154);
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
			// 37:18: -> ^( inputSub )
			{
				// while.g:37:21: ^( inputSub )
				{
				Object root_1 = (Object)adaptor.nil();
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
		return retval;
	}
	// $ANTLR end "input"


	public static class inputSub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inputSub"
	// while.g:38:1: inputSub : Variable ( ',' inputSub )? ;
	public final whileParser.inputSub_return inputSub() throws RecognitionException {
		whileParser.inputSub_return retval = new whileParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable2=null;
		Token char_literal3=null;
		ParserRuleReturnScope inputSub4 =null;

		Object Variable2_tree=null;
		Object char_literal3_tree=null;

		try {
			// while.g:38:9: ( Variable ( ',' inputSub )? )
			// while.g:38:11: Variable ( ',' inputSub )?
			{
			root_0 = (Object)adaptor.nil();


			Variable2=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub166); 
			Variable2_tree = (Object)adaptor.create(Variable2);
			adaptor.addChild(root_0, Variable2_tree);

			// while.g:38:20: ( ',' inputSub )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==31) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// while.g:38:21: ',' inputSub
					{
					char_literal3=(Token)match(input,31,FOLLOW_31_in_inputSub169); 
					char_literal3_tree = (Object)adaptor.create(char_literal3);
					adaptor.addChild(root_0, char_literal3_tree);

					pushFollow(FOLLOW_inputSub_in_inputSub171);
					inputSub4=inputSub();
					state._fsp--;

					adaptor.addChild(root_0, inputSub4.getTree());

					}
					break;

			}

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
	// while.g:39:1: output : Variable ( ',' output )? ;
	public final whileParser.output_return output() throws RecognitionException {
		whileParser.output_return retval = new whileParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable5=null;
		Token char_literal6=null;
		ParserRuleReturnScope output7 =null;

		Object Variable5_tree=null;
		Object char_literal6_tree=null;

		try {
			// while.g:39:8: ( Variable ( ',' output )? )
			// while.g:39:10: Variable ( ',' output )?
			{
			root_0 = (Object)adaptor.nil();


			Variable5=(Token)match(input,Variable,FOLLOW_Variable_in_output180); 
			Variable5_tree = (Object)adaptor.create(Variable5);
			adaptor.addChild(root_0, Variable5_tree);

			// while.g:39:19: ( ',' output )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==31) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// while.g:39:20: ',' output
					{
					char_literal6=(Token)match(input,31,FOLLOW_31_in_output183); 
					char_literal6_tree = (Object)adaptor.create(char_literal6);
					adaptor.addChild(root_0, char_literal6_tree);

					pushFollow(FOLLOW_output_in_output185);
					output7=output();
					state._fsp--;

					adaptor.addChild(root_0, output7.getTree());

					}
					break;

			}

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


	public static class exprBase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprBase"
	// while.g:41:1: exprBase : ( ( '(' 'hd' exprBase ')' -> 'hd' ^( exprBase ) | '(' 'tl' exprBase ')' -> 'tl' ^( exprBase ) ) | ( 'nil' | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) ) | ( '(' 'cons' lExpr ')' -> lExpr | '(' 'list' ( lExpr )? ')' ) -> ( lExpr )? | ( '(' Symbol ( lExpr )? ')' -> ^( EXPR Symbol ( lExpr )? ) ) );
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
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// while.g:41:9: ( ( '(' 'hd' exprBase ')' -> 'hd' ^( exprBase ) | '(' 'tl' exprBase ')' -> 'tl' ^( exprBase ) ) | ( 'nil' | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) ) | ( '(' 'cons' lExpr ')' -> lExpr | '(' 'list' ( lExpr )? ')' ) -> ( lExpr )? | ( '(' Symbol ( lExpr )? ')' -> ^( EXPR Symbol ( lExpr )? ) ) )
			int alt8=4;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==29) ) {
				switch ( input.LA(2) ) {
				case 43:
				case 52:
					{
					alt8=1;
					}
					break;
				case 36:
				case 46:
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
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA8_0==Symbol||LA8_0==Variable||LA8_0==47) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// while.g:41:11: ( '(' 'hd' exprBase ')' -> 'hd' ^( exprBase ) | '(' 'tl' exprBase ')' -> 'tl' ^( exprBase ) )
					{
					// while.g:41:11: ( '(' 'hd' exprBase ')' -> 'hd' ^( exprBase ) | '(' 'tl' exprBase ')' -> 'tl' ^( exprBase ) )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==29) ) {
						int LA3_1 = input.LA(2);
						if ( (LA3_1==43) ) {
							alt3=1;
						}
						else if ( (LA3_1==52) ) {
							alt3=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 3, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// while.g:41:12: '(' 'hd' exprBase ')'
							{
							char_literal8=(Token)match(input,29,FOLLOW_29_in_exprBase195);  
							stream_29.add(char_literal8);

							string_literal9=(Token)match(input,43,FOLLOW_43_in_exprBase197);  
							stream_43.add(string_literal9);

							pushFollow(FOLLOW_exprBase_in_exprBase199);
							exprBase10=exprBase();
							state._fsp--;

							stream_exprBase.add(exprBase10.getTree());
							char_literal11=(Token)match(input,30,FOLLOW_30_in_exprBase201);  
							stream_30.add(char_literal11);


							// AST REWRITE
							// elements: exprBase, 43
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 41:34: -> 'hd' ^( exprBase )
							{
								adaptor.addChild(root_0, stream_43.nextNode());
								// while.g:41:42: ^( exprBase )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_exprBase.nextNode(), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// while.g:41:55: '(' 'tl' exprBase ')'
							{
							char_literal12=(Token)match(input,29,FOLLOW_29_in_exprBase212);  
							stream_29.add(char_literal12);

							string_literal13=(Token)match(input,52,FOLLOW_52_in_exprBase214);  
							stream_52.add(string_literal13);

							pushFollow(FOLLOW_exprBase_in_exprBase216);
							exprBase14=exprBase();
							state._fsp--;

							stream_exprBase.add(exprBase14.getTree());
							char_literal15=(Token)match(input,30,FOLLOW_30_in_exprBase218);  
							stream_30.add(char_literal15);


							// AST REWRITE
							// elements: 52, exprBase
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 41:77: -> 'tl' ^( exprBase )
							{
								adaptor.addChild(root_0, stream_52.nextNode());
								// while.g:41:85: ^( exprBase )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_exprBase.nextNode(), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 2 :
					// while.g:43:3: ( 'nil' | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) )
					{
					// while.g:43:3: ( 'nil' | Variable -> ^( Variable ) | Symbol -> ^( Symbol ) )
					int alt4=3;
					switch ( input.LA(1) ) {
					case 47:
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
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// while.g:43:4: 'nil'
							{
							string_literal16=(Token)match(input,47,FOLLOW_47_in_exprBase237);  
							stream_47.add(string_literal16);

							}
							break;
						case 2 :
							// while.g:43:12: Variable
							{
							Variable17=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase241);  
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
							// 43:21: -> ^( Variable )
							{
								// while.g:43:24: ^( Variable )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_Variable.nextNode(), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							// while.g:43:38: Symbol
							{
							Symbol18=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase251);  
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
							// 43:45: -> ^( Symbol )
							{
								// while.g:43:48: ^( Symbol )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_Symbol.nextNode(), root_1);
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 3 :
					// while.g:44:5: ( '(' 'cons' lExpr ')' -> lExpr | '(' 'list' ( lExpr )? ')' )
					{
					// while.g:44:5: ( '(' 'cons' lExpr ')' -> lExpr | '(' 'list' ( lExpr )? ')' )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==29) ) {
						int LA6_1 = input.LA(2);
						if ( (LA6_1==36) ) {
							alt6=1;
						}
						else if ( (LA6_1==46) ) {
							alt6=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 6, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// while.g:44:6: '(' 'cons' lExpr ')'
							{
							char_literal19=(Token)match(input,29,FOLLOW_29_in_exprBase266);  
							stream_29.add(char_literal19);

							string_literal20=(Token)match(input,36,FOLLOW_36_in_exprBase268);  
							stream_36.add(string_literal20);

							pushFollow(FOLLOW_lExpr_in_exprBase270);
							lExpr21=lExpr();
							state._fsp--;

							stream_lExpr.add(lExpr21.getTree());
							char_literal22=(Token)match(input,30,FOLLOW_30_in_exprBase272);  
							stream_30.add(char_literal22);


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
							// 44:27: -> lExpr
							{
								adaptor.addChild(root_0, stream_lExpr.nextTree());
							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// while.g:44:38: '(' 'list' ( lExpr )? ')'
							{
							char_literal23=(Token)match(input,29,FOLLOW_29_in_exprBase280);  
							stream_29.add(char_literal23);

							string_literal24=(Token)match(input,46,FOLLOW_46_in_exprBase282);  
							stream_46.add(string_literal24);

							// while.g:44:49: ( lExpr )?
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==Symbol||LA5_0==Variable||LA5_0==29||LA5_0==47) ) {
								alt5=1;
							}
							switch (alt5) {
								case 1 :
									// while.g:44:50: lExpr
									{
									pushFollow(FOLLOW_lExpr_in_exprBase285);
									lExpr25=lExpr();
									state._fsp--;

									stream_lExpr.add(lExpr25.getTree());
									}
									break;

							}

							char_literal26=(Token)match(input,30,FOLLOW_30_in_exprBase289);  
							stream_30.add(char_literal26);

							}
							break;

					}


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
					// 44:63: -> ( lExpr )?
					{
						// while.g:44:66: ( lExpr )?
						if ( stream_lExpr.hasNext() ) {
							adaptor.addChild(root_0, stream_lExpr.nextTree());
						}
						stream_lExpr.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// while.g:46:3: ( '(' Symbol ( lExpr )? ')' -> ^( EXPR Symbol ( lExpr )? ) )
					{
					// while.g:46:3: ( '(' Symbol ( lExpr )? ')' -> ^( EXPR Symbol ( lExpr )? ) )
					// while.g:46:4: '(' Symbol ( lExpr )? ')'
					{
					char_literal27=(Token)match(input,29,FOLLOW_29_in_exprBase305);  
					stream_29.add(char_literal27);

					Symbol28=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase307);  
					stream_Symbol.add(Symbol28);

					// while.g:46:15: ( lExpr )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Symbol||LA7_0==Variable||LA7_0==29||LA7_0==47) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// while.g:46:16: lExpr
							{
							pushFollow(FOLLOW_lExpr_in_exprBase310);
							lExpr29=lExpr();
							state._fsp--;

							stream_lExpr.add(lExpr29.getTree());
							}
							break;

					}

					char_literal30=(Token)match(input,30,FOLLOW_30_in_exprBase314);  
					stream_30.add(char_literal30);


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
					// 46:28: -> ^( EXPR Symbol ( lExpr )? )
					{
						// while.g:46:31: ^( EXPR Symbol ( lExpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
						adaptor.addChild(root_1, stream_Symbol.nextNode());
						// while.g:46:45: ( lExpr )?
						if ( stream_lExpr.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "exprBase"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// while.g:48:1: expression : exprBase ( '=?' exprBase )? ;
	public final whileParser.expression_return expression() throws RecognitionException {
		whileParser.expression_return retval = new whileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal32=null;
		ParserRuleReturnScope exprBase31 =null;
		ParserRuleReturnScope exprBase33 =null;

		Object string_literal32_tree=null;

		try {
			// while.g:49:2: ( exprBase ( '=?' exprBase )? )
			// while.g:49:4: exprBase ( '=?' exprBase )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprBase_in_expression337);
			exprBase31=exprBase();
			state._fsp--;

			adaptor.addChild(root_0, exprBase31.getTree());

			// while.g:49:13: ( '=?' exprBase )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==35) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// while.g:49:14: '=?' exprBase
					{
					string_literal32=(Token)match(input,35,FOLLOW_35_in_expression340); 
					string_literal32_tree = (Object)adaptor.create(string_literal32);
					adaptor.addChild(root_0, string_literal32_tree);

					pushFollow(FOLLOW_exprBase_in_expression342);
					exprBase33=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase33.getTree());

					}
					break;

			}

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


	public static class lExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lExpr"
	// while.g:51:1: lExpr : exprBase lExpr ;
	public final whileParser.lExpr_return lExpr() throws RecognitionException {
		whileParser.lExpr_return retval = new whileParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprBase34 =null;
		ParserRuleReturnScope lExpr35 =null;


		try {
			// while.g:51:7: ( exprBase lExpr )
			// while.g:51:9: exprBase lExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprBase_in_lExpr355);
			exprBase34=exprBase();
			state._fsp--;

			adaptor.addChild(root_0, exprBase34.getTree());

			pushFollow(FOLLOW_lExpr_in_lExpr357);
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
		return retval;
	}
	// $ANTLR end "lExpr"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// while.g:53:1: vars : v1= Variable ( ',' v2= Variable )* -> ^( VARIABLE $v1 ( $v2)* ) ;
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
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");

		try {
			// while.g:53:6: (v1= Variable ( ',' v2= Variable )* -> ^( VARIABLE $v1 ( $v2)* ) )
			// while.g:53:8: v1= Variable ( ',' v2= Variable )*
			{
			v1=(Token)match(input,Variable,FOLLOW_Variable_in_vars367);  
			stream_Variable.add(v1);

			// while.g:53:20: ( ',' v2= Variable )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==31) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// while.g:53:21: ',' v2= Variable
					{
					char_literal36=(Token)match(input,31,FOLLOW_31_in_vars370);  
					stream_31.add(char_literal36);

					v2=(Token)match(input,Variable,FOLLOW_Variable_in_vars374);  
					stream_Variable.add(v2);

					}
					break;

				default :
					break loop10;
				}
			}


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
			// 53:39: -> ^( VARIABLE $v1 ( $v2)* )
			{
				// while.g:53:42: ^( VARIABLE $v1 ( $v2)* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);
				adaptor.addChild(root_1, stream_v1.nextNode());
				// while.g:53:57: ( $v2)*
				while ( stream_v2.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "vars"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// while.g:54:1: exprs : expression ( ',' exprs )? ;
	public final whileParser.exprs_return exprs() throws RecognitionException {
		whileParser.exprs_return retval = new whileParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal38=null;
		ParserRuleReturnScope expression37 =null;
		ParserRuleReturnScope exprs39 =null;

		Object char_literal38_tree=null;

		try {
			// while.g:54:7: ( expression ( ',' exprs )? )
			// while.g:54:9: expression ( ',' exprs )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_exprs398);
			expression37=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression37.getTree());

			// while.g:54:20: ( ',' exprs )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==31) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// while.g:54:21: ',' exprs
					{
					char_literal38=(Token)match(input,31,FOLLOW_31_in_exprs401); 
					char_literal38_tree = (Object)adaptor.create(char_literal38);
					adaptor.addChild(root_0, char_literal38_tree);

					pushFollow(FOLLOW_exprs_in_exprs403);
					exprs39=exprs();
					state._fsp--;

					adaptor.addChild(root_0, exprs39.getTree());

					}
					break;

			}

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


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// while.g:57:1: definition : 'read' ( input )? '%' commands '%' 'write' output -> ^( DEFINITION ^( READ ( input )? ) ^( COMMANDES commands ) ^( OUTPUT output ) ) ;
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
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// while.g:57:12: ( 'read' ( input )? '%' commands '%' 'write' output -> ^( DEFINITION ^( READ ( input )? ) ^( COMMANDES commands ) ^( OUTPUT output ) ) )
			// while.g:57:14: 'read' ( input )? '%' commands '%' 'write' output
			{
			string_literal40=(Token)match(input,50,FOLLOW_50_in_definition414);  
			stream_50.add(string_literal40);

			// while.g:57:21: ( input )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Variable) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// while.g:57:22: input
					{
					pushFollow(FOLLOW_input_in_definition417);
					input41=input();
					state._fsp--;

					stream_input.add(input41.getTree());
					}
					break;

			}

			char_literal42=(Token)match(input,28,FOLLOW_28_in_definition421);  
			stream_28.add(char_literal42);

			pushFollow(FOLLOW_commands_in_definition423);
			commands43=commands();
			state._fsp--;

			stream_commands.add(commands43.getTree());
			char_literal44=(Token)match(input,28,FOLLOW_28_in_definition425);  
			stream_28.add(char_literal44);

			string_literal45=(Token)match(input,54,FOLLOW_54_in_definition427);  
			stream_54.add(string_literal45);

			pushFollow(FOLLOW_output_in_definition429);
			output46=output();
			state._fsp--;

			stream_output.add(output46.getTree());

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
			// 57:62: -> ^( DEFINITION ^( READ ( input )? ) ^( COMMANDES commands ) ^( OUTPUT output ) )
			{
				// while.g:57:65: ^( DEFINITION ^( READ ( input )? ) ^( COMMANDES commands ) ^( OUTPUT output ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				// while.g:57:78: ^( READ ( input )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_2);
				// while.g:57:85: ( input )?
				if ( stream_input.hasNext() ) {
					adaptor.addChild(root_2, stream_input.nextTree());
				}
				stream_input.reset();

				adaptor.addChild(root_1, root_2);
				}

				// while.g:57:93: ^( COMMANDES commands )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDES, "COMMANDES"), root_2);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// while.g:57:115: ^( OUTPUT output )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_2);
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
		return retval;
	}
	// $ANTLR end "definition"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// while.g:58:1: function : 'function' Symbol ':' definition -> ^( FONCTION ^( NOM Symbol ) definition ) ;
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
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// while.g:58:9: ( 'function' Symbol ':' definition -> ^( FONCTION ^( NOM Symbol ) definition ) )
			// while.g:58:11: 'function' Symbol ':' definition
			{
			string_literal47=(Token)match(input,42,FOLLOW_42_in_function462);  
			stream_42.add(string_literal47);

			Symbol48=(Token)match(input,Symbol,FOLLOW_Symbol_in_function464);  
			stream_Symbol.add(Symbol48);

			char_literal49=(Token)match(input,32,FOLLOW_32_in_function466);  
			stream_32.add(char_literal49);

			pushFollow(FOLLOW_definition_in_function468);
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
			// 58:44: -> ^( FONCTION ^( NOM Symbol ) definition )
			{
				// while.g:58:47: ^( FONCTION ^( NOM Symbol ) definition )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FONCTION, "FONCTION"), root_1);
				// while.g:58:58: ^( NOM Symbol )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOM, "NOM"), root_2);
				adaptor.addChild(root_2, stream_Symbol.nextNode());
				adaptor.addChild(root_1, root_2);
				}

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


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// while.g:60:1: command : ( 'nop' -> ^( NOP ) | ( vars ':=' exprs ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) ) | 'fi' -> ^( IF ^( expression ) ^( THEN $c1) ) ) ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( CONDITION expression ) ^( DO commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( EXPR expression ) ^( DO commands ) ) | ( 'foreach' Variable 'in' expression 'do' commands 'od' ) -> ^( FOREACH Variable ^( IN expression ) ^( DO commands ) ) );
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
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// while.g:60:9: ( 'nop' -> ^( NOP ) | ( vars ':=' exprs ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) ) | 'fi' -> ^( IF ^( expression ) ^( THEN $c1) ) ) ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( CONDITION expression ) ^( DO commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( EXPR expression ) ^( DO commands ) ) | ( 'foreach' Variable 'in' expression 'do' commands 'od' ) -> ^( FOREACH Variable ^( IN expression ) ^( DO commands ) ) )
			int alt14=6;
			switch ( input.LA(1) ) {
			case 48:
				{
				alt14=1;
				}
				break;
			case Variable:
				{
				alt14=2;
				}
				break;
			case 44:
				{
				alt14=3;
				}
				break;
			case 53:
				{
				alt14=4;
				}
				break;
			case 40:
				{
				alt14=5;
				}
				break;
			case 41:
				{
				alt14=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// while.g:60:11: 'nop'
					{
					string_literal51=(Token)match(input,48,FOLLOW_48_in_command491);  
					stream_48.add(string_literal51);


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
					// 60:17: -> ^( NOP )
					{
						// while.g:60:20: ^( NOP )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOP, "NOP"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// while.g:60:29: ( vars ':=' exprs )
					{
					root_0 = (Object)adaptor.nil();


					// while.g:60:29: ( vars ':=' exprs )
					// while.g:60:30: vars ':=' exprs
					{
					pushFollow(FOLLOW_vars_in_command502);
					vars52=vars();
					state._fsp--;

					adaptor.addChild(root_0, vars52.getTree());

					string_literal53=(Token)match(input,33,FOLLOW_33_in_command504); 
					string_literal53_tree = (Object)adaptor.create(string_literal53);
					adaptor.addChild(root_0, string_literal53_tree);

					pushFollow(FOLLOW_exprs_in_command506);
					exprs54=exprs();
					state._fsp--;

					adaptor.addChild(root_0, exprs54.getTree());

					}

					}
					break;
				case 3 :
					// while.g:61:5: ( 'if' expression 'then' c1= commands ( 'else' c2= commands 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) ) | 'fi' -> ^( IF ^( expression ) ^( THEN $c1) ) ) )
					{
					// while.g:61:5: ( 'if' expression 'then' c1= commands ( 'else' c2= commands 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) ) | 'fi' -> ^( IF ^( expression ) ^( THEN $c1) ) ) )
					// while.g:61:6: 'if' expression 'then' c1= commands ( 'else' c2= commands 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) ) | 'fi' -> ^( IF ^( expression ) ^( THEN $c1) ) )
					{
					string_literal55=(Token)match(input,44,FOLLOW_44_in_command514);  
					stream_44.add(string_literal55);

					pushFollow(FOLLOW_expression_in_command516);
					expression56=expression();
					state._fsp--;

					stream_expression.add(expression56.getTree());
					string_literal57=(Token)match(input,51,FOLLOW_51_in_command518);  
					stream_51.add(string_literal57);

					pushFollow(FOLLOW_commands_in_command522);
					c1=commands();
					state._fsp--;

					stream_commands.add(c1.getTree());
					// while.g:61:41: ( 'else' c2= commands 'fi' -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) ) | 'fi' -> ^( IF ^( expression ) ^( THEN $c1) ) )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==38) ) {
						alt13=1;
					}
					else if ( (LA13_0==39) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// while.g:61:42: 'else' c2= commands 'fi'
							{
							string_literal58=(Token)match(input,38,FOLLOW_38_in_command525);  
							stream_38.add(string_literal58);

							pushFollow(FOLLOW_commands_in_command529);
							c2=commands();
							state._fsp--;

							stream_commands.add(c2.getTree());
							string_literal59=(Token)match(input,39,FOLLOW_39_in_command531);  
							stream_39.add(string_literal59);


							// AST REWRITE
							// elements: expression, c2, c1
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
							// 61:66: -> ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) )
							{
								// while.g:61:69: ^( IF ^( CONDITION expression ) ^( THEN $c1) ^( ELSE $c2) )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
								// while.g:61:74: ^( CONDITION expression )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);
								adaptor.addChild(root_2, stream_expression.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								// while.g:61:98: ^( THEN $c1)
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
								adaptor.addChild(root_2, stream_c1.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								// while.g:61:110: ^( ELSE $c2)
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);
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
							// while.g:61:125: 'fi'
							{
							string_literal60=(Token)match(input,39,FOLLOW_39_in_command561);  
							stream_39.add(string_literal60);


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
							// 61:130: -> ^( IF ^( expression ) ^( THEN $c1) )
							{
								// while.g:61:133: ^( IF ^( expression ) ^( THEN $c1) )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
								// while.g:61:138: ^( expression )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot(stream_expression.nextNode(), root_2);
								adaptor.addChild(root_1, root_2);
								}

								// while.g:61:152: ^( THEN $c1)
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
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

					}

					}
					break;
				case 4 :
					// while.g:63:5: ( 'while' expression 'do' commands 'od' )
					{
					// while.g:63:5: ( 'while' expression 'do' commands 'od' )
					// while.g:63:6: 'while' expression 'do' commands 'od'
					{
					string_literal61=(Token)match(input,53,FOLLOW_53_in_command591);  
					stream_53.add(string_literal61);

					pushFollow(FOLLOW_expression_in_command593);
					expression62=expression();
					state._fsp--;

					stream_expression.add(expression62.getTree());
					string_literal63=(Token)match(input,37,FOLLOW_37_in_command595);  
					stream_37.add(string_literal63);

					pushFollow(FOLLOW_commands_in_command597);
					commands64=commands();
					state._fsp--;

					stream_commands.add(commands64.getTree());
					string_literal65=(Token)match(input,49,FOLLOW_49_in_command599);  
					stream_49.add(string_literal65);

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
					// 63:45: -> ^( WHILE ^( CONDITION expression ) ^( DO commands ) )
					{
						// while.g:63:48: ^( WHILE ^( CONDITION expression ) ^( DO commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
						// while.g:63:56: ^( CONDITION expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// while.g:63:80: ^( DO commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_2);
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
					// while.g:64:5: ( 'for' expression 'do' commands 'od' )
					{
					// while.g:64:5: ( 'for' expression 'do' commands 'od' )
					// while.g:64:6: 'for' expression 'do' commands 'od'
					{
					string_literal66=(Token)match(input,40,FOLLOW_40_in_command626);  
					stream_40.add(string_literal66);

					pushFollow(FOLLOW_expression_in_command628);
					expression67=expression();
					state._fsp--;

					stream_expression.add(expression67.getTree());
					string_literal68=(Token)match(input,37,FOLLOW_37_in_command630);  
					stream_37.add(string_literal68);

					pushFollow(FOLLOW_commands_in_command632);
					commands69=commands();
					state._fsp--;

					stream_commands.add(commands69.getTree());
					string_literal70=(Token)match(input,49,FOLLOW_49_in_command634);  
					stream_49.add(string_literal70);

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
					// 64:43: -> ^( FOR ^( EXPR expression ) ^( DO commands ) )
					{
						// while.g:64:46: ^( FOR ^( EXPR expression ) ^( DO commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
						// while.g:64:52: ^( EXPR expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// while.g:64:71: ^( DO commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_2);
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
					// while.g:65:5: ( 'foreach' Variable 'in' expression 'do' commands 'od' )
					{
					// while.g:65:5: ( 'foreach' Variable 'in' expression 'do' commands 'od' )
					// while.g:65:6: 'foreach' Variable 'in' expression 'do' commands 'od'
					{
					string_literal71=(Token)match(input,41,FOLLOW_41_in_command661);  
					stream_41.add(string_literal71);

					Variable72=(Token)match(input,Variable,FOLLOW_Variable_in_command663);  
					stream_Variable.add(Variable72);

					string_literal73=(Token)match(input,45,FOLLOW_45_in_command665);  
					stream_45.add(string_literal73);

					pushFollow(FOLLOW_expression_in_command667);
					expression74=expression();
					state._fsp--;

					stream_expression.add(expression74.getTree());
					string_literal75=(Token)match(input,37,FOLLOW_37_in_command669);  
					stream_37.add(string_literal75);

					pushFollow(FOLLOW_commands_in_command671);
					commands76=commands();
					state._fsp--;

					stream_commands.add(commands76.getTree());
					string_literal77=(Token)match(input,49,FOLLOW_49_in_command673);  
					stream_49.add(string_literal77);

					}


					// AST REWRITE
					// elements: expression, commands, Variable
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 65:60: -> ^( FOREACH Variable ^( IN expression ) ^( DO commands ) )
					{
						// while.g:65:63: ^( FOREACH Variable ^( IN expression ) ^( DO commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
						adaptor.addChild(root_1, stream_Variable.nextNode());
						// while.g:65:82: ^( IN expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// while.g:65:99: ^( DO commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_2);
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
		return retval;
	}
	// $ANTLR end "command"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// while.g:66:1: commands : command ( ';' commands )? -> command ( commands )? ;
	public final whileParser.commands_return commands() throws RecognitionException {
		whileParser.commands_return retval = new whileParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal79=null;
		ParserRuleReturnScope command78 =null;
		ParserRuleReturnScope commands80 =null;

		Object char_literal79_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// while.g:66:9: ( command ( ';' commands )? -> command ( commands )? )
			// while.g:66:11: command ( ';' commands )?
			{
			pushFollow(FOLLOW_command_in_commands699);
			command78=command();
			state._fsp--;

			stream_command.add(command78.getTree());
			// while.g:66:19: ( ';' commands )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==34) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// while.g:66:20: ';' commands
					{
					char_literal79=(Token)match(input,34,FOLLOW_34_in_commands702);  
					stream_34.add(char_literal79);

					pushFollow(FOLLOW_commands_in_commands704);
					commands80=commands();
					state._fsp--;

					stream_commands.add(commands80.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: commands, command
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:35: -> command ( commands )?
			{
				adaptor.addChild(root_0, stream_command.nextTree());
				// while.g:66:46: ( commands )?
				if ( stream_commands.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "commands"


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// while.g:68:1: program : ( function )+ ;
	public final whileParser.program_return program() throws RecognitionException {
		whileParser.program_return retval = new whileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function81 =null;


		try {
			// while.g:68:9: ( ( function )+ )
			// while.g:68:11: ( function )+
			{
			root_0 = (Object)adaptor.nil();


			// while.g:68:11: ( function )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==42) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// while.g:68:11: function
					{
					pushFollow(FOLLOW_function_in_program723);
					function81=function();
					state._fsp--;

					adaptor.addChild(root_0, function81.getTree());

					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

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

	// Delegated rules



	public static final BitSet FOLLOW_inputSub_in_input154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub166 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_inputSub169 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output180 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_output183 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_output_in_output185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_exprBase195 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_exprBase197 = new BitSet(new long[]{0x0000800024800000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase199 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_exprBase201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_exprBase212 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_exprBase214 = new BitSet(new long[]{0x0000800024800000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase216 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_exprBase218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_exprBase237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_exprBase241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_exprBase251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_exprBase266 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_exprBase268 = new BitSet(new long[]{0x0000800024800000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase270 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_exprBase272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_exprBase280 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_exprBase282 = new BitSet(new long[]{0x0000800064800000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase285 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_exprBase289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_exprBase305 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Symbol_in_exprBase307 = new BitSet(new long[]{0x0000800064800000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase310 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_exprBase314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression337 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_expression340 = new BitSet(new long[]{0x0000800024800000L});
	public static final BitSet FOLLOW_exprBase_in_expression342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr355 = new BitSet(new long[]{0x0000800024800000L});
	public static final BitSet FOLLOW_lExpr_in_lExpr357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars367 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_vars370 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Variable_in_vars374 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_expression_in_exprs398 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_exprs401 = new BitSet(new long[]{0x0000800024800000L});
	public static final BitSet FOLLOW_exprs_in_exprs403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_definition414 = new BitSet(new long[]{0x0000000014000000L});
	public static final BitSet FOLLOW_input_in_definition417 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_definition421 = new BitSet(new long[]{0x0021130004000000L});
	public static final BitSet FOLLOW_commands_in_definition423 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_definition425 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_definition427 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_output_in_definition429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_function462 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_Symbol_in_function464 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_function466 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_definition_in_function468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_command491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command502 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command504 = new BitSet(new long[]{0x0000800024800000L});
	public static final BitSet FOLLOW_exprs_in_command506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_command514 = new BitSet(new long[]{0x0000800024800000L});
	public static final BitSet FOLLOW_expression_in_command516 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_command518 = new BitSet(new long[]{0x0021130004000000L});
	public static final BitSet FOLLOW_commands_in_command522 = new BitSet(new long[]{0x000000C000000000L});
	public static final BitSet FOLLOW_38_in_command525 = new BitSet(new long[]{0x0021130004000000L});
	public static final BitSet FOLLOW_commands_in_command529 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_command531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_command561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_command591 = new BitSet(new long[]{0x0000800024800000L});
	public static final BitSet FOLLOW_expression_in_command593 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_command595 = new BitSet(new long[]{0x0021130004000000L});
	public static final BitSet FOLLOW_commands_in_command597 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_command599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_command626 = new BitSet(new long[]{0x0000800024800000L});
	public static final BitSet FOLLOW_expression_in_command628 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_command630 = new BitSet(new long[]{0x0021130004000000L});
	public static final BitSet FOLLOW_commands_in_command632 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_command634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_command661 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_Variable_in_command663 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_command665 = new BitSet(new long[]{0x0000800024800000L});
	public static final BitSet FOLLOW_expression_in_command667 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_command669 = new BitSet(new long[]{0x0021130004000000L});
	public static final BitSet FOLLOW_commands_in_command671 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_command673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands699 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_commands702 = new BitSet(new long[]{0x0021130004000000L});
	public static final BitSet FOLLOW_commands_in_commands704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program723 = new BitSet(new long[]{0x0000040000000002L});
}
