package my_tasks.Test19;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book fantasy = new Book("Peter Pan", "Jan pol Belmondo", 100);
        library.addBook(fantasy);
        library.deleteBook("Peter Pan");
        library.printAllBooks();
    }
}
