package pro.sky.java.course1.lesson1;

public class Author {
    private String firstNameAuthor;
    private String familyNameAuthor;

    public Author(String firstNameAuthor, String familyNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.familyNameAuthor = familyNameAuthor;
    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }

    public String getFamilyNameAuthor() {
        return this.familyNameAuthor;
    }

    public void setFirstNameAuthor(String firstNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
    }

    public void setFamilyNameAuthor(String familyNameAuthor) {
        this.familyNameAuthor = familyNameAuthor;
    }
}