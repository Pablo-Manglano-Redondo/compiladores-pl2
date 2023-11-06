// Generated from ./sqlgLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class sqlgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, COMPARACION=3, WS=4, BL=5, SELECT=6, FROM=7, COMA=8, WHERE=9, 
		ORDER=10, DIRECCION=11, TEXTO=12, ALL=13, INT=14, FLOTANTES=15, APAR=16, 
		CPAR=17, COMILLA=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "COMPARACION", "WS", "BL", "SELECT", "FROM", "COMA", "WHERE", 
			"ORDER", "DIRECCION", "TEXTO", "ALL", "INT", "FLOTANTES", "APAR", "CPAR", 
			"COMILLA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AND'", null, null, null, null, "'SELECT'", "'FROM'", "','", "'WHERE'", 
			"'ORDER BY'", null, null, "'*'", null, null, "'('", "')'", "'\\u2019'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "COMPARACION", "WS", "BL", "SELECT", "FROM", "COMA", 
			"WHERE", "ORDER", "DIRECCION", "TEXTO", "ALL", "INT", "FLOTANTES", "APAR", 
			"CPAR", "COMILLA"
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


	public sqlgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sqlgLexer.g4"; }

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
		"\u0004\u0000\u0012\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"7\b\u0002\u0001\u0003\u0004\u0003:\b\u0003\u000b\u0003\f\u0003;\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0004\u0004A\b\u0004\u000b\u0004\f\u0004"+
		"B\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\nk\b\n\u0001\u000b\u0004\u000bn\b\u000b\u000b\u000b\f"+
		"\u000bo\u0001\f\u0001\f\u0001\r\u0004\ru\b\r\u000b\r\f\rv\u0001\u000e"+
		"\u0004\u000ez\b\u000e\u000b\u000e\f\u000e{\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u0080\b\u000e\u000b\u000e\f\u000e\u0081\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0004\u0002\u0000<<>>\u0002"+
		"\u0000\b\n\r\r\u0003\u000009AZaz\u0001\u000009\u0094\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003)"+
		"\u0001\u0000\u0000\u0000\u00056\u0001\u0000\u0000\u0000\u00079\u0001\u0000"+
		"\u0000\u0000\t@\u0001\u0000\u0000\u0000\u000bF\u0001\u0000\u0000\u0000"+
		"\rM\u0001\u0000\u0000\u0000\u000fR\u0001\u0000\u0000\u0000\u0011T\u0001"+
		"\u0000\u0000\u0000\u0013Z\u0001\u0000\u0000\u0000\u0015j\u0001\u0000\u0000"+
		"\u0000\u0017m\u0001\u0000\u0000\u0000\u0019q\u0001\u0000\u0000\u0000\u001b"+
		"t\u0001\u0000\u0000\u0000\u001dy\u0001\u0000\u0000\u0000\u001f\u0083\u0001"+
		"\u0000\u0000\u0000!\u0085\u0001\u0000\u0000\u0000#\u0087\u0001\u0000\u0000"+
		"\u0000%&\u0005A\u0000\u0000&\'\u0005N\u0000\u0000\'(\u0005D\u0000\u0000"+
		"(\u0002\u0001\u0000\u0000\u0000)*\u0005O\u0000\u0000*+\u0005R\u0000\u0000"+
		"+\u0004\u0001\u0000\u0000\u0000,7\u0007\u0000\u0000\u0000-.\u0005=\u0000"+
		"\u0000.7\u0005=\u0000\u0000/0\u0005!\u0000\u000007\u0005=\u0000\u0000"+
		"12\u0005>\u0000\u000027\u0005=\u0000\u000034\u0005<\u0000\u000047\u0005"+
		"=\u0000\u000057\u0005=\u0000\u00006,\u0001\u0000\u0000\u00006-\u0001\u0000"+
		"\u0000\u00006/\u0001\u0000\u0000\u000061\u0001\u0000\u0000\u000063\u0001"+
		"\u0000\u0000\u000065\u0001\u0000\u0000\u00007\u0006\u0001\u0000\u0000"+
		"\u00008:\u0007\u0001\u0000\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=>\u0006\u0003\u0000\u0000>\b\u0001\u0000\u0000\u0000"+
		"?A\u0005 \u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DE\u0006\u0004\u0000\u0000E\n\u0001\u0000\u0000\u0000FG\u0005S\u0000"+
		"\u0000GH\u0005E\u0000\u0000HI\u0005L\u0000\u0000IJ\u0005E\u0000\u0000"+
		"JK\u0005C\u0000\u0000KL\u0005T\u0000\u0000L\f\u0001\u0000\u0000\u0000"+
		"MN\u0005F\u0000\u0000NO\u0005R\u0000\u0000OP\u0005O\u0000\u0000PQ\u0005"+
		"M\u0000\u0000Q\u000e\u0001\u0000\u0000\u0000RS\u0005,\u0000\u0000S\u0010"+
		"\u0001\u0000\u0000\u0000TU\u0005W\u0000\u0000UV\u0005H\u0000\u0000VW\u0005"+
		"E\u0000\u0000WX\u0005R\u0000\u0000XY\u0005E\u0000\u0000Y\u0012\u0001\u0000"+
		"\u0000\u0000Z[\u0005O\u0000\u0000[\\\u0005R\u0000\u0000\\]\u0005D\u0000"+
		"\u0000]^\u0005E\u0000\u0000^_\u0005R\u0000\u0000_`\u0005 \u0000\u0000"+
		"`a\u0005B\u0000\u0000ab\u0005Y\u0000\u0000b\u0014\u0001\u0000\u0000\u0000"+
		"cd\u0005A\u0000\u0000de\u0005S\u0000\u0000ek\u0005C\u0000\u0000fg\u0005"+
		"D\u0000\u0000gh\u0005E\u0000\u0000hi\u0005S\u0000\u0000ik\u0005C\u0000"+
		"\u0000jc\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000k\u0016\u0001"+
		"\u0000\u0000\u0000ln\u0007\u0002\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000p\u0018\u0001\u0000\u0000\u0000qr\u0005*\u0000\u0000r\u001a\u0001"+
		"\u0000\u0000\u0000su\u0007\u0003\u0000\u0000ts\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000w\u001c\u0001\u0000\u0000\u0000xz\u0003\u001b\r\u0000yx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0005.\u0000\u0000"+
		"~\u0080\u0003\u001b\r\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u001e\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005(\u0000\u0000\u0084 \u0001\u0000\u0000\u0000\u0085\u0086\u0005)"+
		"\u0000\u0000\u0086\"\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u2019\u0000"+
		"\u0000\u0088$\u0001\u0000\u0000\u0000\t\u00006;Bjov{\u0081\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}