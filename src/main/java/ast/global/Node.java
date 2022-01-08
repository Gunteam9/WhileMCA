package ast.global;

import ast.IVisitor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public abstract class Node {
    protected Position position;

    public Position getPosition() {
        return position;
    }

    public abstract <T> T accept(IVisitor<T> visitor);
}
