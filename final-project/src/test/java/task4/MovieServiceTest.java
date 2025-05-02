package task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {
    MovieService netflix;

    @BeforeEach
    void setUp() {
        netflix = new MovieService();


    }

    @Test
    void addMovieShouldReturnTrueIfMovieIsNotILibrary() {
        assertTrue(netflix.addMovie("Terminator"));
    }

    @Test
    void addMovieShouldReturnFalseIfMovieAlreadyIsInLibrary() {
        netflix.getMap().put(new Movie("Home alone"), new ArrayList<>());
        assertFalse(netflix.addMovie("Home alone"));
    }

    @ParameterizedTest
    @ValueSource(doubles = {0,1,5,9,10})
    void addGradeShouldReturnTrueIfMovieExistAndRatingIsValid(double rating) {
        String title = "Home alone";
        assertTrue(netflix.addGrade(title,rating));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1,11})
    void addGradeShouldReturnFalseIfMovieExistButRatingIsInvalid(double rating) {
        String title = "Home alone";
        assertFalse(netflix.addGrade(title,rating));
    }

    @ParameterizedTest
    @ValueSource(doubles = {1,5,9,10})
    void addGradeShouldReturnFalseIfRatingIsValidButMovieIsNotExist(double rating) {
        netflix.getMap().put(new Movie("Home alone"), new ArrayList<>());
        String title = "Aliens";
        assertFalse(netflix.addGrade(title,rating));
    }



    @Test
    void averageShouldReturnMapOfMoviesSortedByAverageRating() {
        netflix.getMap().put(new Movie("Home alone"), List.of(new Rating(9.0), new Rating(7.0)));
        netflix.getMap().put(new Movie("Terminator"), List.of(new Rating(15.0), new Rating(5.0)));

        LinkedHashMap<Movie, Double> expected = new LinkedHashMap<>();
        expected.put(new Movie("Terminator"), 10.0);
        expected.put(new Movie("Home alone"), 8.0);

        LinkedHashMap<Movie, Double> actual = netflix.sortByAverageRating();


        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"'Home alone', 8.0", "'Terminator', 10.0"})
    void averageShouldReturnValueOfAverageRatingOfSpecificMovie(String title ,double expected) {
        netflix.getMap().put(new Movie("Home alone"), List.of(new Rating(9.0), new Rating(7.0)));
        netflix.getMap().put(new Movie("Terminator"), List.of(new Rating(15.0), new Rating(5.0)));


        assertEquals(expected, netflix.average(title));
    }


}