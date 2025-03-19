package homework_3;

//Создайте класс Library с полями:
//private String bookTitle — название книги.
//protected String author — автор.
//Default поле int year — год издания.
//public String category — категория книги.
//
//Реализуйте геттеры и сеттеры для каждого поля.
//
//В другом классе создайте объект Library и проверьте доступ к полям в зависимости от модификаторов доступа.

public class Library {

    public String category;
    protected String author;
    int year;
    private String bookTitle;

    String getBookTitle() {
        return this.bookTitle;
    }

    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    String getAuthor() {
        return this.author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    int getYear() {
        return this.year;
    }

    void setYear(int year) {
        this.year = year;
    }

    String getCategory() {
        return this.category;
    }

    void setCategory(String category) {
        this.category = category;
    }


}
