// Generated from ./sqlgParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class sqlgParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, COMPARACION=3, WS=4, BL=5, SELECT=6, FROM=7, COMA=8, WHERE=9, 
		ORDER=10, DIRECCION=11, TEXTO=12, ALL=13, INT=14, FLOTANTES=15, APAR=16, 
		CPAR=17, COMILLA=18;
	public static final int
		RULE_fichero = 0, RULE_consulta = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"fichero", "consulta", "expr"
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

	@Override
	public String getGrammarFileName() { return "sqlgParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sqlgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FicheroContext extends ParserRuleContext {
		public List<ConsultaContext> consulta() {
			return getRuleContexts(ConsultaContext.class);
		}
		public ConsultaContext consulta(int i) {
			return getRuleContext(ConsultaContext.class,i);
		}
		public FicheroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fichero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlgParserListener ) ((sqlgParserListener)listener).enterFichero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlgParserListener ) ((sqlgParserListener)listener).exitFichero(this);
		}
	}

	public final FicheroContext fichero() throws RecognitionException {
		FicheroContext _localctx = new FicheroContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fichero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT) {
				{
				{
				setState(6);
				consulta();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConsultaContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(sqlgParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(sqlgParser.FROM, 0); }
		public List<TerminalNode> TEXTO() { return getTokens(sqlgParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(sqlgParser.TEXTO, i);
		}
		public TerminalNode ALL() { return getToken(sqlgParser.ALL, 0); }
		public TerminalNode WHERE() { return getToken(sqlgParser.WHERE, 0); }
		public TerminalNode ORDER() { return getToken(sqlgParser.ORDER, 0); }
		public TerminalNode DIRECCION() { return getToken(sqlgParser.DIRECCION, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(sqlgParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(sqlgParser.COMA, i);
		}
		public ConsultaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consulta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlgParserListener ) ((sqlgParserListener)listener).enterConsulta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlgParserListener ) ((sqlgParserListener)listener).exitConsulta(this);
		}
	}

	public final ConsultaContext consulta() throws RecognitionException {
		ConsultaContext _localctx = new ConsultaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_consulta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(SELECT);
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				{
				{
				setState(13);
				match(TEXTO);
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(14);
					match(COMA);
					setState(15);
					match(TEXTO);
					}
					}
					setState(20);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ALL:
				{
				setState(21);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(24);
			match(FROM);
			setState(25);
			match(TEXTO);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(26);
				match(WHERE);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 380928L) != 0)) {
					{
					{
					setState(27);
					expr(0);
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(35);
				match(ORDER);
				setState(36);
				match(TEXTO);
				setState(37);
				match(DIRECCION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(sqlgParser.INT, 0); }
		public TerminalNode FLOTANTES() { return getToken(sqlgParser.FLOTANTES, 0); }
		public TerminalNode TEXTO() { return getToken(sqlgParser.TEXTO, 0); }
		public TerminalNode APAR() { return getToken(sqlgParser.APAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CPAR() { return getToken(sqlgParser.CPAR, 0); }
		public List<TerminalNode> COMILLA() { return getTokens(sqlgParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(sqlgParser.COMILLA, i);
		}
		public TerminalNode COMPARACION() { return getToken(sqlgParser.COMPARACION, 0); }
		public TerminalNode AND() { return getToken(sqlgParser.AND, 0); }
		public TerminalNode OR() { return getToken(sqlgParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqlgParserListener ) ((sqlgParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqlgParserListener ) ((sqlgParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(41);
				match(INT);
				}
				break;
			case FLOTANTES:
				{
				setState(42);
				match(FLOTANTES);
				}
				break;
			case TEXTO:
				{
				setState(43);
				match(TEXTO);
				}
				break;
			case APAR:
				{
				setState(44);
				match(APAR);
				setState(45);
				expr(0);
				setState(46);
				match(CPAR);
				}
				break;
			case COMILLA:
				{
				setState(48);
				match(COMILLA);
				setState(49);
				expr(0);
				setState(50);
				match(COMILLA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(63);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(55);
						match(COMPARACION);
						setState(56);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(58);
						match(AND);
						setState(59);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(61);
						match(OR);
						setState(62);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012E\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0005\u0000\b\b\u0000\n\u0000\f\u0000\u000b"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0011"+
		"\b\u0001\n\u0001\f\u0001\u0014\t\u0001\u0001\u0001\u0003\u0001\u0017\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001d"+
		"\b\u0001\n\u0001\f\u0001 \t\u0001\u0003\u0001\"\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002@\b\u0002\n\u0002\f\u0002C\t"+
		"\u0002\u0001\u0002\u0000\u0001\u0004\u0003\u0000\u0002\u0004\u0000\u0000"+
		"N\u0000\t\u0001\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004"+
		"4\u0001\u0000\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000\u0007\u0006"+
		"\u0001\u0000\u0000\u0000\b\u000b\u0001\u0000\u0000\u0000\t\u0007\u0001"+
		"\u0000\u0000\u0000\t\n\u0001\u0000\u0000\u0000\n\u0001\u0001\u0000\u0000"+
		"\u0000\u000b\t\u0001\u0000\u0000\u0000\f\u0016\u0005\u0006\u0000\u0000"+
		"\r\u0012\u0005\f\u0000\u0000\u000e\u000f\u0005\b\u0000\u0000\u000f\u0011"+
		"\u0005\f\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0011\u0014\u0001"+
		"\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001"+
		"\u0000\u0000\u0000\u0013\u0017\u0001\u0000\u0000\u0000\u0014\u0012\u0001"+
		"\u0000\u0000\u0000\u0015\u0017\u0005\r\u0000\u0000\u0016\r\u0001\u0000"+
		"\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0005\u0007\u0000\u0000\u0019!\u0005\f\u0000"+
		"\u0000\u001a\u001e\u0005\t\u0000\u0000\u001b\u001d\u0003\u0004\u0002\u0000"+
		"\u001c\u001b\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e"+
		"\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f"+
		"\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!\u001a\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"&\u0001\u0000\u0000\u0000"+
		"#$\u0005\n\u0000\u0000$%\u0005\f\u0000\u0000%\'\u0005\u000b\u0000\u0000"+
		"&#\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u0003\u0001\u0000"+
		"\u0000\u0000()\u0006\u0002\uffff\uffff\u0000)5\u0005\u000e\u0000\u0000"+
		"*5\u0005\u000f\u0000\u0000+5\u0005\f\u0000\u0000,-\u0005\u0010\u0000\u0000"+
		"-.\u0003\u0004\u0002\u0000./\u0005\u0011\u0000\u0000/5\u0001\u0000\u0000"+
		"\u000001\u0005\u0012\u0000\u000012\u0003\u0004\u0002\u000023\u0005\u0012"+
		"\u0000\u000035\u0001\u0000\u0000\u00004(\u0001\u0000\u0000\u00004*\u0001"+
		"\u0000\u0000\u00004+\u0001\u0000\u0000\u00004,\u0001\u0000\u0000\u0000"+
		"40\u0001\u0000\u0000\u00005A\u0001\u0000\u0000\u000067\n\b\u0000\u0000"+
		"78\u0005\u0003\u0000\u00008@\u0003\u0004\u0002\t9:\n\u0007\u0000\u0000"+
		":;\u0005\u0001\u0000\u0000;@\u0003\u0004\u0002\b<=\n\u0006\u0000\u0000"+
		"=>\u0005\u0002\u0000\u0000>@\u0003\u0004\u0002\u0007?6\u0001\u0000\u0000"+
		"\u0000?9\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000@C\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\u0005"+
		"\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000\t\t\u0012\u0016\u001e"+
		"!&4?A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}