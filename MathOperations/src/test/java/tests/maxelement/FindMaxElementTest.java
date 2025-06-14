package tests.maxelement;


import no_bugs.tests.maxelement.FindMaxElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FindMaxElementTest {
    public static Stream<Arguments> findMaxShouldReturnMaxValueWhenArrayIsNotEmptyArgs() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 9}, 9),
                Arguments.of(new int[]{3}, 3),
                Arguments.of(new int[]{-3, -7, -2, -5}, -2)
        );
    }


    /*
    Positive:
    [3,5,7,2] -> 7
    [3] -> 3
    [-3,-7,-2,-5] -> -2
    [] -> NoSuchElementException

    */
    @ParameterizedTest
    @MethodSource("findMaxShouldReturnMaxValueWhenArrayIsNotEmptyArgs")
    void findMaxShouldReturnMaxValueWhenArrayIsNotEmpty(int[] initial, int expected) {
        int actual = new FindMaxElement().findMax(initial);
        assertEquals(expected, actual);
    }


    @Test
    void findMaxShouldThrowExceptionWhenArrayIsEmpty() {
        int[] emptyArray = new int[0];
        assertThrows(NoSuchElementException.class, () -> {
            new FindMaxElement().findMax(emptyArray);
        }, "Method should throw NoSuchElementException");
    }
}