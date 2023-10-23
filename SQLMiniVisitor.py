# Generated from SQLMini.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SQLMiniParser import SQLMiniParser
else:
    from SQLMiniParser import SQLMiniParser

# This class defines a complete generic visitor for a parse tree produced by SQLMiniParser.

class SQLMiniVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SQLMiniParser#query.
    def visitQuery(self, ctx:SQLMiniParser.QueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLMiniParser#select_list.
    def visitSelect_list(self, ctx:SQLMiniParser.Select_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLMiniParser#table_name.
    def visitTable_name(self, ctx:SQLMiniParser.Table_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLMiniParser#condition.
    def visitCondition(self, ctx:SQLMiniParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SQLMiniParser#expression.
    def visitExpression(self, ctx:SQLMiniParser.ExpressionContext):
        return self.visitChildren(ctx)



del SQLMiniParser