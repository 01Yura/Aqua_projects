package tests.factorial;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 * Positive:
 * 0,1
 * 1,1
 * 3,6
 * 5,120
 * Negative:
 * -3, IllegalArgumentException
 * */

class FindFactorialTest {

    public static Stream<Arguments> argsForFactorialReturnsCorrectResultIfArgIsValid() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(3, 6),
                Arguments.of(5, 120)
        );
    }

    @ParameterizedTest
    @MethodSource("argsForFactorialReturnsCorrectResultIfArgIsValid")
    void factorialReturnsCorrectResultIfArgIsValid(int number, int expected) {
        int actual = new FindFactorial().factorial(number);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {-5})
    void factorialThrowsExceptionIfArgIsNotValid(int number) {
        assertThrows(IllegalArgumentException.class, () -> {
            new FindFactorial().factorial(number);
        }, "Method should throw IllegalArgumentException");
    }
}