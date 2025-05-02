package tests.paritytest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParityClassTest extends ParityClassBeforeAllTest {
    /*
     * Positive:
     * 10 -> true
     * -10 -> true
     * Negative:
     * 11 -> false
     * -11 -> false
     * Edge:
     * 0 -> true
     *
     *
     * */


    @ParameterizedTest
    @ValueSource(ints = {10, -10, 0})
    void UserCanCheckIsEvenNumbersReturnTrue(int initialValue) {
        boolean actual = parityClass.isEven(initialValue);
        assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {11, -11})
    void UserCanCheckIsOddNumbersReturnFalse(int initialValue) {
        boolean actual = parityClass.isEven(initialValue);
        assertFalse(actual);
    }

}