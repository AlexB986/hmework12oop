package pro.sky.java.course1.lesson1;

public class Author {
    private String FirstNameAuthor;
    private String FamilyNameAuthor;


    public Author(String FirstNameAuthor, String FamilyNameAuthor) {
        this.FirstNameAuthor = FirstNameAuthor;
        this.FamilyNameAuthor = FamilyNameAuthor;
    }

    public String getFirstNameAuthor() {
        return this.FirstNameAuthor;
    }

    public String getFamilyNameAuthor() {
        return this.FamilyNameAuthor;
    }

    public void setFirstNameAuthor(String FirstNameAuthor) {
        this.FirstNameAuthor = FirstNameAuthor;
    }

    public void setFamilyNameAuthor(String FamilyNameAuthor) {
        this.FamilyNameAuthor = FamilyNameAuthor;
    }
}