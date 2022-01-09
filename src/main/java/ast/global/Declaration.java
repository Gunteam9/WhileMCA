package ast.global;

import ast.IVisitor;
import ast.statement.Statement;
import ast.statement.Statements;
import lombok.Getter;

import java.util.List;

@Getter
public class Declaration extends Node {
    private String procIdent;
    private ListDeclIdent listDeclIdent;
    private Type type;
    private String resIdent;
    private Statements statements;

    public Declaration(Position position, String procIdent, ListDeclIdent listDeclIdent, Type type, String resIdent, Statements statements) {
        super(position);
        this.procIdent = procIdent;
        this.listDeclIdent = listDeclIdent;
        this.type = type;
        this.resIdent = resIdent;
        this.statements = statements;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
