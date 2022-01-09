package ast.global;

import ast.IVisitor;
import ast.statement.Statement;
import ast.statement.Statements;
import lombok.Getter;

import java.util.List;

@Getter
public class Program extends Node {
    private String identifier;
    private List<Declaration> declarations;
    private ListDeclVariables listDeclVariables;
    private Statements statements;
    private String oef;

    public Program(Position position, String identifier, List<Declaration> declarations, ListDeclVariables listDeclVariables, Statements statements, String oef) {
        super(position);
        this.identifier = identifier;
        this.declarations = declarations;
        this.listDeclVariables = listDeclVariables;
        this.statements = statements;
        this.oef = oef;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
