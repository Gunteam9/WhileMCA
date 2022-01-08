package ast.aexpr;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

@Getter
public class IdentExpr extends Expression {
    private String identifier;

    public IdentExpr(Position position, String identifier) {
        super(position);
        this.identifier = identifier;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
