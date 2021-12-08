package ast.global;

import ast.IVisitor;

public abstract class Node {
    protected Position position;

    public Position getPosition() {
        return position;
    }

    public abstract <T> T accept(IVisitor<T> visitor);
}
