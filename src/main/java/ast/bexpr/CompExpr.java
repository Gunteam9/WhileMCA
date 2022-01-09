package ast.bexpr;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

import java.util.List;

@Getter
public class CompExpr extends Expression {
    private Expression leftExpression;
    private Opr opr;
    private Expression rightExpression;

    public CompExpr(Position position, Expression leftExpression, Opr opr, Expression rightExpression) {
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
