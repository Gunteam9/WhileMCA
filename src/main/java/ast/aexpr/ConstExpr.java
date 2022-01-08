package ast.aexpr;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

@Getter
public class ConstExpr extends Expression {
    private String constant;

    public ConstExpr(Position position, String constant) {
        super(position);
        this.constant = constant;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
