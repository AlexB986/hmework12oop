package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy");
        Author bulgakov = new Author("Mihail", "Bulgakov");

        Book warAndPeace = new Book("War and Peace", 1867, tolstoy);
        Book masterAndMargarita = new Book("Master and Margarita", 1940, bulgakov);

        masterAndMargarita.setPublicYearBook(1928);
        tolstoy.setFamilyNameAuthor("Leva");
        System.out.println("Year " + masterAndMargarita.getPublicYearBook());
        System.out.println(tolstoy.getFamilyNameAuthor());
    }
}

