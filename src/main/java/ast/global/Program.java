package ast.global;

import ast.IVisitor;
import ast.statement.Statement;
import lombok.Getter;

import java.util.List;

@Getter
public class Program extends Node {
    private List<Declaration> declarations;
    private List<Statement> statements;

    public Program(Position position, List<Declaration> declarations, List<Statement> statements) {
        super(position);
        this.declarations = declarations;
        this.statements = statements;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
