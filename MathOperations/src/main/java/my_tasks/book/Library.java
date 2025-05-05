package my_tasks.book;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    List<Book> listAllBooks;
    Map<String, List<Book>> mapUnavailableBooks;

    public Library() {
        this.listAllBooks = new ArrayList<>();
        this.mapUnavailableBooks = new HashMap<>();
    }

    public void addBook(Book... books) {
        boolean result = false;
        for (Book book : books) {
            result = listAllBooks.add(book);
        }
    }

    public void removeBook(Book... books) {
        int counter = books.length - 1;
        while (counter >= 0) {
            listAllBooks.remove(books[counter]);
            counter--;
        }
    }

    public void showAllBooks() {
        listAllBooks.forEach(System.out::println);
    }

    public boolean giveBookToPerson(String title, String name) {
        boolean flag = false;
        for (Book book : listAllBooks) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                mapUnavailableBooks.putIfAbsent(name, new ArrayList<>());
                mapUnavailableBooks.get(name).add(book);
                book.setAvailable(false);
                book.setUser(name);
                System.out.println(name + " took book " + book.getTitle());
                flag = true;
                return flag;
            }
        }


        for (
                Book book2 : listAllBooks) {
            if (book2.getTitle().equals(title) && !book2.isAvailable()) {
                System.out.println(name + ", someone has already taken this book");
                flag = false;
                return flag;
            }
        }
        System.out.println(name + " there is no such book in library");
        return flag;
    }

    public boolean takeBookFromPerson(String title, String name) {
        for (Book book : listAllBooks) {
            if (book.getTitle().equals(title) && !book.isAvailable()) {
                book.setAvailable(true);
                book.setUser(null);
                mapUnavailableBooks.get(name).remove(book);
                System.out.println("User " + name + " returned the book " + title);
                return true;
            }

        }
        return false;
    }

    public void showAllUsersWithBooks() {
        mapUnavailableBooks.entrySet().forEach(System.out::println);
    }

    public void showAllAvailableBooks() {
        listAllBooks.stream()
                .sorted(Comparator.comparing(Book::getId))
                .filter(book -> book.isAvailable() == true)
                .forEach(System.out::println);
    }

    public void showAllUnavailableBooks() {
        listAllBooks.stream().filter(book -> book.isAvailable() == false).forEach(System.out::println);
    }

    public void sortBooksByAge() {
        listAllBooks = listAllBooks.stream().sorted(Comparator.comparing(Book::getAgeOfIssue)).toList();
        listAllBooks.forEach(System.out::println);
    }

    public void groupBooksByAge() {
        Map<Integer, List<Book>> map;
        map = listAllBooks.stream().collect(Collectors.groupingBy(Book::getAgeOfIssue));
        map.entrySet().forEach(System.out::println);
    }

    public void partitionBooksByAvailability() {
        Map<Boolean, List<Book>> map;
        map = listAllBooks.stream().collect(Collectors.partitioningBy(book -> book.isAvailable() == true));
        map.entrySet().forEach(System.out::println);
    }

}

