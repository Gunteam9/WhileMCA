package ast.statement;

import ast.IVisitor;
import ast.global.Expression;
import ast.global.Position;
import lombok.Getter;

import java.util.List;

@Getter
public class IfStat extends Statement {
    private Expression expression;
    private Statement thenBlock;
    private Statement elseBLock;

    public IfStat(Position position, Expression expression, Statement thenBlock, Statement elseBLock) {
        super(position);
        this.expression = expression;
        this.thenBlock = thenBlock;
        this.elseBLock = elseBLock;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
