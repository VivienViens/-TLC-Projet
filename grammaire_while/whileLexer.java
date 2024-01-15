// $ANTLR 3.5.3 while.g 2023-12-01 09:48:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class whileLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public whileLexer() {} 
	public whileLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public whileLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "while.g"; }

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:2:7: ( '%' )
			// while.g:2:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:3:7: ( '(' )
			// while.g:3:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:4:7: ( ')' )
			// while.g:4:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:5:7: ( ',' )
			// while.g:5:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:6:7: ( ':' )
			// while.g:6:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:7:7: ( ':=' )
			// while.g:7:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:8:7: ( ';' )
			// while.g:8:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:9:7: ( '=?' )
			// while.g:9:9: '=?'
			{
			match("=?"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:10:7: ( 'cons' )
			// while.g:10:9: 'cons'
			{
			match("cons"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:11:7: ( 'do' )
			// while.g:11:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:12:7: ( 'else' )
			// while.g:12:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:13:7: ( 'fi' )
			// while.g:13:9: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:14:7: ( 'for' )
			// while.g:14:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:15:7: ( 'foreach' )
			// while.g:15:9: 'foreach'
			{
			match("foreach"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:16:7: ( 'function' )
			// while.g:16:9: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:17:7: ( 'hd' )
			// while.g:17:9: 'hd'
			{
			match("hd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:18:7: ( 'if' )
			// while.g:18:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:19:7: ( 'in' )
			// while.g:19:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:20:7: ( 'list' )
			// while.g:20:9: 'list'
			{
			match("list"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:21:7: ( 'nil' )
			// while.g:21:9: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:22:7: ( 'nop' )
			// while.g:22:9: 'nop'
			{
			match("nop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:23:7: ( 'od' )
			// while.g:23:9: 'od'
			{
			match("od"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:24:7: ( 'read' )
			// while.g:24:9: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:25:7: ( 'then' )
			// while.g:25:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:26:7: ( 'tl' )
			// while.g:26:9: 'tl'
			{
			match("tl"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:27:7: ( 'while' )
			// while.g:27:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:28:7: ( 'write' )
			// while.g:28:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "Maj"
	public final void mMaj() throws RecognitionException {
		try {
			int _type = Maj;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:30:5: ( 'A' .. 'Z' )
			// while.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Maj"

	// $ANTLR start "Min"
	public final void mMin() throws RecognitionException {
		try {
			int _type = Min;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:31:5: ( 'a' .. 'z' )
			// while.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Min"

	// $ANTLR start "Dec"
	public final void mDec() throws RecognitionException {
		try {
			int _type = Dec;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:32:5: ( '0' .. '9' )
			// while.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dec"

	// $ANTLR start "Variable"
	public final void mVariable() throws RecognitionException {
		try {
			int _type = Variable;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:34:10: ( Maj ( Maj | Min | Dec )* ( '!' | '?' )? )
			// while.g:34:12: Maj ( Maj | Min | Dec )* ( '!' | '?' )?
			{
			mMaj(); 

			// while.g:34:15: ( Maj | Min | Dec )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// while.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			// while.g:34:29: ( '!' | '?' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!'||LA2_0=='?') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// while.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Variable"

	// $ANTLR start "Symbol"
	public final void mSymbol() throws RecognitionException {
		try {
			int _type = Symbol;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// while.g:35:8: ( Min ( Maj | Min | Dec )* ( '!' | '?' )? )
			// while.g:35:10: Min ( Maj | Min | Dec )* ( '!' | '?' )?
			{
			mMin(); 

			// while.g:35:13: ( Maj | Min | Dec )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// while.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			// while.g:35:27: ( '!' | '?' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!'||LA4_0=='?') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// while.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Symbol"

	@Override
	public void mTokens() throws RecognitionException {
		// while.g:1:8: ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | Maj | Min | Dec | Variable | Symbol )
		int alt5=32;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// while.g:1:10: T__28
				{
				mT__28(); 

				}
				break;
			case 2 :
				// while.g:1:16: T__29
				{
				mT__29(); 

				}
				break;
			case 3 :
				// while.g:1:22: T__30
				{
				mT__30(); 

				}
				break;
			case 4 :
				// while.g:1:28: T__31
				{
				mT__31(); 

				}
				break;
			case 5 :
				// while.g:1:34: T__32
				{
				mT__32(); 

				}
				break;
			case 6 :
				// while.g:1:40: T__33
				{
				mT__33(); 

				}
				break;
			case 7 :
				// while.g:1:46: T__34
				{
				mT__34(); 

				}
				break;
			case 8 :
				// while.g:1:52: T__35
				{
				mT__35(); 

				}
				break;
			case 9 :
				// while.g:1:58: T__36
				{
				mT__36(); 

				}
				break;
			case 10 :
				// while.g:1:64: T__37
				{
				mT__37(); 

				}
				break;
			case 11 :
				// while.g:1:70: T__38
				{
				mT__38(); 

				}
				break;
			case 12 :
				// while.g:1:76: T__39
				{
				mT__39(); 

				}
				break;
			case 13 :
				// while.g:1:82: T__40
				{
				mT__40(); 

				}
				break;
			case 14 :
				// while.g:1:88: T__41
				{
				mT__41(); 

				}
				break;
			case 15 :
				// while.g:1:94: T__42
				{
				mT__42(); 

				}
				break;
			case 16 :
				// while.g:1:100: T__43
				{
				mT__43(); 

				}
				break;
			case 17 :
				// while.g:1:106: T__44
				{
				mT__44(); 

				}
				break;
			case 18 :
				// while.g:1:112: T__45
				{
				mT__45(); 

				}
				break;
			case 19 :
				// while.g:1:118: T__46
				{
				mT__46(); 

				}
				break;
			case 20 :
				// while.g:1:124: T__47
				{
				mT__47(); 

				}
				break;
			case 21 :
				// while.g:1:130: T__48
				{
				mT__48(); 

				}
				break;
			case 22 :
				// while.g:1:136: T__49
				{
				mT__49(); 

				}
				break;
			case 23 :
				// while.g:1:142: T__50
				{
				mT__50(); 

				}
				break;
			case 24 :
				// while.g:1:148: T__51
				{
				mT__51(); 

				}
				break;
			case 25 :
				// while.g:1:154: T__52
				{
				mT__52(); 

				}
				break;
			case 26 :
				// while.g:1:160: T__53
				{
				mT__53(); 

				}
				break;
			case 27 :
				// while.g:1:166: T__54
				{
				mT__54(); 

				}
				break;
			case 28 :
				// while.g:1:172: Maj
				{
				mMaj(); 

				}
				break;
			case 29 :
				// while.g:1:176: Min
				{
				mMin(); 

				}
				break;
			case 30 :
				// while.g:1:180: Dec
				{
				mDec(); 

				}
				break;
			case 31 :
				// while.g:1:184: Variable
				{
				mVariable(); 

				}
				break;
			case 32 :
				// while.g:1:193: Symbol
				{
				mSymbol(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\5\uffff\1\30\2\uffff\14\32\1\55\1\32\3\uffff\1\33\2\uffff\1\60\1\33\1"+
		"\62\2\33\1\65\1\66\1\67\3\33\1\73\2\33\1\76\2\33\2\uffff\1\33\1\uffff"+
		"\1\33\1\uffff\1\104\1\33\3\uffff\1\33\1\107\1\110\1\uffff\2\33\1\uffff"+
		"\2\33\1\115\1\116\1\33\1\uffff\1\33\1\121\2\uffff\1\122\1\123\2\33\2\uffff"+
		"\2\33\3\uffff\1\130\1\131\2\33\2\uffff\1\134\1\33\1\uffff\1\136\1\uffff";
	static final String DFA5_eofS =
		"\137\uffff";
	static final String DFA5_minS =
		"\1\45\4\uffff\1\75\2\uffff\16\41\3\uffff\1\156\2\uffff\1\41\1\163\1\41"+
		"\1\162\1\156\3\41\1\163\1\154\1\160\1\41\1\141\1\145\1\41\2\151\2\uffff"+
		"\1\163\1\uffff\1\145\1\uffff\1\41\1\143\3\uffff\1\164\2\41\1\uffff\1\144"+
		"\1\156\1\uffff\1\154\1\164\2\41\1\141\1\uffff\1\164\1\41\2\uffff\2\41"+
		"\2\145\2\uffff\1\143\1\151\3\uffff\2\41\1\150\1\157\2\uffff\1\41\1\156"+
		"\1\uffff\1\41\1\uffff";
	static final String DFA5_maxS =
		"\1\172\4\uffff\1\75\2\uffff\16\172\3\uffff\1\156\2\uffff\1\172\1\163\1"+
		"\172\1\162\1\156\3\172\1\163\1\154\1\160\1\172\1\141\1\145\1\172\2\151"+
		"\2\uffff\1\163\1\uffff\1\145\1\uffff\1\172\1\143\3\uffff\1\164\2\172\1"+
		"\uffff\1\144\1\156\1\uffff\1\154\1\164\2\172\1\141\1\uffff\1\164\1\172"+
		"\2\uffff\2\172\2\145\2\uffff\1\143\1\151\3\uffff\2\172\1\150\1\157\2\uffff"+
		"\1\172\1\156\1\uffff\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\16\uffff\1\36\1\6\1\5\1\uffff"+
		"\1\35\1\40\21\uffff\1\34\1\37\1\uffff\1\12\1\uffff\1\14\2\uffff\1\20\1"+
		"\21\1\22\3\uffff\1\26\2\uffff\1\31\5\uffff\1\15\2\uffff\1\24\1\25\4\uffff"+
		"\1\11\1\13\2\uffff\1\23\1\27\1\30\4\uffff\1\32\1\33\2\uffff\1\16\1\uffff"+
		"\1\17";
	static final String DFA5_specialS =
		"\137\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\1\2\uffff\1\2\1\3\2\uffff\1\4\3\uffff\12\26\1\5\1\6\1\uffff\1\7\3"+
			"\uffff\32\24\6\uffff\2\25\1\10\1\11\1\12\1\13\1\25\1\14\1\15\2\25\1\16"+
			"\1\25\1\17\1\20\2\25\1\21\1\25\1\22\2\25\1\23\3\25",
			"",
			"",
			"",
			"",
			"\1\27",
			"",
			"",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\16\33\1\31\13"+
			"\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\16\33\1\34\13"+
			"\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\13\33\1\35\16"+
			"\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\10\33\1\36\5"+
			"\33\1\37\5\33\1\40\5\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\3\33\1\41\26"+
			"\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\5\33\1\42\7"+
			"\33\1\43\14\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\10\33\1\44\21"+
			"\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\10\33\1\45\5"+
			"\33\1\46\13\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\3\33\1\47\26"+
			"\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\4\33\1\50\25"+
			"\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\7\33\1\51\3"+
			"\33\1\52\16\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\7\33\1\53\11"+
			"\33\1\54\10\33",
			"\1\56\16\uffff\12\56\5\uffff\1\56\1\uffff\32\56\6\uffff\32\56",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"",
			"",
			"",
			"\1\57",
			"",
			"",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\61",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\63",
			"\1\64",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\74",
			"\1\75",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\77",
			"\1\100",
			"",
			"",
			"\1\101",
			"",
			"\1\102",
			"",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\4\33\1\103\25"+
			"\33",
			"\1\105",
			"",
			"",
			"",
			"\1\106",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"",
			"\1\111",
			"\1\112",
			"",
			"\1\113",
			"\1\114",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\117",
			"",
			"\1\120",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"",
			"",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\124",
			"\1\125",
			"",
			"",
			"\1\126",
			"\1\127",
			"",
			"",
			"",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\132",
			"\1\133",
			"",
			"",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			"\1\135",
			"",
			"\1\33\16\uffff\12\33\5\uffff\1\33\1\uffff\32\33\6\uffff\32\33",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | Maj | Min | Dec | Variable | Symbol );";
		}
	}

}
