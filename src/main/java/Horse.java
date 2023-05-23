public class Horse extends ChessPiece{
    public Horse(String color) {
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
                if ((Math.abs(toLine-line) == 2) && (Math.abs(toColumn-column) == 1))
                    return true;
                else return (Math.abs(toColumn - column) == 2) && (Math.abs(toLine - line) == 1);
            }else
                return false;
        }
        else
            return false;
    }

    @Override
    String getSymbol() {
        return "H";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
