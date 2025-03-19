package practice_3;

public class Library {
    //    Создайте класс Library с полями:
//    private String bookTitle — название книги.
//    private String bookTitle — автор.
//    Default поле int year — год издания.
//    public String category — категория книги.
//
//    Реализуйте геттеры и сеттеры для каждого поля.
//
//    В другом классе создайте объект Library проверьте доступ к полям в зависимости от модификаторов доступа.

    public String category;
    int year;
    private String bookTitle;
    private String bookAuthor;

    String getBookTitle() {
        return this.bookTitle;
    }

    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    String getBookAuthor() {
        return this.bookAuthor;
    }

    void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
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
