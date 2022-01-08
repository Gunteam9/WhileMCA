package ast.statement;

import ast.IVisitor;
import ast.global.Position;
import lombok.Getter;

@Getter
public class SkipStat extends Statement {

    public SkipStat(Position position) {
        super(position);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
