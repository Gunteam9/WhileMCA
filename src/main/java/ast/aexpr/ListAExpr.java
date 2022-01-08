package ast.aexpr;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

import java.util.List;

@Getter
public class ListAExpr extends Expression {
    private List<Expression> expressions;

    public ListAExpr(Position position, List<Expression> expressions) {
        super(position);
        this.expressions = expressions;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
