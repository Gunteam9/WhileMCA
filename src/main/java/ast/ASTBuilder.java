package ast;

import antlr.gBaseVisitor;
import antlr.gParser;
import ast.aexpr.*;
import ast.bexpr.*;
import ast.global.*;
import ast.statement.*;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        String identifier = ctx.Identifier() != null ? ctx.Identifier().getSymbol().getText() : "";
        List<Declaration> declarations = makeList(ctx.declaration());
        ListDeclVariables listDeclVariables = (ListDeclVariables) ctx.lDeclVariables().accept(this);
        Statements statements = (Statements) ctx.statements().accept(this);
        String eof = ctx.EOF().getSymbol().getText();

        return new Program(position(ctx), identifier, declarations, listDeclVariables, statements, eof);
    }

    @Override
    public Node visitDeclaration(gParser.DeclarationContext ctx) {
        String procIdent = ctx.procIden.getText();
        ListDeclIdent listDeclIdent = (ListDeclIdent) ctx.lDeclIdent().accept(this);
        Type type = (Type) ctx.type().accept(this);
        String resIdent = ctx.resIdent != null ? ctx.resIdent.getText() : "";
        Statements statements = (Statements) ctx.statements().accept(this);

        return new Declaration(position(ctx), procIdent, listDeclIdent, type, resIdent, statements);
    }

    @Override
    public Node visitLDeclIdent(gParser.LDeclIdentContext ctx) {
        List<Type> types = makeList(ctx.type());
        List<String> identifiers = ctx.Identifier().stream().map(o -> o.getSymbol().getText()).toList();

        return new ListDeclIdent(position(ctx), types, identifiers);
    }

    @Override
    public Node visitLDeclVariables(gParser.LDeclVariablesContext ctx) {
        DeclVariables declVariables = (DeclVariables) ctx.declVariables().accept(this);
        List<ListDeclVariables> listDeclVariables = makeList(ctx.lDeclVariables());

        return new ListDeclVariables(position(ctx), declVariables, listDeclVariables);
    }

    @Override
    public Node visitDeclVariables(gParser.DeclVariablesContext ctx) {
        Type type = (Type) ctx.type().accept(this);
        ListIdentifier listIdentifier = (ListIdentifier) ctx.lIdentifier().accept(this);

        return new DeclVariables(position(ctx), type, listIdentifier);
    }

    @Override
    public Node visitLIdentifier(gParser.LIdentifierContext ctx) {
        List<String> identifiers = ctx.Identifier().stream().map(o -> o.getSymbol().getText()).toList();

        return new ListIdentifier(position(ctx), identifiers);
    }

    @Override
    public Node visitTypeInteger(gParser.TypeIntegerContext ctx) {
        return new TypeInteger(position(ctx));
    }

    @Override
    public Node visitTypeBoolean(gParser.TypeBooleanContext ctx) {
        return new TypeBoolean(position(ctx));
    }

    @Override
    public Node visitBlockStat(gParser.BlockStatContext ctx) {
        Statement statement = (Statement) ctx.statement().accept(this);

        return new BlockStat(position(ctx), statement);
    }

    @Override
    public Node visitBlockParentStat(gParser.BlockParentStatContext ctx) {
        Statements statements = (Statements) ctx.statements().accept(this);

        return new BlockParentStat(position(ctx), statements);
    }

    @Override
    public Node visitListStatement(gParser.ListStatementContext ctx) {
        Statement statement = (Statement) ctx.statement().accept(this);
        List<Statements> statements = makeList(ctx.statements());

        return new Statements(position(ctx), statement, statements);
    }

    @Override
    public Node visitSkipStat(gParser.SkipStatContext ctx) {
        return new SkipStat(position(ctx));
    }

    @Override
    public Node visitAssignStat(gParser.AssignStatContext ctx) {
        String identifier = ctx.Identifier().getSymbol().getText();
        Expression expression = (Expression) ctx.aexpression().accept(this);

        return new AssignStat(position(ctx), expression, identifier);
    }

    @Override
    public Node visitIfStat(gParser.IfStatContext ctx) {
        Expression expression = (Expression) ctx.bexpression().accept(this);
        Statement thenBlock = (Statement) ctx.thenBlock.accept(this);
        Statement elseBlock =(Statement) ctx.elseBlock.accept(this);

        return new IfStat(position(ctx), expression, thenBlock, elseBlock);
    }

    @Override
    public Node visitWhileStat(gParser.WhileStatContext ctx) {
        Expression expression = (Expression) ctx.bexpression().accept(this);
        Statement statement = (Statement) ctx.block().accept(this);

        return new WhileStat(position(ctx), expression, statement);
    }

    @Override
    public Node visitCallStat(gParser.CallStatContext ctx) {
        String identifier = ctx.Identifier().getSymbol().getText();
        Expression expression = (Expression) ctx.lAexpression().accept(this);

        return new CallStat(position(ctx), identifier, expression);
    }

    @Override
    public Node visitListAExpr(gParser.ListAExprContext ctx) {
        List<Expression> expressions = makeList(ctx.aexpression());

        return new ListAExpr(position(ctx), expressions);
    }

    @Override
    public Node visitIdentExpr(gParser.IdentExprContext ctx) {
        String identifier = ctx.Identifier().getSymbol().getText();

        return new IdentExpr(position(ctx), identifier);
    }

    @Override
    public Node visitConstExpr(gParser.ConstExprContext ctx) {
        String constant = ctx.Constant().getSymbol().getText();

        return new ConstExpr(position(ctx), constant);
    }

    @Override
    public Node visitCompaExpr(gParser.CompaExprContext ctx) {
        Expression leftExpression = (Expression) ctx.leftexpr.accept(this);
        OperatorNum opa = (OperatorNum) ctx.opa().accept(this);
        Expression rightExpression = (Expression) ctx.rigthexpr.accept(this);

        return new CompaExpr(position(ctx), leftExpression, opa, rightExpression);
    }

    @Override
    public Node visitNegatExpr(gParser.NegatExprContext ctx) {
        Expression expression = (Expression) ctx.aexpression().accept(this);

        return new NegatExpr(position(ctx), expression);
    }

    @Override
    public Node visitParentExpr(gParser.ParentExprContext ctx) {
        Expression expression = (Expression) ctx.aexpression().accept(this);

        return new ParentExpr(position(ctx), expression);
    }

    @Override
    public Node visitOperatorNum(gParser.OperatorNumContext ctx) {
        String operator = ctx.op.getText();

        return new OperatorNum(position(ctx), operator);
    }

    @Override
    public Node visitTrueExpr(gParser.TrueExprContext ctx) {
        return new TrueExpr(position(ctx));
    }

    @Override
    public Node visitFalseExpr(gParser.FalseExprContext ctx) {
        return new FalseExpr(position(ctx));
    }

    @Override
    public Node visitCompExpr(gParser.CompExprContext ctx) {
        Expression leftExpression = (Expression) ctx.leftexpr.accept(this);
        OperatorCompa opr = (OperatorCompa) ctx.opr().accept(this);
        Expression rightExpression = (Expression) ctx.rightexpr.accept(this);

        return new CompExpr(position(ctx), leftExpression, opr, rightExpression);
    }

    @Override
    public Node visitNotExpr(gParser.NotExprContext ctx) {
        Expression expression = (Expression) ctx.bexpression().accept(this);

        return new NotExpr(position(ctx), expression);
    }

    @Override
    public Node visitParenthesisExpr(gParser.ParenthesisExprContext ctx) {
        Expression expression = (Expression) ctx.bexpression().accept(this);

        return new ParenthesisExpr(position(ctx), expression);
    }

    @Override
    public Node visitOperatorCompa(gParser.OperatorCompaContext ctx) {
        String operator = ctx.op.getText();

        return new OperatorCompa(position(ctx), operator);
    }

}