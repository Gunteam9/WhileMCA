package ast;

public class Position {
    private final int line;
    private final int column;

    public Position(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public Position copy(){
        return new Position(line, column);
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return "[line=" + line + ", column=" + column + "]";
    }

}
