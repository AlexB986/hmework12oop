package pro.sky.java.course1.lesson1;

public class Book {
    private String bookName;
    private final Author author;
    private int publicYearBook;

    public Book(String bookName, int publicYearBook, Author author) {
        this.author = author;
        this.bookName = bookName;
        this.publicYearBook = publicYearBook;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublicYearBook() {
        return this.publicYearBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublicYearBook(int publicYearBook) {
        this.publicYearBook = publicYearBook;
    }
}

