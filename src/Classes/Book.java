package Classes;

public class Book {
    private String author;
    private String bookName;

    public Book(String author,String bookName) {
        this.author = author;
        this.bookName=bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",getAuthor(),getBookName());
    }
}
