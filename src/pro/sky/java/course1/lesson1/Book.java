package pro.sky.java.course1.lesson1;

public class Book {
    private String BookName;
    private int PublicYearBook;

    public Book(String AuthorName, int YearBook) {
        this.BookName = BookName;
        this.PublicYearBook = YearBook;
    }

    public String getBookName() {
        return this.BookName;
    }

    public int getPublicYearBook() {
        return this.PublicYearBook;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public void setPublicYearBook(int PublicYearBook) {
        this.PublicYearBook = PublicYearBook;
    }
}
