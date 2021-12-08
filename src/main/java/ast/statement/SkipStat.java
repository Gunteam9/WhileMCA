package ast.statement;

import ast.IVisitor;

public class SkipStat extends Statement {

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visitSkipStat(this);
    }
}
