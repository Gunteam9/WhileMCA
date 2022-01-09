package ast.statement;

import ast.IVisitor;
import ast.global.Node;
import ast.global.Position;
import lombok.Getter;

import java.util.List;

@Getter
public class Statements extends Node {
    private Statement statement;
    private List<Statements> statements;

    public Statements(Position position, Statement statement, List<Statements> statements) {
        super(position);
        this.statement = statement;
        this.statements = statements;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
