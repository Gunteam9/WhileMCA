package ast.statement;

import ast.IVisitor;
import ast.global.Position;
import lombok.Getter;

import java.util.List;

@Getter
public class BlockParentStat extends Statement {
    private Statement statement;
    private List<Statement> statements;

    public BlockParentStat(Position position, Statement statement, List<Statement> statements) {
        super(position);
        this.statement = statement;
        this.statements = statements;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
