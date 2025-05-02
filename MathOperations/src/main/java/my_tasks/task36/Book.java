package my_tasks.task36;

public class Book {
    String title;
    String author;
    int price;
    String category;

    public Book(String title, String author, int price, String category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
