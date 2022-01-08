package ast.statement;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

import java.util.List;

@Getter
public class IfStat extends Statement {
    private Expression expression;
    private Statement statement;
    private List<Statement> statements;

    public IfStat(Position position, Expression expression, Statement statement, List<Statement> statements) {
        super(position);
        this.expression = expression;
        this.statement = statement;
        this.statements = statements;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
