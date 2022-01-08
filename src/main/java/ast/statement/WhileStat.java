package ast.statement;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

@Getter
public class WhileStat extends Statement {
    private Expression expression;
    private Statement statement;

    public WhileStat(Position position, Expression expression, Statement statement) {
        super(position);
        this.expression = expression;
        this.statement = statement;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
