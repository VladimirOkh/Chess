public class Rook extends ChessPiece{
    public Rook(String color) {
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
                return line == toLine || column == toColumn;
            }else
                return false;
        }
        else
            return false;
    }

    @Override
    String getSymbol() {
        return "R";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
