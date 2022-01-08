package ast.global;

import ast.IVisitor;
import lombok.Getter;

@Getter
public class OperatorCompa extends Node {
    private String operator;

    public OperatorCompa(Position position, String operator) {
        super(position);
        this.operator = operator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
