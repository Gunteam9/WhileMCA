package ast.statement;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

@Getter
public class CallStat extends Statement {
    private String identifier;
    private Expression expression;

    public CallStat(Position position, String identifier, Expression expression) {
        super(position);
        this.identifier = identifier;
        this.expression = expression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
