package ast.global;

import ast.IVisitor;
import lombok.Getter;

@Getter
public class ListIdentifier extends Node {
    private String identifier;

    public ListIdentifier(Position position, String identifier) {
        super(position);
        this.identifier = identifier;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
