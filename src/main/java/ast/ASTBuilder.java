package ast;

import antlr.gBaseVisitor;
import antlr.gParser;
import ast.global.Declaration;
import ast.global.Expression;
import ast.global.Node;
import ast.global.Position;
import ast.statement.Statement;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class ASTBuilder extends gBaseVisitor<Node> {

    private static Position position(ParserRuleContext ctx) {
        return new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    private <T> List<T> makeList(List<? extends ParserRuleContext> contexts) {
        List<T> nodes = new ArrayList<>();
        for (ParserRuleContext context : contexts)
            nodes.add((T) context.accept(this));
        return nodes;
    }

    @Override
    public Node visitProgram(gParser.ProgramContext ctx) {
        List<Declaration> declarations = makeList(ctx.declaration());
        List<Statement> statements = makeList(ctx.statements().statements());

        return super.visitProgram(ctx);
    }

    @Override
    public Node visitDeclaration(gParser.DeclarationContext ctx) {
        return super.visitDeclaration(ctx);
    }

    @Override
    public Node visitLDeclIdent(gParser.LDeclIdentContext ctx) {
        return super.visitLDeclIdent(ctx);
    }

    @Override
    public Node visitLDeclVariables(gParser.LDeclVariablesContext ctx) {
        return super.visitLDeclVariables(ctx);
    }

    @Override
    public Node visitDeclVariables(gParser.DeclVariablesContext ctx) {
        return super.visitDeclVariables(ctx);
    }

    @Override
    public Node visitLIdentifier(gParser.LIdentifierContext ctx) {
        return super.visitLIdentifier(ctx);
    }

    @Override
    public Node visitTypeInteger(gParser.TypeIntegerContext ctx) {
        return super.visitTypeInteger(ctx);
    }

    @Override
    public Node visitTypeBoolean(gParser.TypeBooleanContext ctx) {
        return super.visitTypeBoolean(ctx);
    }

    @Override
    public Node visitBlockStat(gParser.BlockStatContext ctx) {
        return super.visitBlockStat(ctx);
    }

    @Override
    public Node visitBlockParentStat(gParser.BlockParentStatContext ctx) {
        return super.visitBlockParentStat(ctx);
    }

    @Override
    public Node visitStatements(gParser.StatementsContext ctx) {
        return super.visitStatements(ctx);
    }

    @Override
    public Node visitSkipStat(gParser.SkipStatContext ctx) {
        return super.visitSkipStat(ctx);
    }

    @Override
    public Node visitAssignStat(gParser.AssignStatContext ctx) {
        return super.visitAssignStat(ctx);
    }

    @Override
    public Node visitIfStat(gParser.IfStatContext ctx) {
        return super.visitIfStat(ctx);
    }

    @Override
    public Node visitWhileStat(gParser.WhileStatContext ctx) {
        return super.visitWhileStat(ctx);
    }

    @Override
    public Node visitCallStat(gParser.CallStatContext ctx) {
        return super.visitCallStat(ctx);
    }

    @Override
    public Node visitListAExpr(gParser.ListAExprContext ctx) {
        return super.visitListAExpr(ctx);
    }

    @Override
    public Node visitIdentExpr(gParser.IdentExprContext ctx) {
        return super.visitIdentExpr(ctx);
    }

    @Override
    public Node visitConstExpr(gParser.ConstExprContext ctx) {
        return super.visitConstExpr(ctx);
    }

    @Override
    public Node visitNegatExpr(gParser.NegatExprContext ctx) {
        return super.visitNegatExpr(ctx);
    }

    @Override
    public Node visitParentExpr(gParser.ParentExprContext ctx) {
        return super.visitParentExpr(ctx);
    }

    @Override
    public Node visitCompaExpr(gParser.CompaExprContext ctx) {
        return super.visitCompaExpr(ctx);
    }

    @Override
    public Object visitOperatorNum(gParser.OperatorNumContext ctx) {
        return super.visitOperatorNum(ctx);
    }

    @Override
    public Node visitTrueExpr(gParser.TrueExprContext ctx) {
        return super.visitTrueExpr(ctx);
    }

    @Override
    public Node visitFalseExpr(gParser.FalseExprContext ctx) {
        return super.visitFalseExpr(ctx);
    }

    @Override
    public Node visitCompExpr(gParser.CompExprContext ctx) {
        return super.visitCompExpr(ctx);
    }

    @Override
    public Node visitNotExpr(gParser.NotExprContext ctx) {
        return super.visitNotExpr(ctx);
    }

    @Override
    public Node visitParenthesisExpr(gParser.ParenthesisExprContext ctx) {
        return super.visitParenthesisExpr(ctx);
    }

    @Override
    public Node visitOperatorCompa(gParser.OperatorCompaContext ctx) {
        return super.visitOperatorCompa(ctx);
    }

    @Override
    public Node visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Node visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Node visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Node visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Node defaultResult() {
        return super.defaultResult();
    }

//    @Override
//    protected Object aggregateResult(Object aggregate, Object nextResult) {
//        return super.aggregateResult(aggregate, nextResult);
//    }
//
//    @Override
//    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
//        return super.shouldVisitNextChild(node, currentResult);
//    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
