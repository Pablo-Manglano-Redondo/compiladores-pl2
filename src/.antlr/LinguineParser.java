// Generated from c:/Users/Pablo/Desktop/compiladores-pl2/Codigo/Linguine.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LinguineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LET=6, IF=7, THEN=8, ELSE=9, MATCH=10, 
		WITH=11, ARROW=12, SEMICOLON=13, COMMA=14, QUESTION=15, SHOW=16, FUN=17, 
		ID=18, NUMBER=19, LPAREN=20, RPAREN=21, MINUS=22, GT=23, LT=24, GTE=25, 
		LTE=26, AND=27, OR=28, PIPE=29, WS=30;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_condition = 3, 
		RULE_matchCases = 4, RULE_matchCase = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expression", "condition", "matchCases", "matchCase"
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

	@Override
	public String getGrammarFileName() { return "Linguine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinguineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				statement();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 197824L) != 0) );
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
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(LinguineParser.LET, 0); }
		public List<TerminalNode> ID() { return getTokens(LinguineParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LinguineParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(LinguineParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(LinguineParser.NUMBER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IF() { return getToken(LinguineParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public TerminalNode THEN() { return getToken(LinguineParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LinguineParser.ELSE, 0); }
		public TerminalNode MATCH() { return getToken(LinguineParser.MATCH, 0); }
		public TerminalNode WITH() { return getToken(LinguineParser.WITH, 0); }
		public MatchCasesContext matchCases() {
			return getRuleContext(MatchCasesContext.class,0);
		}
		public TerminalNode FUN() { return getToken(LinguineParser.FUN, 0); }
		public TerminalNode ARROW() { return getToken(LinguineParser.ARROW, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LinguineParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LinguineParser.COMMA, i);
		}
		public TerminalNode SHOW() { return getToken(LinguineParser.SHOW, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(LET);
				setState(18);
				match(ID);
				setState(19);
				match(T__0);
				setState(23);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(20);
					match(NUMBER);
					}
					break;
				case 2:
					{
					setState(21);
					match(ID);
					}
					break;
				case 3:
					{
					setState(22);
					expression(0);
					}
					break;
				}
				setState(25);
				match(SEMICOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(IF);
				setState(27);
				match(LPAREN);
				setState(28);
				condition();
				setState(29);
				match(RPAREN);
				setState(30);
				match(THEN);
				setState(31);
				statement();
				setState(32);
				match(ELSE);
				setState(33);
				statement();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(MATCH);
				setState(36);
				match(ID);
				setState(37);
				match(WITH);
				setState(38);
				matchCases();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(FUN);
				setState(40);
				match(ID);
				setState(41);
				match(LPAREN);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(42);
					match(ID);
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(43);
						match(COMMA);
						setState(44);
						match(ID);
						}
						}
						setState(49);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(52);
				match(ARROW);
				setState(53);
				expression(0);
				setState(54);
				match(SEMICOLON);
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				match(SHOW);
				setState(57);
				expression(0);
				setState(58);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode NUMBER() { return getToken(LinguineParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LinguineParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LinguineParser.COMMA, i);
		}
		public TerminalNode ARROW() { return getToken(LinguineParser.ARROW, 0); }
		public TerminalNode MINUS() { return getToken(LinguineParser.MINUS, 0); }
		public TerminalNode QUESTION() { return getToken(LinguineParser.QUESTION, 0); }
		public TerminalNode GT() { return getToken(LinguineParser.GT, 0); }
		public TerminalNode LT() { return getToken(LinguineParser.LT, 0); }
		public TerminalNode GTE() { return getToken(LinguineParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(LinguineParser.LTE, 0); }
		public TerminalNode AND() { return getToken(LinguineParser.AND, 0); }
		public TerminalNode OR() { return getToken(LinguineParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(63);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(64);
				match(ID);
				}
				break;
			case 3:
				{
				setState(65);
				match(ID);
				setState(66);
				match(LPAREN);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6029312L) != 0)) {
					{
					setState(67);
					expression(0);
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(68);
						match(COMMA);
						setState(69);
						expression(0);
						}
						}
						setState(74);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(77);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(78);
				match(ID);
				setState(79);
				match(ARROW);
				setState(80);
				expression(10);
				}
				break;
			case 5:
				{
				setState(81);
				match(LPAREN);
				setState(82);
				expression(0);
				setState(83);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(85);
				match(MINUS);
				setState(86);
				expression(8);
				}
				break;
			case 7:
				{
				setState(87);
				match(ID);
				setState(88);
				match(QUESTION);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(92);
						match(T__1);
						setState(93);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(95);
						match(MINUS);
						setState(96);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(98);
						match(T__2);
						setState(99);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(101);
						match(T__3);
						setState(102);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(103);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(104);
						match(T__4);
						setState(105);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(107);
						match(GT);
						setState(108);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(110);
						match(LT);
						setState(111);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(113);
						match(GTE);
						setState(114);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(116);
						match(LTE);
						setState(117);
						expression(4);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(119);
						match(AND);
						setState(120);
						expression(3);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(122);
						match(OR);
						setState(123);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(LinguineParser.GT, 0); }
		public TerminalNode LT() { return getToken(LinguineParser.LT, 0); }
		public TerminalNode GTE() { return getToken(LinguineParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(LinguineParser.LTE, 0); }
		public TerminalNode QUESTION() { return getToken(LinguineParser.QUESTION, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			expression(0);
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125861888L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
			expression(0);
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
	public static class MatchCasesContext extends ParserRuleContext {
		public List<MatchCaseContext> matchCase() {
			return getRuleContexts(MatchCaseContext.class);
		}
		public MatchCaseContext matchCase(int i) {
			return getRuleContext(MatchCaseContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(LinguineParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(LinguineParser.PIPE, i);
		}
		public MatchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchCases; }
	}

	public final MatchCasesContext matchCases() throws RecognitionException {
		MatchCasesContext _localctx = new MatchCasesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matchCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			matchCase();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(134);
				match(PIPE);
				setState(135);
				matchCase();
				}
				}
				setState(140);
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
	public static class MatchCaseContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(LinguineParser.ARROW, 0); }
		public MatchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchCase; }
	}

	public final MatchCaseContext matchCase() throws RecognitionException {
		MatchCaseContext _localctx = new MatchCaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_matchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			expression(0);
			setState(142);
			match(ARROW);
			setState(143);
			expression(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u0092\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000"+
		"\f\u0000\u000f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		".\b\u0001\n\u0001\f\u00011\t\u0001\u0003\u00013\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001=\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002G\b"+
		"\u0002\n\u0002\f\u0002J\t\u0002\u0003\u0002L\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002Z\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002}\b\u0002\n\u0002"+
		"\f\u0002\u0080\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0089\b\u0004\n\u0004"+
		"\f\u0004\u008c\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0000\u0001\u0004\u0006\u0000\u0002\u0004\u0006\b\n\u0000"+
		"\u0001\u0002\u0000\u000f\u000f\u0017\u001a\u00a8\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0002<\u0001\u0000\u0000\u0000\u0004Y\u0001\u0000\u0000\u0000\u0006"+
		"\u0081\u0001\u0000\u0000\u0000\b\u0085\u0001\u0000\u0000\u0000\n\u008d"+
		"\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0001\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0005\u0006\u0000\u0000\u0012\u0013\u0005\u0012\u0000"+
		"\u0000\u0013\u0017\u0005\u0001\u0000\u0000\u0014\u0018\u0005\u0013\u0000"+
		"\u0000\u0015\u0018\u0005\u0012\u0000\u0000\u0016\u0018\u0003\u0004\u0002"+
		"\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000"+
		"\u0000\u0019=\u0005\r\u0000\u0000\u001a\u001b\u0005\u0007\u0000\u0000"+
		"\u001b\u001c\u0005\u0014\u0000\u0000\u001c\u001d\u0003\u0006\u0003\u0000"+
		"\u001d\u001e\u0005\u0015\u0000\u0000\u001e\u001f\u0005\b\u0000\u0000\u001f"+
		" \u0003\u0002\u0001\u0000 !\u0005\t\u0000\u0000!\"\u0003\u0002\u0001\u0000"+
		"\"=\u0001\u0000\u0000\u0000#$\u0005\n\u0000\u0000$%\u0005\u0012\u0000"+
		"\u0000%&\u0005\u000b\u0000\u0000&=\u0003\b\u0004\u0000\'(\u0005\u0011"+
		"\u0000\u0000()\u0005\u0012\u0000\u0000)2\u0005\u0014\u0000\u0000*/\u0005"+
		"\u0012\u0000\u0000+,\u0005\u000e\u0000\u0000,.\u0005\u0012\u0000\u0000"+
		"-+\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u00002*\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000045\u0005\f\u0000\u000056\u0003\u0004\u0002\u000067\u0005"+
		"\r\u0000\u00007=\u0001\u0000\u0000\u000089\u0005\u0010\u0000\u00009:\u0003"+
		"\u0004\u0002\u0000:;\u0005\r\u0000\u0000;=\u0001\u0000\u0000\u0000<\u0011"+
		"\u0001\u0000\u0000\u0000<\u001a\u0001\u0000\u0000\u0000<#\u0001\u0000"+
		"\u0000\u0000<\'\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000\u0000=\u0003"+
		"\u0001\u0000\u0000\u0000>?\u0006\u0002\uffff\uffff\u0000?Z\u0005\u0013"+
		"\u0000\u0000@Z\u0005\u0012\u0000\u0000AB\u0005\u0012\u0000\u0000BK\u0005"+
		"\u0014\u0000\u0000CH\u0003\u0004\u0002\u0000DE\u0005\u000e\u0000\u0000"+
		"EG\u0003\u0004\u0002\u0000FD\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IL\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000KC\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MZ\u0005\u0015\u0000\u0000"+
		"NO\u0005\u0012\u0000\u0000OP\u0005\f\u0000\u0000PZ\u0003\u0004\u0002\n"+
		"QR\u0005\u0014\u0000\u0000RS\u0003\u0004\u0002\u0000ST\u0005\u0015\u0000"+
		"\u0000TZ\u0001\u0000\u0000\u0000UV\u0005\u0016\u0000\u0000VZ\u0003\u0004"+
		"\u0002\bWX\u0005\u0012\u0000\u0000XZ\u0005\u000f\u0000\u0000Y>\u0001\u0000"+
		"\u0000\u0000Y@\u0001\u0000\u0000\u0000YA\u0001\u0000\u0000\u0000YN\u0001"+
		"\u0000\u0000\u0000YQ\u0001\u0000\u0000\u0000YU\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000Z~\u0001\u0000\u0000\u0000[\\\n\u000f\u0000"+
		"\u0000\\]\u0005\u0002\u0000\u0000]}\u0003\u0004\u0002\u0010^_\n\u000e"+
		"\u0000\u0000_`\u0005\u0016\u0000\u0000`}\u0003\u0004\u0002\u000fab\n\r"+
		"\u0000\u0000bc\u0005\u0003\u0000\u0000c}\u0003\u0004\u0002\u000ede\n\f"+
		"\u0000\u0000ef\u0005\u0004\u0000\u0000f}\u0003\u0004\u0002\rgh\n\u000b"+
		"\u0000\u0000hi\u0005\u0005\u0000\u0000i}\u0003\u0004\u0002\fjk\n\u0006"+
		"\u0000\u0000kl\u0005\u0017\u0000\u0000l}\u0003\u0004\u0002\u0007mn\n\u0005"+
		"\u0000\u0000no\u0005\u0018\u0000\u0000o}\u0003\u0004\u0002\u0006pq\n\u0004"+
		"\u0000\u0000qr\u0005\u0019\u0000\u0000r}\u0003\u0004\u0002\u0005st\n\u0003"+
		"\u0000\u0000tu\u0005\u001a\u0000\u0000u}\u0003\u0004\u0002\u0004vw\n\u0002"+
		"\u0000\u0000wx\u0005\u001b\u0000\u0000x}\u0003\u0004\u0002\u0003yz\n\u0001"+
		"\u0000\u0000z{\u0005\u001c\u0000\u0000{}\u0003\u0004\u0002\u0002|[\u0001"+
		"\u0000\u0000\u0000|^\u0001\u0000\u0000\u0000|a\u0001\u0000\u0000\u0000"+
		"|d\u0001\u0000\u0000\u0000|g\u0001\u0000\u0000\u0000|j\u0001\u0000\u0000"+
		"\u0000|m\u0001\u0000\u0000\u0000|p\u0001\u0000\u0000\u0000|s\u0001\u0000"+
		"\u0000\u0000|v\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000}\u0080"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0005\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0003\u0004\u0002\u0000\u0082\u0083\u0007\u0000\u0000"+
		"\u0000\u0083\u0084\u0003\u0004\u0002\u0000\u0084\u0007\u0001\u0000\u0000"+
		"\u0000\u0085\u008a\u0003\n\u0005\u0000\u0086\u0087\u0005\u001d\u0000\u0000"+
		"\u0087\u0089\u0003\n\u0005\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\t\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0003\u0004\u0002\u0000\u008e\u008f"+
		"\u0005\f\u0000\u0000\u008f\u0090\u0003\u0004\u0002\u0000\u0090\u000b\u0001"+
		"\u0000\u0000\u0000\u000b\u000f\u0017/2<HKY|~\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}