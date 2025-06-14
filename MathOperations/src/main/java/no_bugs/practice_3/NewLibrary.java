package no_bugs.practice_3;

public class NewLibrary {
    public static void main(String[] args) {
        Library myBook = new Library();
        System.out.println(myBook.getBookTitle());
        myBook.setBookTitle("Masha and bear");
        System.out.println(myBook.getBookTitle());

        myBook.year = 1800;

        myBook.category = "Tales";

        System.out.println(myBook.getYear());
        System.out.println(myBook.getCategory());

    }

}
