package ast.global;

import ast.IVisitor;
import lombok.Getter;

import java.util.List;

@Getter
public class ListDeclVariables extends Node {
    private DeclVariables declVariables;
    private List<ListDeclVariables> listDeclVariables;

    public ListDeclVariables(Position position, DeclVariables declVariables, List<ListDeclVariables> listDeclVariables) {
        super(position);
        this.declVariables = declVariables;
        this.listDeclVariables = listDeclVariables;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
