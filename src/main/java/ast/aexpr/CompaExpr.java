package ast.aexpr;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

import java.util.List;

@Getter
public class CompaExpr extends Expression {
    private Expression leftExpression;
    private Opa opa;
    private Expression rightExpression;

    public CompaExpr(Position position, Expression leftExpression, Opa opa, Expression rightExpression) {
        super(position);
        this.leftExpression = leftExpression;
        this.opa = opa;
        this.rightExpression = rightExpression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
