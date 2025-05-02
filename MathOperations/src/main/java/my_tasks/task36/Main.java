package my_tasks.task36;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Book book1 = new Book("title1", "autho1", 100, "Fantasy");
        Book book2 = new Book("title2", "autho2", 300, "Tech");
        Book book3 = new Book("title2", "autho3", 200, "Tech");
        Book book4 = new Book("title4", "autho4", 50, "Fantasy");
        Book book5 = new Book("title5", "autho5", 10, "Medice");

        bookStore.addBook(book1);
        bookStore.addBook(book2);
        bookStore.addBook(book3);
        bookStore.addBook(book4);
        bookStore.addBook(book5);

        bookStore.printAllBooks();
        System.out.println("--------------------------------");

        System.out.println(bookStore.filterByCategory("Tech"));
        System.out.println();


    }
}
