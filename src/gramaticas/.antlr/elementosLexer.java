// Generated from w:/Apps/antlr/gramaticas/elementos.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class elementosLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PI=1, PD=2, ID=3, INT=4, IF=5, IDz=6, IDf=7, ENTERO=8, FLOTANTES=9, CADENA=10, 
		COM_LINEA=11, COM_BLOQUE=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PI", "PD", "ID", "INT", "IF", "IDz", "IDf", "ID_LETRA", "DIGITO", "ENTERO", 
			"FLOTANTES", "CADENA", "ESC", "COM_LINEA", "COM_BLOQUE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, "'if'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PI", "PD", "ID", "INT", "IF", "IDz", "IDf", "ENTERO", "FLOTANTES", 
			"CADENA", "COM_LINEA", "COM_BLOQUE", "WS"
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


	public elementosLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "elementos.g4"; }

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
		"\u0004\u0000\r\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0004\u0002\'\b\u0002\u000b\u0002\f\u0002(\u0001\u0003\u0004\u0003"+
		",\b\u0003\u000b\u0003\f\u0003-\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u00069\b\u0006\n\u0006\f\u0006<\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0004\tC\b\t\u000b\t\f\tD\u0001\n\u0004\nH\b\n\u000b"+
		"\n\f\nI\u0001\n\u0001\n\u0004\nN\b\n\u000b\n\f\nO\u0001\n\u0001\n\u0004"+
		"\nT\b\n\u000b\n\f\nU\u0003\nX\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b]\b\u000b\n\u000b\f\u000b`\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\rk\b\r"+
		"\n\r\f\rn\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000ex\b\u000e\n\u000e\f\u000e{\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0004\u000f\u0083\b\u000f\u000b\u000f\f\u000f\u0084\u0001\u000f\u0001"+
		"\u000f\u0003^ly\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\u0000\u0011\u0000\u0013\b\u0015"+
		"\t\u0017\n\u0019\u0000\u001b\u000b\u001d\f\u001f\r\u0001\u0000\u0005\u0002"+
		"\u0000AZaz\u0001\u000009\u0003\u000009AZaz\u0006\u0000\"\"\\\\bbnnrrt"+
		"t\u0002\u0000\t\n\r\r\u0092\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001"+
		"\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000"+
		"\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005&\u0001\u0000\u0000\u0000"+
		"\u0007+\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b2\u0001"+
		"\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f=\u0001\u0000\u0000"+
		"\u0000\u0011?\u0001\u0000\u0000\u0000\u0013B\u0001\u0000\u0000\u0000\u0015"+
		"W\u0001\u0000\u0000\u0000\u0017Y\u0001\u0000\u0000\u0000\u0019c\u0001"+
		"\u0000\u0000\u0000\u001bf\u0001\u0000\u0000\u0000\u001ds\u0001\u0000\u0000"+
		"\u0000\u001f\u0082\u0001\u0000\u0000\u0000!\"\u0005(\u0000\u0000\"\u0002"+
		"\u0001\u0000\u0000\u0000#$\u0005)\u0000\u0000$\u0004\u0001\u0000\u0000"+
		"\u0000%\'\u0007\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\u0006"+
		"\u0001\u0000\u0000\u0000*,\u0007\u0001\u0000\u0000+*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.\b\u0001\u0000\u0000\u0000/0\u0005i\u0000\u000001\u0005f"+
		"\u0000\u00001\n\u0001\u0000\u0000\u000023\u0007\u0000\u0000\u000034\u0007"+
		"\u0002\u0000\u00004\f\u0001\u0000\u0000\u00005:\u0003\u000f\u0007\u0000"+
		"69\u0003\u000f\u0007\u000079\u0003\u0011\b\u000086\u0001\u0000\u0000\u0000"+
		"87\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;\u000e\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000=>\u0007\u0000\u0000\u0000>\u0010\u0001\u0000\u0000"+
		"\u0000?@\u0007\u0001\u0000\u0000@\u0012\u0001\u0000\u0000\u0000AC\u0003"+
		"\u0011\b\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0014\u0001\u0000\u0000"+
		"\u0000FH\u0003\u0011\b\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KM\u0005.\u0000\u0000LN\u0003\u0011\b\u0000ML\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PX\u0001\u0000\u0000\u0000QS\u0005.\u0000\u0000RT\u0003"+
		"\u0011\b\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000"+
		"WG\u0001\u0000\u0000\u0000WQ\u0001\u0000\u0000\u0000X\u0016\u0001\u0000"+
		"\u0000\u0000Y^\u0005\"\u0000\u0000Z]\u0003\u0019\f\u0000[]\t\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_a\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005\"\u0000\u0000b\u0018"+
		"\u0001\u0000\u0000\u0000cd\u0005\\\u0000\u0000de\u0007\u0003\u0000\u0000"+
		"e\u001a\u0001\u0000\u0000\u0000fg\u0005/\u0000\u0000gh\u0005/\u0000\u0000"+
		"hl\u0001\u0000\u0000\u0000ik\t\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"kn\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005\n\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0006\r\u0000\u0000r\u001c\u0001\u0000"+
		"\u0000\u0000st\u0005/\u0000\u0000tu\u0005*\u0000\u0000uy\u0001\u0000\u0000"+
		"\u0000vx\t\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005*\u0000\u0000}~\u0005/\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0006\u000e\u0000\u0000"+
		"\u0080\u001e\u0001\u0000\u0000\u0000\u0081\u0083\u0007\u0004\u0000\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0006\u000f\u0000\u0000"+
		"\u0087 \u0001\u0000\u0000\u0000\u000f\u0000(-8:DIOUW\\^ly\u0084\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}