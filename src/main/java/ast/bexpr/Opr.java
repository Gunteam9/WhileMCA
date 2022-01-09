package ast.bexpr;

import ast.IVisitor;
import ast.global.Node;
import ast.global.Position;
import lombok.Getter;

@Getter
public class Opr extends Node {

    public Opr(Position position) {
        super(position);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
