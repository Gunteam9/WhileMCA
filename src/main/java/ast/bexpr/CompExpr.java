package ast.bexpr;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.OperatorCompa;
import ast.global.Position;
import lombok.Getter;

@Getter
public class CompExpr extends Expression {
    private Expression leftExpression;
    private OperatorCompa opr;
    private Expression rightExpression;

    public CompExpr(Position position, Expression leftExpression, OperatorCompa opr, Expression rightExpression) {
        super(position);
        this.leftExpression = leftExpression;
        this.opr = opr;
        this.rightExpression = rightExpression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
