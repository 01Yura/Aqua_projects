package no_bugs.homework_2;

public class Book {
//    3. Создайте класс Book
//    Поля:
//    String title (название книги),
//    String author (автор).
//    Реализуйте:
//    Конструктор для задания названия и автора.
//    Геттеры и сеттеры для обоих полей.
//    Метод printInfo(), который выводит:
//            "Название: Гарри Поттер, Автор: Джоан Роулинг".
//    В методе main создайте объект книги, измените автора через сеттер и выведите информацию.

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {

        Book myBook = new Book("Harry Potter", "Joahn Rolling");

        myBook.setAuthor("Pushkin");

        myBook.printInfo();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ;     //Сравниваем обьект с самим собой, и если равен, то возвращаем true
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        ;       // Проверяю 2 крайних случая и возвращаю false, если обьект равен null или класс текущего обьекта не равен классу сравниваемого
        Book that = (Book) obj;     // Так как предыдущей строкой мы проверили, что это один и тот же класс, то можно явно привести (кастовать) obj к нашему классу, чтобы можно было начать сравнение по полям
        if (this.title.equals(that.title) && (this.author.equals(that.author))) {
            return true;
        }       // Сравниваем поля
        else {
            return false;
        }
    }
//    Сначала отдельно вычисляем хеши title и author:
//    Если значение null, то хеш считается как 0, чтобы избежать ошибки.
//    Потом смешиваем хеши:
//    result = 31 * titleHash + authorHash; — это стандартная формула, она помогает уменьшить коллизии (совпадения хешей у разных объектов).

    @Override
    public int hashCode() {
        int titleHash = (title != null) ? title.hashCode() : 0;
        int authorHash = (author != null) ? author.hashCode() : 0;

        int result = 31 * titleHash + authorHash;
        return result;
    }

    @Override
    public Book clone() {
        return new Book(this.getTitle(), this.author);
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

    void setAuthor(String author) {
        this.author = author;
    }

    void printInfo() {
        System.out.println("Title: " + this.title + " Author: " + this.author);
    }


}
