// Generated from /home/ssierra/uah/compiladores-pl2/src/Linguine.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, STRING=6, LET=7, IF=8, THEN=9, 
		ELSE=10, MATCH=11, WITH=12, ARROW=13, SEMICOLON=14, COMMA=15, QUESTION=16, 
		SHOW=17, FUN=18, ID=19, NUMBER=20, LPAREN=21, RPAREN=22, MINUS=23, GT=24, 
		LT=25, EEQ=26, NEQ=27, GTE=28, LTE=29, PIPE=30, WS=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment = 2, RULE_ifStatement = 3, 
		RULE_condition = 4, RULE_matchStatement = 5, RULE_matchCases = 6, RULE_matchCase = 7, 
		RULE_function = 8, RULE_showStatement = 9, RULE_expression = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment", "ifStatement", "condition", "matchStatement", 
			"matchCases", "matchCase", "function", "showStatement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'*'", "'/'", "'%'", null, "'let'", "'if'", "'then'", 
			"'else'", "'match'", "'with'", "'->'", "';'", "','", "'?'", "'show'", 
			"'fun'", null, null, "'('", "')'", "'-'", "'>'", "'<'", "'=='", "'!='", 
			"'>='", "'<='", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "STRING", "LET", "IF", "THEN", "ELSE", 
			"MATCH", "WITH", "ARROW", "SEMICOLON", "COMMA", "QUESTION", "SHOW", "FUN", 
			"ID", "NUMBER", "LPAREN", "RPAREN", "MINUS", "GT", "LT", "EEQ", "NEQ", 
			"GTE", "LTE", "PIPE", "WS"
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				statement(0);
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 12519872L) != 0) );
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public MatchStatementContext matchStatement() {
			return getRuleContext(MatchStatementContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ShowStatementContext showStatement() {
			return getRuleContext(ShowStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LinguineParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(28);
				expression(0);
				}
				break;
			case 2:
				{
				setState(29);
				assignment();
				}
				break;
			case 3:
				{
				setState(30);
				ifStatement();
				}
				break;
			case 4:
				{
				setState(31);
				matchStatement();
				}
				break;
			case 5:
				{
				setState(32);
				function();
				}
				break;
			case 6:
				{
				setState(33);
				showStatement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(36);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(37);
					match(SEMICOLON);
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LET() { return getToken(LinguineParser.LET, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(43);
					match(LET);
					}
				}

				setState(46);
				match(ID);
				setState(47);
				match(T__0);
				setState(48);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(49);
					match(LET);
					}
				}

				setState(52);
				match(ID);
				setState(53);
				match(T__0);
				setState(54);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(55);
					match(LET);
					}
				}

				setState(58);
				match(ID);
				setState(59);
				match(T__0);
				setState(60);
				ifStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
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
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(IF);
			setState(64);
			match(LPAREN);
			setState(65);
			condition();
			setState(66);
			match(RPAREN);
			setState(67);
			match(THEN);
			setState(68);
			statement(0);
			setState(69);
			match(ELSE);
			setState(70);
			statement(0);
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
		public TerminalNode GT() { return getToken(LinguineParser.GT, 0); }
		public TerminalNode LT() { return getToken(LinguineParser.LT, 0); }
		public TerminalNode GTE() { return getToken(LinguineParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(LinguineParser.LTE, 0); }
		public TerminalNode QUESTION() { return getToken(LinguineParser.QUESTION, 0); }
		public TerminalNode EEQ() { return getToken(LinguineParser.EEQ, 0); }
		public TerminalNode NEQ() { return getToken(LinguineParser.NEQ, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			expression(0);
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1057030144L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(74);
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
	public static class MatchStatementContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(LinguineParser.MATCH, 0); }
		public TerminalNode ID() { return getToken(LinguineParser.ID, 0); }
		public TerminalNode WITH() { return getToken(LinguineParser.WITH, 0); }
		public MatchCasesContext matchCases() {
			return getRuleContext(MatchCasesContext.class,0);
		}
		public MatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchStatement; }
	}

	public final MatchStatementContext matchStatement() throws RecognitionException {
		MatchStatementContext _localctx = new MatchStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_matchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(MATCH);
			setState(77);
			match(ID);
			setState(78);
			match(WITH);
			setState(79);
			matchCases();
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
		public List<TerminalNode> PIPE() { return getTokens(LinguineParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(LinguineParser.PIPE, i);
		}
		public List<MatchCaseContext> matchCase() {
			return getRuleContexts(MatchCaseContext.class);
		}
		public MatchCaseContext matchCase(int i) {
			return getRuleContext(MatchCaseContext.class,i);
		}
		public MatchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchCases; }
	}

	public final MatchCasesContext matchCases() throws RecognitionException {
		MatchCasesContext _localctx = new MatchCasesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_matchCases);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					match(PIPE);
					setState(82);
					matchCase();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 14, RULE_matchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			expression(0);
			setState(89);
			match(ARROW);
			setState(90);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(LinguineParser.FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(LinguineParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LinguineParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(LinguineParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LinguineParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(LinguineParser.ARROW, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(LinguineParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LinguineParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(FUN);
			setState(93);
			match(ID);
			setState(94);
			match(LPAREN);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(95);
				match(ID);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(96);
					match(COMMA);
					setState(97);
					match(ID);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(105);
			match(RPAREN);
			setState(106);
			match(ARROW);
			setState(107);
			statement(0);
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
	public static class ShowStatementContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(LinguineParser.SHOW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ShowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStatement; }
	}

	public final ShowStatementContext showStatement() throws RecognitionException {
		ShowStatementContext _localctx = new ShowStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_showStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(SHOW);
			setState(110);
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
		public TerminalNode STRING() { return getToken(LinguineParser.STRING, 0); }
		public TerminalNode ARROW() { return getToken(LinguineParser.ARROW, 0); }
		public TerminalNode MINUS() { return getToken(LinguineParser.MINUS, 0); }
		public TerminalNode QUESTION() { return getToken(LinguineParser.QUESTION, 0); }
		public TerminalNode GT() { return getToken(LinguineParser.GT, 0); }
		public TerminalNode LT() { return getToken(LinguineParser.LT, 0); }
		public TerminalNode GTE() { return getToken(LinguineParser.GTE, 0); }
		public TerminalNode EEQ() { return getToken(LinguineParser.EEQ, 0); }
		public TerminalNode NEQ() { return getToken(LinguineParser.NEQ, 0); }
		public TerminalNode LTE() { return getToken(LinguineParser.LTE, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(113);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(114);
				match(ID);
				}
				break;
			case 3:
				{
				setState(115);
				match(ID);
				setState(116);
				match(LPAREN);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12124224L) != 0)) {
					{
					setState(117);
					expression(0);
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(118);
						match(COMMA);
						setState(119);
						expression(0);
						}
						}
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(127);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(128);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(129);
				match(ID);
				setState(130);
				match(ARROW);
				setState(131);
				expression(11);
				}
				break;
			case 6:
				{
				setState(132);
				match(LPAREN);
				setState(133);
				expression(0);
				setState(134);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(136);
				match(MINUS);
				setState(137);
				expression(9);
				}
				break;
			case 8:
				{
				setState(138);
				match(ID);
				setState(139);
				match(QUESTION);
				}
				break;
			case 9:
				{
				setState(140);
				match(QUESTION);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(143);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(144);
						match(T__1);
						setState(145);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(147);
						match(MINUS);
						setState(148);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(150);
						match(T__2);
						setState(151);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(153);
						match(T__3);
						setState(154);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(156);
						match(T__4);
						setState(157);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(159);
						match(GT);
						setState(160);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(162);
						match(LT);
						setState(163);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(165);
						match(GTE);
						setState(166);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(168);
						match(EEQ);
						setState(169);
						expression(4);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(171);
						match(NEQ);
						setState(172);
						expression(3);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(174);
						match(LTE);
						setState(175);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		case 1:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000"+
		"\u0018\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001#\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*"+
		"\t\u0001\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u00023\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u00029\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002>\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006T\b"+
		"\u0006\n\u0006\f\u0006W\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bc\b\b\n"+
		"\b\f\bf\t\b\u0003\bh\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\ny\b\n\n\n\f\n|\t\n\u0003\n~\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u008e\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00b1\b\n\n\n\f\n\u00b4\t\n\u0001\n\u0000\u0002\u0002\u0014"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0001"+
		"\u0002\u0000\u0010\u0010\u0018\u001d\u00ce\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000"+
		"\u0006?\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000\nL\u0001\u0000"+
		"\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000eX\u0001\u0000\u0000\u0000"+
		"\u0010\\\u0001\u0000\u0000\u0000\u0012m\u0001\u0000\u0000\u0000\u0014"+
		"\u008d\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0006\u0001\uffff\uffff\u0000"+
		"\u001c#\u0003\u0014\n\u0000\u001d#\u0003\u0004\u0002\u0000\u001e#\u0003"+
		"\u0006\u0003\u0000\u001f#\u0003\n\u0005\u0000 #\u0003\u0010\b\u0000!#"+
		"\u0003\u0012\t\u0000\"\u001b\u0001\u0000\u0000\u0000\"\u001d\u0001\u0000"+
		"\u0000\u0000\"\u001e\u0001\u0000\u0000\u0000\"\u001f\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#(\u0001\u0000"+
		"\u0000\u0000$%\n\u0007\u0000\u0000%\'\u0005\u000e\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000+-\u0005\u0007\u0000\u0000,+\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0005\u0013\u0000\u0000"+
		"/0\u0005\u0001\u0000\u00000>\u0003\u0014\n\u000013\u0005\u0007\u0000\u0000"+
		"21\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000045\u0005\u0013\u0000\u000056\u0005\u0001\u0000\u00006>\u0003\u0010"+
		"\b\u000079\u0005\u0007\u0000\u000087\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0005\u0013\u0000\u0000;<\u0005"+
		"\u0001\u0000\u0000<>\u0003\u0006\u0003\u0000=,\u0001\u0000\u0000\u0000"+
		"=2\u0001\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000>\u0005\u0001\u0000"+
		"\u0000\u0000?@\u0005\b\u0000\u0000@A\u0005\u0015\u0000\u0000AB\u0003\b"+
		"\u0004\u0000BC\u0005\u0016\u0000\u0000CD\u0005\t\u0000\u0000DE\u0003\u0002"+
		"\u0001\u0000EF\u0005\n\u0000\u0000FG\u0003\u0002\u0001\u0000G\u0007\u0001"+
		"\u0000\u0000\u0000HI\u0003\u0014\n\u0000IJ\u0007\u0000\u0000\u0000JK\u0003"+
		"\u0014\n\u0000K\t\u0001\u0000\u0000\u0000LM\u0005\u000b\u0000\u0000MN"+
		"\u0005\u0013\u0000\u0000NO\u0005\f\u0000\u0000OP\u0003\f\u0006\u0000P"+
		"\u000b\u0001\u0000\u0000\u0000QR\u0005\u001e\u0000\u0000RT\u0003\u000e"+
		"\u0007\u0000SQ\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\r\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000XY\u0003\u0014\n\u0000YZ\u0005\r\u0000\u0000"+
		"Z[\u0003\u0014\n\u0000[\u000f\u0001\u0000\u0000\u0000\\]\u0005\u0012\u0000"+
		"\u0000]^\u0005\u0013\u0000\u0000^g\u0005\u0015\u0000\u0000_d\u0005\u0013"+
		"\u0000\u0000`a\u0005\u000f\u0000\u0000ac\u0005\u0013\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000g_\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0005\u0016\u0000\u0000jk\u0005\r\u0000\u0000kl\u0003\u0002"+
		"\u0001\u0000l\u0011\u0001\u0000\u0000\u0000mn\u0005\u0011\u0000\u0000"+
		"no\u0003\u0014\n\u0000o\u0013\u0001\u0000\u0000\u0000pq\u0006\n\uffff"+
		"\uffff\u0000q\u008e\u0005\u0014\u0000\u0000r\u008e\u0005\u0013\u0000\u0000"+
		"st\u0005\u0013\u0000\u0000t}\u0005\u0015\u0000\u0000uz\u0003\u0014\n\u0000"+
		"vw\u0005\u000f\u0000\u0000wy\u0003\u0014\n\u0000xv\u0001\u0000\u0000\u0000"+
		"y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}u\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u008e\u0005\u0016\u0000\u0000\u0080\u008e\u0005\u0006\u0000\u0000"+
		"\u0081\u0082\u0005\u0013\u0000\u0000\u0082\u0083\u0005\r\u0000\u0000\u0083"+
		"\u008e\u0003\u0014\n\u000b\u0084\u0085\u0005\u0015\u0000\u0000\u0085\u0086"+
		"\u0003\u0014\n\u0000\u0086\u0087\u0005\u0016\u0000\u0000\u0087\u008e\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005\u0017\u0000\u0000\u0089\u008e\u0003"+
		"\u0014\n\t\u008a\u008b\u0005\u0013\u0000\u0000\u008b\u008e\u0005\u0010"+
		"\u0000\u0000\u008c\u008e\u0005\u0010\u0000\u0000\u008dp\u0001\u0000\u0000"+
		"\u0000\u008dr\u0001\u0000\u0000\u0000\u008ds\u0001\u0000\u0000\u0000\u008d"+
		"\u0080\u0001\u0000\u0000\u0000\u008d\u0081\u0001\u0000\u0000\u0000\u008d"+
		"\u0084\u0001\u0000\u0000\u0000\u008d\u0088\u0001\u0000\u0000\u0000\u008d"+
		"\u008a\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u00b2\u0001\u0000\u0000\u0000\u008f\u0090\n\u0010\u0000\u0000\u0090\u0091"+
		"\u0005\u0002\u0000\u0000\u0091\u00b1\u0003\u0014\n\u0011\u0092\u0093\n"+
		"\u000f\u0000\u0000\u0093\u0094\u0005\u0017\u0000\u0000\u0094\u00b1\u0003"+
		"\u0014\n\u0010\u0095\u0096\n\u000e\u0000\u0000\u0096\u0097\u0005\u0003"+
		"\u0000\u0000\u0097\u00b1\u0003\u0014\n\u000f\u0098\u0099\n\r\u0000\u0000"+
		"\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u00b1\u0003\u0014\n\u000e\u009b"+
		"\u009c\n\f\u0000\u0000\u009c\u009d\u0005\u0005\u0000\u0000\u009d\u00b1"+
		"\u0003\u0014\n\r\u009e\u009f\n\u0006\u0000\u0000\u009f\u00a0\u0005\u0018"+
		"\u0000\u0000\u00a0\u00b1\u0003\u0014\n\u0007\u00a1\u00a2\n\u0005\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0019\u0000\u0000\u00a3\u00b1\u0003\u0014\n\u0006"+
		"\u00a4\u00a5\n\u0004\u0000\u0000\u00a5\u00a6\u0005\u001c\u0000\u0000\u00a6"+
		"\u00b1\u0003\u0014\n\u0005\u00a7\u00a8\n\u0003\u0000\u0000\u00a8\u00a9"+
		"\u0005\u001a\u0000\u0000\u00a9\u00b1\u0003\u0014\n\u0004\u00aa\u00ab\n"+
		"\u0002\u0000\u0000\u00ab\u00ac\u0005\u001b\u0000\u0000\u00ac\u00b1\u0003"+
		"\u0014\n\u0003\u00ad\u00ae\n\u0001\u0000\u0000\u00ae\u00af\u0005\u001d"+
		"\u0000\u0000\u00af\u00b1\u0003\u0014\n\u0002\u00b0\u008f\u0001\u0000\u0000"+
		"\u0000\u00b0\u0092\u0001\u0000\u0000\u0000\u00b0\u0095\u0001\u0000\u0000"+
		"\u0000\u00b0\u0098\u0001\u0000\u0000\u0000\u00b0\u009b\u0001\u0000\u0000"+
		"\u0000\u00b0\u009e\u0001\u0000\u0000\u0000\u00b0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00b0\u00a4\u0001\u0000\u0000\u0000\u00b0\u00a7\u0001\u0000\u0000"+
		"\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u0015\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u000f\u0019\"(,28=Udgz}\u008d"+
		"\u00b0\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}