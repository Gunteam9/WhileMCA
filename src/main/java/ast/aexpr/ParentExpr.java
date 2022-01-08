package ast.aexpr;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

@Getter
public class ParentExpr extends Expression {
    private Expression expression;

    public ParentExpr(Position position, Expression expression) {
        super(position);
        this.expression = expression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
