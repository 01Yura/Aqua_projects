package task4;

import java.util.Objects;

public class Movie {
    private String title;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Movie movie)) return false;
        return Objects.equals(getTitle(), movie.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getTitle());
    }

    public String getTitle() {
        return title;
    }

    public Movie(String title) {
        this.title = title;
    }
}
