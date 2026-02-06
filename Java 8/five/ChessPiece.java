public class ChessPiece {
    int rank;
    char file;
    String name;
    String color = "White";

    void setRook() {
        name = "Rook";
    }
    void moveRankto5() {
        rank = 5;
    }
    void moveFiletoH() {
        file = 'H';
    }
    void displayPosition() {
        System.out.println("The " + color + " " + name + " is at " + file + rank);
    }
}