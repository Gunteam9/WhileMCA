package ast.statement;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Node;
import ast.global.Position;
import lombok.Getter;

@Getter
public class AssignStat extends Statement {
    private Expression expression;
    private String identifier;

    public AssignStat(Position position, Expression expression, String identifier) {
        super(position);
        this.expression = expression;
        this.identifier = identifier;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
