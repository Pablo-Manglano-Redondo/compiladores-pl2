# Generated from SQLMini.g4 by ANTLR 4.7.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27")
        buf.write("\62\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3")
        buf.write("\2\3\2\3\2\3\2\5\2\23\n\2\3\2\3\2\5\2\27\n\2\3\3\3\3\3")
        buf.write("\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\5\3\"\n\3\3\4\3\4\3")
        buf.write("\5\3\5\3\5\7\5)\n\5\f\5\16\5,\13\5\3\6\3\6\3\6\3\6\3\6")
        buf.write("\2\2\7\2\4\6\b\n\2\4\3\2\n\13\3\2\17\23\2\61\2\f\3\2\2")
        buf.write("\2\4!\3\2\2\2\6#\3\2\2\2\b%\3\2\2\2\n-\3\2\2\2\f\r\7\4")
        buf.write("\2\2\r\16\5\4\3\2\16\17\7\5\2\2\17\22\5\6\4\2\20\21\7")
        buf.write("\6\2\2\21\23\5\b\5\2\22\20\3\2\2\2\22\23\3\2\2\2\23\26")
        buf.write("\3\2\2\2\24\25\7\7\2\2\25\27\7\27\2\2\26\24\3\2\2\2\26")
        buf.write("\27\3\2\2\2\27\3\3\2\2\2\30\35\7\24\2\2\31\32\7\16\2\2")
        buf.write("\32\34\7\24\2\2\33\31\3\2\2\2\34\37\3\2\2\2\35\33\3\2")
        buf.write("\2\2\35\36\3\2\2\2\36\"\3\2\2\2\37\35\3\2\2\2 \"\7\3\2")
        buf.write("\2!\30\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\7\24\2\2$\7\3\2")
        buf.write("\2\2%*\5\n\6\2&\'\t\2\2\2\')\5\n\6\2(&\3\2\2\2),\3\2\2")
        buf.write("\2*(\3\2\2\2*+\3\2\2\2+\t\3\2\2\2,*\3\2\2\2-.\7\24\2\2")
        buf.write("./\t\3\2\2/\60\7\25\2\2\60\13\3\2\2\2\7\22\26\35!*")
        return buf.getvalue()


class SQLMiniParser ( Parser ):

    grammarFileName = "SQLMini.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'*'", "'SELECT'", "'FROM'", "'WHERE'", 
                     "'ORDER BY'", "'ASC'", "'DESC'", "'AND'", "'OR'", "'('", 
                     "')'", "','", "'>'", "'>='", "'<'", "'<='", "'='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "SELECT", "FROM", "WHERE", 
                      "ORDER", "ASC", "DESC", "AND", "OR", "LPAREN", "RPAREN", 
                      "COMMA", "GT", "GTE", "LT", "LTE", "EQ", "ID", "NUMBER", 
                      "WS", "ORDER_BY_FIELDS" ]

    RULE_query = 0
    RULE_select_list = 1
    RULE_table_name = 2
    RULE_condition = 3
    RULE_expression = 4

    ruleNames =  [ "query", "select_list", "table_name", "condition", "expression" ]

    EOF = Token.EOF
    T__0=1
    SELECT=2
    FROM=3
    WHERE=4
    ORDER=5
    ASC=6
    DESC=7
    AND=8
    OR=9
    LPAREN=10
    RPAREN=11
    COMMA=12
    GT=13
    GTE=14
    LT=15
    LTE=16
    EQ=17
    ID=18
    NUMBER=19
    WS=20
    ORDER_BY_FIELDS=21

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class QueryContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SELECT(self):
            return self.getToken(SQLMiniParser.SELECT, 0)

        def select_list(self):
            return self.getTypedRuleContext(SQLMiniParser.Select_listContext,0)


        def FROM(self):
            return self.getToken(SQLMiniParser.FROM, 0)

        def table_name(self):
            return self.getTypedRuleContext(SQLMiniParser.Table_nameContext,0)


        def WHERE(self):
            return self.getToken(SQLMiniParser.WHERE, 0)

        def condition(self):
            return self.getTypedRuleContext(SQLMiniParser.ConditionContext,0)


        def ORDER(self):
            return self.getToken(SQLMiniParser.ORDER, 0)

        def ORDER_BY_FIELDS(self):
            return self.getToken(SQLMiniParser.ORDER_BY_FIELDS, 0)

        def getRuleIndex(self):
            return SQLMiniParser.RULE_query

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterQuery" ):
                listener.enterQuery(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitQuery" ):
                listener.exitQuery(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitQuery" ):
                return visitor.visitQuery(self)
            else:
                return visitor.visitChildren(self)




    def query(self):

        localctx = SQLMiniParser.QueryContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_query)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 10
            self.match(SQLMiniParser.SELECT)
            self.state = 11
            self.select_list()
            self.state = 12
            self.match(SQLMiniParser.FROM)
            self.state = 13
            self.table_name()
            self.state = 16
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==SQLMiniParser.WHERE:
                self.state = 14
                self.match(SQLMiniParser.WHERE)
                self.state = 15
                self.condition()


            self.state = 20
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==SQLMiniParser.ORDER:
                self.state = 18
                self.match(SQLMiniParser.ORDER)
                self.state = 19
                self.match(SQLMiniParser.ORDER_BY_FIELDS)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Select_listContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(SQLMiniParser.ID)
            else:
                return self.getToken(SQLMiniParser.ID, i)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(SQLMiniParser.COMMA)
            else:
                return self.getToken(SQLMiniParser.COMMA, i)

        def getRuleIndex(self):
            return SQLMiniParser.RULE_select_list

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelect_list" ):
                listener.enterSelect_list(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelect_list" ):
                listener.exitSelect_list(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelect_list" ):
                return visitor.visitSelect_list(self)
            else:
                return visitor.visitChildren(self)




    def select_list(self):

        localctx = SQLMiniParser.Select_listContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_select_list)
        self._la = 0 # Token type
        try:
            self.state = 31
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [SQLMiniParser.ID]:
                self.enterOuterAlt(localctx, 1)
                self.state = 22
                self.match(SQLMiniParser.ID)
                self.state = 27
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==SQLMiniParser.COMMA:
                    self.state = 23
                    self.match(SQLMiniParser.COMMA)
                    self.state = 24
                    self.match(SQLMiniParser.ID)
                    self.state = 29
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass
            elif token in [SQLMiniParser.T__0]:
                self.enterOuterAlt(localctx, 2)
                self.state = 30
                self.match(SQLMiniParser.T__0)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Table_nameContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(SQLMiniParser.ID, 0)

        def getRuleIndex(self):
            return SQLMiniParser.RULE_table_name

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTable_name" ):
                listener.enterTable_name(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTable_name" ):
                listener.exitTable_name(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTable_name" ):
                return visitor.visitTable_name(self)
            else:
                return visitor.visitChildren(self)




    def table_name(self):

        localctx = SQLMiniParser.Table_nameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_table_name)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 33
            self.match(SQLMiniParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ConditionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(SQLMiniParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(SQLMiniParser.ExpressionContext,i)


        def AND(self, i:int=None):
            if i is None:
                return self.getTokens(SQLMiniParser.AND)
            else:
                return self.getToken(SQLMiniParser.AND, i)

        def OR(self, i:int=None):
            if i is None:
                return self.getTokens(SQLMiniParser.OR)
            else:
                return self.getToken(SQLMiniParser.OR, i)

        def getRuleIndex(self):
            return SQLMiniParser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)




    def condition(self):

        localctx = SQLMiniParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_condition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.expression()
            self.state = 40
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==SQLMiniParser.AND or _la==SQLMiniParser.OR:
                self.state = 36
                _la = self._input.LA(1)
                if not(_la==SQLMiniParser.AND or _la==SQLMiniParser.OR):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 37
                self.expression()
                self.state = 42
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ExpressionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(SQLMiniParser.ID, 0)

        def NUMBER(self):
            return self.getToken(SQLMiniParser.NUMBER, 0)

        def GT(self):
            return self.getToken(SQLMiniParser.GT, 0)

        def GTE(self):
            return self.getToken(SQLMiniParser.GTE, 0)

        def LT(self):
            return self.getToken(SQLMiniParser.LT, 0)

        def LTE(self):
            return self.getToken(SQLMiniParser.LTE, 0)

        def EQ(self):
            return self.getToken(SQLMiniParser.EQ, 0)

        def getRuleIndex(self):
            return SQLMiniParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpression" ):
                return visitor.visitExpression(self)
            else:
                return visitor.visitChildren(self)




    def expression(self):

        localctx = SQLMiniParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_expression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            self.match(SQLMiniParser.ID)
            self.state = 44
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << SQLMiniParser.GT) | (1 << SQLMiniParser.GTE) | (1 << SQLMiniParser.LT) | (1 << SQLMiniParser.LTE) | (1 << SQLMiniParser.EQ))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 45
            self.match(SQLMiniParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





