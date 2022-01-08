package ast.global;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class Position {
    private final int line;
    private final int column;

    public Position copy(){
        return new Position(line, column);
    }

    @Override
    public String toString() {
        return "[line=" + line + ", column=" + column + "]";
    }

}
