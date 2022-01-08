package ast.statement;

import ast.IVisitor;
import ast.global.Position;
import lombok.Getter;

@Getter
public class BlockStat extends Statement {
    private Statement statement;

    public BlockStat(Position position, Statement statement) {
        super(position);
        this.statement = statement;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
