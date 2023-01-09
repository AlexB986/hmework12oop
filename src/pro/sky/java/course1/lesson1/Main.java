package pro.sky.java.course1.lesson1;

public class Main {

    public static void main(String[] args) {
        Book warAndPeace = new Book("War and Peace", 1867);
        Book masterAndMargarita = new Book("Master and Margarita", 1940);

        Author tolstoy = new Author("Lev", "Tolstoy");
        Author bulgakov = new Author("Mihail", "Bulgakov");

        masterAndMargarita.setPublicYearBook(1928);
        System.out.println("Year " + masterAndMargarita.getPublicYearBook());
    }
}
