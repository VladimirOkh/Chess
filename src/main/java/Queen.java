public class Queen extends ChessPiece{
    public Queen(String color) {
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
                if (line == toLine || column == toColumn){
                    return true;
                }else return Math.abs(line - toLine) == Math.abs(column - toColumn);
            }else
                return false;
        }
        else
            return false;
    }

    @Override
    String getSymbol() {
        return "Q";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
