package ast.bexpr;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

@Getter
public class TrueExpr extends Expression {

    public TrueExpr(Position position) {
        super(position);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
