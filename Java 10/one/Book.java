public class Book {
    private String title;
    private String author;
    private int numPages;
    private String genre;

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.genre = "Fiction";
    }

    public Book(String title, String author, int numPages, String genre) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nNumber of Pages: " + numPages + "\nGenre: " + genre;
    }
}
