public class Pawn extends ChessPiece{

    public Pawn(String color) {
        super(color);
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(toLine) && checkPos(toColumn)) {
            if (!((line == toLine) && (column == toColumn))) {
                if ((color.equals("White")) && (line == 1) && (toLine == 3)){
                    return true;
                }else if ((color.equals("Black")) && (line == 6) && (toLine == 4)){
                    return true;
                }else return (toColumn == column) && (Math.abs(toLine - line)) == 1;
            }else
                return false;
        }else
            return false;
    }

    @Override
    String getSymbol() {
        return "P";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
