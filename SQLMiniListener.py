# Generated from SQLMini.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SQLMiniParser import SQLMiniParser
else:
    from SQLMiniParser import SQLMiniParser

# This class defines a complete listener for a parse tree produced by SQLMiniParser.
class SQLMiniListener(ParseTreeListener):

    # Enter a parse tree produced by SQLMiniParser#query.
    def enterQuery(self, ctx:SQLMiniParser.QueryContext):
        pass

    # Exit a parse tree produced by SQLMiniParser#query.
    def exitQuery(self, ctx:SQLMiniParser.QueryContext):
        pass


    # Enter a parse tree produced by SQLMiniParser#select_list.
    def enterSelect_list(self, ctx:SQLMiniParser.Select_listContext):
        pass

    # Exit a parse tree produced by SQLMiniParser#select_list.
    def exitSelect_list(self, ctx:SQLMiniParser.Select_listContext):
        pass


    # Enter a parse tree produced by SQLMiniParser#table_name.
    def enterTable_name(self, ctx:SQLMiniParser.Table_nameContext):
        pass

    # Exit a parse tree produced by SQLMiniParser#table_name.
    def exitTable_name(self, ctx:SQLMiniParser.Table_nameContext):
        pass


    # Enter a parse tree produced by SQLMiniParser#condition.
    def enterCondition(self, ctx:SQLMiniParser.ConditionContext):
        pass

    # Exit a parse tree produced by SQLMiniParser#condition.
    def exitCondition(self, ctx:SQLMiniParser.ConditionContext):
        pass


    # Enter a parse tree produced by SQLMiniParser#expression.
    def enterExpression(self, ctx:SQLMiniParser.ExpressionContext):
        pass

    # Exit a parse tree produced by SQLMiniParser#expression.
    def exitExpression(self, ctx:SQLMiniParser.ExpressionContext):
        pass


