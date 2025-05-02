package task4;

import java.util.Objects;

public class Rating<T extends Number> {
    private T rating;

    public T getRating() {
        return rating;
    }

    public Rating(T rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rating<?> rating1)) return false;
        return Objects.equals(getRating(), rating1.getRating());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRating());
    }

    @Override
    public String toString() {
        return "Rating{" +
                "rating=" + rating +
                '}';
    }
}
