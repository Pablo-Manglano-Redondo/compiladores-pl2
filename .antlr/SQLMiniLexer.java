// Generated from c:/Users/Pablo/Desktop/compiladores-pl2-main/SQLMini.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLMiniLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SELECT=2, FROM=3, WHERE=4, ORDER=5, ASC=6, DESC=7, AND=8, OR=9, 
		LPAREN=10, RPAREN=11, COMMA=12, GT=13, GTE=14, LT=15, LTE=16, EQ=17, ID=18, 
		NUMBER=19, WS=20, ORDER_BY_FIELDS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "SELECT", "FROM", "WHERE", "ORDER", "ASC", "DESC", "AND", "OR", 
			"LPAREN", "RPAREN", "COMMA", "GT", "GTE", "LT", "LTE", "EQ", "ID", "NUMBER", 
			"WS", "ORDER_BY_FIELDS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'SELECT'", "'FROM'", "'WHERE'", "'ORDER BY'", "'ASC'", 
			"'DESC'", "'AND'", "'OR'", "'('", "')'", "','", "'>'", "'>='", "'<'", 
			"'<='", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SELECT", "FROM", "WHERE", "ORDER", "ASC", "DESC", "AND", 
			"OR", "LPAREN", "RPAREN", "COMMA", "GT", "GTE", "LT", "LTE", "EQ", "ID", 
			"NUMBER", "WS", "ORDER_BY_FIELDS"
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


	public SQLMiniLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLMini.g4"; }

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
		"\u0004\u0000\u0015\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0005\u0011m\b\u0011\n\u0011\f\u0011p\t\u0011\u0001\u0012"+
		"\u0004\u0012s\b\u0012\u000b\u0012\f\u0012t\u0001\u0013\u0004\u0013x\b"+
		"\u0013\u000b\u0013\f\u0013y\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0081\b\u0014\u0000\u0000\u0015\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000\u0004\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0086"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000\u00054"+
		"\u0001\u0000\u0000\u0000\u00079\u0001\u0000\u0000\u0000\t?\u0001\u0000"+
		"\u0000\u0000\u000bH\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000"+
		"\u000fQ\u0001\u0000\u0000\u0000\u0011U\u0001\u0000\u0000\u0000\u0013X"+
		"\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017\\\u0001"+
		"\u0000\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001b`\u0001\u0000\u0000"+
		"\u0000\u001dc\u0001\u0000\u0000\u0000\u001fe\u0001\u0000\u0000\u0000!"+
		"h\u0001\u0000\u0000\u0000#j\u0001\u0000\u0000\u0000%r\u0001\u0000\u0000"+
		"\u0000\'w\u0001\u0000\u0000\u0000)}\u0001\u0000\u0000\u0000+,\u0005*\u0000"+
		"\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005S\u0000\u0000./\u0005E\u0000"+
		"\u0000/0\u0005L\u0000\u000001\u0005E\u0000\u000012\u0005C\u0000\u0000"+
		"23\u0005T\u0000\u00003\u0004\u0001\u0000\u0000\u000045\u0005F\u0000\u0000"+
		"56\u0005R\u0000\u000067\u0005O\u0000\u000078\u0005M\u0000\u00008\u0006"+
		"\u0001\u0000\u0000\u00009:\u0005W\u0000\u0000:;\u0005H\u0000\u0000;<\u0005"+
		"E\u0000\u0000<=\u0005R\u0000\u0000=>\u0005E\u0000\u0000>\b\u0001\u0000"+
		"\u0000\u0000?@\u0005O\u0000\u0000@A\u0005R\u0000\u0000AB\u0005D\u0000"+
		"\u0000BC\u0005E\u0000\u0000CD\u0005R\u0000\u0000DE\u0005 \u0000\u0000"+
		"EF\u0005B\u0000\u0000FG\u0005Y\u0000\u0000G\n\u0001\u0000\u0000\u0000"+
		"HI\u0005A\u0000\u0000IJ\u0005S\u0000\u0000JK\u0005C\u0000\u0000K\f\u0001"+
		"\u0000\u0000\u0000LM\u0005D\u0000\u0000MN\u0005E\u0000\u0000NO\u0005S"+
		"\u0000\u0000OP\u0005C\u0000\u0000P\u000e\u0001\u0000\u0000\u0000QR\u0005"+
		"A\u0000\u0000RS\u0005N\u0000\u0000ST\u0005D\u0000\u0000T\u0010\u0001\u0000"+
		"\u0000\u0000UV\u0005O\u0000\u0000VW\u0005R\u0000\u0000W\u0012\u0001\u0000"+
		"\u0000\u0000XY\u0005(\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005"+
		")\u0000\u0000[\u0016\u0001\u0000\u0000\u0000\\]\u0005,\u0000\u0000]\u0018"+
		"\u0001\u0000\u0000\u0000^_\u0005>\u0000\u0000_\u001a\u0001\u0000\u0000"+
		"\u0000`a\u0005>\u0000\u0000ab\u0005=\u0000\u0000b\u001c\u0001\u0000\u0000"+
		"\u0000cd\u0005<\u0000\u0000d\u001e\u0001\u0000\u0000\u0000ef\u0005<\u0000"+
		"\u0000fg\u0005=\u0000\u0000g \u0001\u0000\u0000\u0000hi\u0005=\u0000\u0000"+
		"i\"\u0001\u0000\u0000\u0000jn\u0007\u0000\u0000\u0000km\u0007\u0001\u0000"+
		"\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000o$\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000qs\u0007\u0002\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000u&\u0001\u0000\u0000\u0000vx\u0007\u0003\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0006\u0013\u0000\u0000"+
		"|(\u0001\u0000\u0000\u0000}\u0080\u0003#\u0011\u0000~\u0081\u0003\u000b"+
		"\u0005\u0000\u007f\u0081\u0003\r\u0006\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081*\u0001\u0000\u0000\u0000\u0005\u0000nty\u0080\u0001\u0006"+
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