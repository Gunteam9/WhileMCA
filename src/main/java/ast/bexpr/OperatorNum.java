package ast.bexpr;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

@Getter
public class OperatorNum extends Expression {
    private String operator;

    public OperatorNum(Position position, String operator) {
        super(position);
        this.operator = operator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
