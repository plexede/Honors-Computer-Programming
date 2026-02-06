public class ChessDriver {
    public static void main(String[] args) {
        ChessPiece piece1 = new ChessPiece();

        piece1.setRook();
        piece1.moveRankto5();
        piece1.moveFiletoH();
        piece1.displayPosition();
    }
}