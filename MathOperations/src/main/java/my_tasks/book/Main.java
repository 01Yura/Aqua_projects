package my_tasks.book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Alphabet", 1955);
        Book book2 = new Book("History of Time", 1988);
        Book book3 = new Book("Science for Kids", 1988);
        Book book4 = new Book("Modern Java", 2020);
        Book book5 = new Book("Advanced Java", 2020);
        Book book6 = new Book("Python Basics", 2015);
        Book book7 = new Book("Deep Learning", 2015);
        Book book8 = new Book("Clean Code", 2008);
        Book book9 = new Book("Refactoring", 2008);
        Book book10 = new Book("Design Patterns", 1994);
        Book book11 = new Book("Architecture", 1994);
        Book book12 = new Book("Algorithms", 2000);
        Book book13 = new Book("Data Structures", 2000);
        Book book14 = new Book("AI Revolution", 2023);
        Book book15 = new Book("AI for All", 2023);
        Book book16 = new Book("Machine Learning", 2019);
        Book book17 = new Book("Spring in Action", 2019);
        Book book18 = new Book("Docker Guide", 2017);
        Book book19 = new Book("Kubernetes in Practice", 2017);
        Book book20 = new Book("Legacy Code", 2005);

        Library pushkinLibrary = new Library();

        System.out.println("------------All books after adding---------------");
        pushkinLibrary.addBook(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, book14, book15);
        pushkinLibrary.showAllBooks();
        System.out.println();

        System.out.println("------------All books after removing---------------");
        pushkinLibrary.removeBook(book11, book12, book13, book14, book15);
        pushkinLibrary.showAllBooks();
        System.out.println();


        System.out.println("------------Users take books---------------");
        pushkinLibrary.giveBookToPerson("History of Time", "Yura");
        pushkinLibrary.giveBookToPerson("Science for Kids", "Yura");
        pushkinLibrary.giveBookToPerson("Modern Java", "Max");
        pushkinLibrary.giveBookToPerson("Modern Java", "Kolya");
        pushkinLibrary.giveBookToPerson("Bla-Bla-Bla", "Kolya");
        System.out.println();

        System.out.println("------------showAllUsersWithBooks---------------");
        pushkinLibrary.showAllUsersWithBooks();
        System.out.println();

        System.out.println("------------showAllAvailableBooks---------------");
        pushkinLibrary.showAllAvailableBooks();
        System.out.println();

        System.out.println("------------showAllUnavailableBooks---------------");
        pushkinLibrary.showAllUnavailableBooks();
        System.out.println();

        System.out.println("------------sortBooksByAge---------------");
        pushkinLibrary.sortBooksByAge();
        System.out.println();

        System.out.println("------------groupBooksByAge---------------");
        pushkinLibrary.groupBooksByAge();
        System.out.println();

        System.out.println("------------partitionBooksByAvailability---------------");
        pushkinLibrary.partitionBooksByAvailability();
        System.out.println();

        System.out.println("------------partitionBooksByAvailability---------------");
        pushkinLibrary.takeBookFromPerson("History of Time", "Yura");
        pushkinLibrary.takeBookFromPerson("Modern Java", "Max");
        System.out.println();

        System.out.println("------------showAllUsersWithBooks---------------");
        pushkinLibrary.showAllUsersWithBooks();
        System.out.println();

        System.out.println("------------showAllAvailableBooks---------------");
        pushkinLibrary.showAllAvailableBooks();
        System.out.println();

        System.out.println("------------showAllUnavailableBooks---------------");
        pushkinLibrary.showAllUnavailableBooks();
        System.out.println();


    }
}
