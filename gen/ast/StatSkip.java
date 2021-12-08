package ast;

import ast.Statement;

public class StatSkip extends Statement {

    @Override
    public <T> T accept(gVisitor<T> visitor) {
        return null;
    }
}
