// Generated from /home/ssierra/uah/compiladores-pl2/src/Linguine.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LinguineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LET=6, IF=7, THEN=8, ELSE=9, MATCH=10, 
		WITH=11, ARROW=12, SEMICOLON=13, COMMA=14, QUESTION=15, SHOW=16, FUN=17, 
		ID=18, NUMBER=19, LPAREN=20, RPAREN=21, MINUS=22, GT=23, LT=24, GTE=25, 
		LTE=26, AND=27, OR=28, PIPE=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "LET", "IF", "THEN", "ELSE", 
			"MATCH", "WITH", "ARROW", "SEMICOLON", "COMMA", "QUESTION", "SHOW", "FUN", 
			"ID", "NUMBER", "LPAREN", "RPAREN", "MINUS", "GT", "LT", "GTE", "LTE", 
			"AND", "OR", "PIPE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'*'", "'/'", "'%'", "'let'", "'if'", "'then'", "'else'", 
			"'match'", "'with'", "'->'", "';'", "','", "'?'", "'show'", "'fun'", 
			null, null, "'('", "')'", "'-'", "'>'", "'<'", "'>='", "'<='", "'AND'", 
			"'OR'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "LET", "IF", "THEN", "ELSE", "MATCH", 
			"WITH", "ARROW", "SEMICOLON", "COMMA", "QUESTION", "SHOW", "FUN", "ID", 
			"NUMBER", "LPAREN", "RPAREN", "MINUS", "GT", "LT", "GTE", "LTE", "AND", 
			"OR", "PIPE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LinguineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Linguine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001e\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011x\b\u0011\n\u0011"+
		"\f\u0011{\t\u0011\u0001\u0012\u0004\u0012~\b\u0012\u000b\u0012\f\u0012"+
		"\u007f\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0004\u001d\u009c\b\u001d\u000b\u001d\f"+
		"\u001d\u009d\u0001\u001d\u0001\u001d\u0000\u0000\u001e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e\u0001\u0000\u0004\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u00a3\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0001=\u0001\u0000\u0000\u0000"+
		"\u0003?\u0001\u0000\u0000\u0000\u0005A\u0001\u0000\u0000\u0000\u0007C"+
		"\u0001\u0000\u0000\u0000\tE\u0001\u0000\u0000\u0000\u000bG\u0001\u0000"+
		"\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000\u0000"+
		"\u0011S\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000\u0015^"+
		"\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019f\u0001\u0000"+
		"\u0000\u0000\u001bh\u0001\u0000\u0000\u0000\u001dj\u0001\u0000\u0000\u0000"+
		"\u001fl\u0001\u0000\u0000\u0000!q\u0001\u0000\u0000\u0000#u\u0001\u0000"+
		"\u0000\u0000%}\u0001\u0000\u0000\u0000\'\u0081\u0001\u0000\u0000\u0000"+
		")\u0083\u0001\u0000\u0000\u0000+\u0085\u0001\u0000\u0000\u0000-\u0087"+
		"\u0001\u0000\u0000\u0000/\u0089\u0001\u0000\u0000\u00001\u008b\u0001\u0000"+
		"\u0000\u00003\u008e\u0001\u0000\u0000\u00005\u0091\u0001\u0000\u0000\u0000"+
		"7\u0095\u0001\u0000\u0000\u00009\u0098\u0001\u0000\u0000\u0000;\u009b"+
		"\u0001\u0000\u0000\u0000=>\u0005=\u0000\u0000>\u0002\u0001\u0000\u0000"+
		"\u0000?@\u0005+\u0000\u0000@\u0004\u0001\u0000\u0000\u0000AB\u0005*\u0000"+
		"\u0000B\u0006\u0001\u0000\u0000\u0000CD\u0005/\u0000\u0000D\b\u0001\u0000"+
		"\u0000\u0000EF\u0005%\u0000\u0000F\n\u0001\u0000\u0000\u0000GH\u0005l"+
		"\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005t\u0000\u0000J\f\u0001\u0000"+
		"\u0000\u0000KL\u0005i\u0000\u0000LM\u0005f\u0000\u0000M\u000e\u0001\u0000"+
		"\u0000\u0000NO\u0005t\u0000\u0000OP\u0005h\u0000\u0000PQ\u0005e\u0000"+
		"\u0000QR\u0005n\u0000\u0000R\u0010\u0001\u0000\u0000\u0000ST\u0005e\u0000"+
		"\u0000TU\u0005l\u0000\u0000UV\u0005s\u0000\u0000VW\u0005e\u0000\u0000"+
		"W\u0012\u0001\u0000\u0000\u0000XY\u0005m\u0000\u0000YZ\u0005a\u0000\u0000"+
		"Z[\u0005t\u0000\u0000[\\\u0005c\u0000\u0000\\]\u0005h\u0000\u0000]\u0014"+
		"\u0001\u0000\u0000\u0000^_\u0005w\u0000\u0000_`\u0005i\u0000\u0000`a\u0005"+
		"t\u0000\u0000ab\u0005h\u0000\u0000b\u0016\u0001\u0000\u0000\u0000cd\u0005"+
		"-\u0000\u0000de\u0005>\u0000\u0000e\u0018\u0001\u0000\u0000\u0000fg\u0005"+
		";\u0000\u0000g\u001a\u0001\u0000\u0000\u0000hi\u0005,\u0000\u0000i\u001c"+
		"\u0001\u0000\u0000\u0000jk\u0005?\u0000\u0000k\u001e\u0001\u0000\u0000"+
		"\u0000lm\u0005s\u0000\u0000mn\u0005h\u0000\u0000no\u0005o\u0000\u0000"+
		"op\u0005w\u0000\u0000p \u0001\u0000\u0000\u0000qr\u0005f\u0000\u0000r"+
		"s\u0005u\u0000\u0000st\u0005n\u0000\u0000t\"\u0001\u0000\u0000\u0000u"+
		"y\u0007\u0000\u0000\u0000vx\u0007\u0001\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z$\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0007"+
		"\u0002\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080&\u0001\u0000\u0000\u0000\u0081\u0082\u0005(\u0000\u0000\u0082("+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005)\u0000\u0000\u0084*\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005-\u0000\u0000\u0086,\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005>\u0000\u0000\u0088.\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005<\u0000\u0000\u008a0\u0001\u0000\u0000\u0000\u008b\u008c\u0005>"+
		"\u0000\u0000\u008c\u008d\u0005=\u0000\u0000\u008d2\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005<\u0000\u0000\u008f\u0090\u0005=\u0000\u0000\u00904"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005A\u0000\u0000\u0092\u0093\u0005"+
		"N\u0000\u0000\u0093\u0094\u0005D\u0000\u0000\u00946\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005O\u0000\u0000\u0096\u0097\u0005R\u0000\u0000\u0097"+
		"8\u0001\u0000\u0000\u0000\u0098\u0099\u0005|\u0000\u0000\u0099:\u0001"+
		"\u0000\u0000\u0000\u009a\u009c\u0007\u0003\u0000\u0000\u009b\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0006\u001d\u0000\u0000\u00a0<\u0001\u0000"+
		"\u0000\u0000\u0004\u0000y\u007f\u009d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}