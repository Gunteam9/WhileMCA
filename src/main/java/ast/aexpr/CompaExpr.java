package ast.aexpr;

import ast.IVisitor;
import ast.bexpr.OperatorNum;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

import java.util.List;

@Getter
public class CompaExpr extends Expression {
    private Expression leftExpression;
    private OperatorNum opa;
    private Expression rightExpression;

    public CompaExpr(Position position, Expression leftExpression, OperatorNum opa, Expression rightExpression) {
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
