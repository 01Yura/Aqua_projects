package no_bugs.homework_3;

public class Book {
    public static void main(String[] args) {
        Library myBook = new Library();

        myBook.setBookTitle("XXX");
        myBook.author = "Pushkin";
        myBook.year = 1999;
        myBook.category = "Tales";

        System.out.println(myBook.author);
        System.out.println(myBook.year);
        System.out.println(myBook.category);


    }
}
