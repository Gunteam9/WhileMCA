package ast.global;

import ast.IVisitor;
import lombok.Getter;

@Getter
public class TypeBoolean extends Type {

    public TypeBoolean(Position position) {
        super(position);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
