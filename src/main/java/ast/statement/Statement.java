package ast.statement;

import ast.global.Node;
import ast.global.Position;
import lombok.Getter;

public abstract class Statement extends Node {

    public Statement(Position position) {
        super(position);
    }
}
