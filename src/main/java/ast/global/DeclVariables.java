package ast.global;

import ast.IVisitor;
import lombok.Getter;

@Getter
public class DeclVariables extends Node {
    private Type type;
    private ListIdentifier listIdentifier;

    public DeclVariables(Position position, Type type, ListIdentifier listIdentifier) {
        super(position);
        this.type = type;
        this.listIdentifier = listIdentifier;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
