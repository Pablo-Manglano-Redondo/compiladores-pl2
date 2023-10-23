// Generated from c:/Users/Pablo/Desktop/compiladores-pl2/Codigo/SQLMini.g4 by ANTLR 4.13.1
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
		T__0=1, SELECT=2, FROM=3, WHERE=4, ORDER=5, ASC=6, DESC=7, COMMA=8, LPAREN=9, 
		RPAREN=10, GT=11, GTE=12, LT=13, LTE=14, AND=15, OR=16, NOT=17, ID=18, 
		NUMBER=19, STRING=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "SELECT", "FROM", "WHERE", "ORDER", "ASC", "DESC", "COMMA", "LPAREN", 
			"RPAREN", "GT", "GTE", "LT", "LTE", "AND", "OR", "NOT", "ID", "NUMBER", 
			"STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'SELECT'", "'FROM'", "'WHERE'", "'ORDER BY'", "'ASC'", 
			"'DESC'", "','", "'('", "')'", "'>'", "'>='", "'<'", "'<='", "'AND'", 
			"'OR'", "'NOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SELECT", "FROM", "WHERE", "ORDER", "ASC", "DESC", "COMMA", 
			"LPAREN", "RPAREN", "GT", "GTE", "LT", "LTE", "AND", "OR", "NOT", "ID", 
			"NUMBER", "STRING"
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
		"\u0004\u0000\u0014\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0005\u0011m\b\u0011\n\u0011\f\u0011p\t\u0011\u0001"+
		"\u0012\u0004\u0012s\b\u0012\u000b\u0012\f\u0012t\u0001\u0013\u0001\u0013"+
		"\u0005\u0013y\b\u0013\n\u0013\f\u0013|\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001"+
		"\u0000\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0001"+
		"\u0000\'\'\u0081\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001"+
		"\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u00052\u0001\u0000\u0000"+
		"\u0000\u00077\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000b"+
		"F\u0001\u0000\u0000\u0000\rJ\u0001\u0000\u0000\u0000\u000fO\u0001\u0000"+
		"\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000\u0013S\u0001\u0000\u0000\u0000"+
		"\u0015U\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000\u0000\u0019Z"+
		"\u0001\u0000\u0000\u0000\u001b\\\u0001\u0000\u0000\u0000\u001d_\u0001"+
		"\u0000\u0000\u0000\u001fc\u0001\u0000\u0000\u0000!f\u0001\u0000\u0000"+
		"\u0000#j\u0001\u0000\u0000\u0000%r\u0001\u0000\u0000\u0000\'v\u0001\u0000"+
		"\u0000\u0000)*\u0005*\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005"+
		"S\u0000\u0000,-\u0005E\u0000\u0000-.\u0005L\u0000\u0000./\u0005E\u0000"+
		"\u0000/0\u0005C\u0000\u000001\u0005T\u0000\u00001\u0004\u0001\u0000\u0000"+
		"\u000023\u0005F\u0000\u000034\u0005R\u0000\u000045\u0005O\u0000\u0000"+
		"56\u0005M\u0000\u00006\u0006\u0001\u0000\u0000\u000078\u0005W\u0000\u0000"+
		"89\u0005H\u0000\u00009:\u0005E\u0000\u0000:;\u0005R\u0000\u0000;<\u0005"+
		"E\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005O\u0000\u0000>?\u0005"+
		"R\u0000\u0000?@\u0005D\u0000\u0000@A\u0005E\u0000\u0000AB\u0005R\u0000"+
		"\u0000BC\u0005 \u0000\u0000CD\u0005B\u0000\u0000DE\u0005Y\u0000\u0000"+
		"E\n\u0001\u0000\u0000\u0000FG\u0005A\u0000\u0000GH\u0005S\u0000\u0000"+
		"HI\u0005C\u0000\u0000I\f\u0001\u0000\u0000\u0000JK\u0005D\u0000\u0000"+
		"KL\u0005E\u0000\u0000LM\u0005S\u0000\u0000MN\u0005C\u0000\u0000N\u000e"+
		"\u0001\u0000\u0000\u0000OP\u0005,\u0000\u0000P\u0010\u0001\u0000\u0000"+
		"\u0000QR\u0005(\u0000\u0000R\u0012\u0001\u0000\u0000\u0000ST\u0005)\u0000"+
		"\u0000T\u0014\u0001\u0000\u0000\u0000UV\u0005>\u0000\u0000V\u0016\u0001"+
		"\u0000\u0000\u0000WX\u0005>\u0000\u0000XY\u0005=\u0000\u0000Y\u0018\u0001"+
		"\u0000\u0000\u0000Z[\u0005<\u0000\u0000[\u001a\u0001\u0000\u0000\u0000"+
		"\\]\u0005<\u0000\u0000]^\u0005=\u0000\u0000^\u001c\u0001\u0000\u0000\u0000"+
		"_`\u0005A\u0000\u0000`a\u0005N\u0000\u0000ab\u0005D\u0000\u0000b\u001e"+
		"\u0001\u0000\u0000\u0000cd\u0005O\u0000\u0000de\u0005R\u0000\u0000e \u0001"+
		"\u0000\u0000\u0000fg\u0005N\u0000\u0000gh\u0005O\u0000\u0000hi\u0005T"+
		"\u0000\u0000i\"\u0001\u0000\u0000\u0000jn\u0007\u0000\u0000\u0000km\u0007"+
		"\u0001\u0000\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o$\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000qs\u0007\u0002\u0000\u0000rq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000u&\u0001\u0000\u0000\u0000vz\u0005\'\u0000\u0000wy\b"+
		"\u0003\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000}~\u0005\'\u0000\u0000~(\u0001\u0000\u0000"+
		"\u0000\u0004\u0000ntz\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}