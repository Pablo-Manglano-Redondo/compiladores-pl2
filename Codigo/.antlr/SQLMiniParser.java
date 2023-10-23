// Generated from c:/Users/Pablo/Desktop/compiladores-pl2/Codigo/SQLMini.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLMiniParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SELECT=2, FROM=3, WHERE=4, ORDER=5, ASC=6, DESC=7, COMMA=8, LPAREN=9, 
		RPAREN=10, GT=11, GTE=12, LT=13, LTE=14, AND=15, OR=16, NOT=17, ID=18, 
		NUMBER=19, STRING=20;
	public static final int
		RULE_query = 0, RULE_orderDirection = 1, RULE_condition = 2, RULE_expression = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "orderDirection", "condition", "expression"
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

	@Override
	public String getGrammarFileName() { return "SQLMini.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLMiniParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLMiniParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SQLMiniParser.FROM, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLMiniParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLMiniParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLMiniParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLMiniParser.COMMA, i);
		}
		public TerminalNode WHERE() { return getToken(SQLMiniParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SQLMiniParser.ORDER, 0); }
		public OrderDirectionContext orderDirection() {
			return getRuleContext(OrderDirectionContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(SELECT);
			setState(9);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(10);
				match(COMMA);
				setState(11);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			match(FROM);
			setState(18);
			match(ID);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(19);
				match(WHERE);
				setState(20);
				condition();
				}
			}

			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(23);
				match(ORDER);
				setState(24);
				match(ID);
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(25);
					orderDirection();
					}
				}

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
	public static class OrderDirectionContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(SQLMiniParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLMiniParser.DESC, 0); }
		public OrderDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderDirection; }
	}

	public final OrderDirectionContext orderDirection() throws RecognitionException {
		OrderDirectionContext _localctx = new OrderDirectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_orderDirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SQLMiniParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SQLMiniParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(SQLMiniParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SQLMiniParser.OR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			expression();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(33);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(34);
				expression();
				}
				}
				setState(39);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SQLMiniParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLMiniParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(SQLMiniParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLMiniParser.ID, 0); }
		public TerminalNode GT() { return getToken(SQLMiniParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SQLMiniParser.GTE, 0); }
		public TerminalNode LT() { return getToken(SQLMiniParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SQLMiniParser.LTE, 0); }
		public TerminalNode NUMBER() { return getToken(SQLMiniParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SQLMiniParser.STRING, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(LPAREN);
				setState(41);
				condition();
				setState(42);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(NOT);
				setState(45);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(ID);
				setState(47);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(48);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(ID);
				}
				break;
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

	public static final String _serializedATN =
		"\u0004\u0001\u00145\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\r\b\u0000\n\u0000\f\u0000\u0010\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0016\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0003\u0000"+
		"\u001d\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002$\b\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00033\b\u0003\u0001\u0003\u0000\u0000"+
		"\u0004\u0000\u0002\u0004\u0006\u0000\u0005\u0002\u0000\u0001\u0001\u0012"+
		"\u0012\u0001\u0000\u0006\u0007\u0001\u0000\u000f\u0010\u0001\u0000\u000b"+
		"\u000e\u0001\u0000\u0013\u00148\u0000\b\u0001\u0000\u0000\u0000\u0002"+
		"\u001e\u0001\u0000\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u00062\u0001"+
		"\u0000\u0000\u0000\b\t\u0005\u0002\u0000\u0000\t\u000e\u0007\u0000\u0000"+
		"\u0000\n\u000b\u0005\b\u0000\u0000\u000b\r\u0007\u0000\u0000\u0000\f\n"+
		"\u0001\u0000\u0000\u0000\r\u0010\u0001\u0000\u0000\u0000\u000e\f\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0011\u0001"+
		"\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0011\u0012\u0005"+
		"\u0003\u0000\u0000\u0012\u0015\u0005\u0012\u0000\u0000\u0013\u0014\u0005"+
		"\u0004\u0000\u0000\u0014\u0016\u0003\u0004\u0002\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u001c\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0005\u0005\u0000\u0000\u0018\u001a\u0005"+
		"\u0012\u0000\u0000\u0019\u001b\u0003\u0002\u0001\u0000\u001a\u0019\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001d\u0001"+
		"\u0000\u0000\u0000\u001c\u0017\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u0001\u0001\u0000\u0000\u0000\u001e\u001f\u0007"+
		"\u0001\u0000\u0000\u001f\u0003\u0001\u0000\u0000\u0000 %\u0003\u0006\u0003"+
		"\u0000!\"\u0007\u0002\u0000\u0000\"$\u0003\u0006\u0003\u0000#!\u0001\u0000"+
		"\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&\u0005\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000()\u0005\t\u0000\u0000)*\u0003\u0004\u0002\u0000*+\u0005\n\u0000"+
		"\u0000+3\u0001\u0000\u0000\u0000,-\u0005\u0011\u0000\u0000-3\u0003\u0006"+
		"\u0003\u0000./\u0005\u0012\u0000\u0000/0\u0007\u0003\u0000\u000003\u0007"+
		"\u0004\u0000\u000013\u0005\u0012\u0000\u00002(\u0001\u0000\u0000\u0000"+
		"2,\u0001\u0000\u0000\u00002.\u0001\u0000\u0000\u000021\u0001\u0000\u0000"+
		"\u00003\u0007\u0001\u0000\u0000\u0000\u0006\u000e\u0015\u001a\u001c%2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}