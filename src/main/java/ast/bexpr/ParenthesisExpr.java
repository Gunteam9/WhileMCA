package ast.bexpr;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

@Getter
public class ParenthesisExpr extends Expression {
    private Expression expression;

    public ParenthesisExpr(Position position, Expression expression) {
        super(position);
        this.expression = expression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
