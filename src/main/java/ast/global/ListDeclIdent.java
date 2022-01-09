package ast.global;

import ast.IVisitor;
import lombok.Getter;

import java.util.List;

@Getter
public class ListDeclIdent extends Node {
    private List<Type> types;
    private List<String> identifiers;

    public ListDeclIdent(Position position, List<Type> types, List<String> identifiers) {
        super(position);
        this.types = types;
        this.identifiers = identifiers;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
