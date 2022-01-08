package ast.aexpr;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

import java.util.List;

@Getter
public class CompaExpr extends Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private List<Expression> expressions;

    public CompaExpr(Position position, Expression leftExpression, Expression rightExpression, List<Expression> expressions) {
        super(position);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.expressions = expressions;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
