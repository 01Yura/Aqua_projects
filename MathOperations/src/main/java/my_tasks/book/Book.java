package my_tasks.book;

import java.util.Objects;

public class Book {
    private static int idCount = 0;

    private int id;
    private String title;
    private int ageOfIssue;
    private boolean isAvailable;
    private String user;

    public Book(String title, int ageOfIssue) {
        idCount++;
        this.id = idCount;
        this.title = title;
        this.ageOfIssue = ageOfIssue;
        this.isAvailable = true;
        this.user = null;
    }

    public static int getIdCount() {
        return idCount;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getAgeOfIssue() {
        return ageOfIssue;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", ageOfIssue=" + ageOfIssue +
                ", isAvailable=" + isAvailable +
                ", user='" + user + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return getId() == book.getId() && Objects.equals(getTitle(), book.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle());
    }
}
