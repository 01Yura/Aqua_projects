package no_bugs.practice_2;

public class Book {
//    3. Создайте класс Book
//    Поля:
//
//    String title (название книги),
//    String author (автор).
//
//    Реализуйте:
//
//    Конструктор для задания названия и автора.
//    Геттеры и сеттеры для обоих полей.
//    Метод printInfo(), который выводит:
//            "Название: Гарри Поттер, Автор: Джоан Роулинг".
//    В методе main создайте объект книги, измените автора через сеттер и выведите информацию.

    String title;
    String author;

    Book(String someTitle, String someAuthor) {
        this.title = someTitle;
        this.author = someAuthor;
    }

    public static void main(String[] args) {
        Book myBook = new Book("Kamasutra", "Some indian buddy");

        myBook.setAuthor("Pushkin");
        myBook.printInfo();
    }

    String getTitle() {
        return this.title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return this.author;
    }

    void setAuthor(String someAuthor) {
        this.author = someAuthor;
    }

    void printInfo() {
        System.out.printf("Название: " + this.title + ", Автор: " + this.author);
    }


}
