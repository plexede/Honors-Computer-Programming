public class ChessDriver2 {
    public static void main(String[] args) {
        ChessPiece2 piece1 = new ChessPiece2(2, 'b', "Knight", "White");

        piece1.moveTo(4, 'd');
        System.out.println(piece1.displayPosition());
    }
}