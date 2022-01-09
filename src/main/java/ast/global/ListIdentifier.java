package ast.global;

import ast.IVisitor;
import lombok.Getter;

import java.util.List;

@Getter
public class ListIdentifier extends Node {
    private List<String> identifier;

    public ListIdentifier(Position position, List<String> identifier) {
        super(position);
        this.identifier = identifier;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
