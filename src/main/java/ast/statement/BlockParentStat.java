package ast.statement;

import ast.IVisitor;
import ast.global.Position;
import lombok.Getter;

import java.util.List;

@Getter
public class BlockParentStat extends Statement {
    private Statements statements;

    public BlockParentStat(Position position, Statements statements) {
        super(position);
        this.statements = statements;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
