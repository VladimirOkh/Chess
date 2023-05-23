public class King extends ChessPiece{
    public King(String color) {
        super(color);
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(toLine) && checkPos(toColumn)) {
            if (!((line == toLine) && (column == toColumn))){
                if (column == toColumn && Math.abs(line-toLine) == 1)
                    return true;
                else if (line == toLine && Math.abs(column-toColumn) == 1)
                    return true;
                else return (Math.abs(line - toLine) == 1) && Math.abs(column - toColumn) == 1;
            }else
                return false;
        }
        else
            return false;
    }

    @Override
    String getSymbol() {
        return "K";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
