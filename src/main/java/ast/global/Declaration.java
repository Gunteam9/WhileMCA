package ast.global;

import ast.IVisitor;
import ast.statement.Statement;
import lombok.Getter;

import java.util.List;

@Getter
public class Declaration extends Node {
    private ListDeclIdent listDeclIdent;
    private List<Statement> statements;

    public Declaration(Position position, ListDeclIdent listDeclIdent, List<Statement> statements) {
        super(position);
        this.listDeclIdent = listDeclIdent;
        this.statements = statements;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
