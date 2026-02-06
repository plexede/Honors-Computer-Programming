public class ChessPiece2 {
    int rank;
    char file;
    String name;
    String color;

    public ChessPiece2(int rank, char file, String name, String color) {
        this.rank = rank;
        this.file = file;
        this.name = name;
        this.color = color;
    }

    void moveTo(int newRank, char newFile) {
        rank = newRank;
        file = newFile;
    }

    String displayPosition() {
        return "The " + color + " " + name + " is at " + file + rank;
    }
}