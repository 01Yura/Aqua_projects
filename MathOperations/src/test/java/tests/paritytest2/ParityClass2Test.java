package tests.paritytest2;

import no_bugs.tests.paritytest2.ParityClass2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 * Positive:
 * 2, true
 * 1, false
 * -1, false
 * -2, true
 * 0, true
 *
 *
 * */

class ParityClass2Test {
    ParityClass2 parityClass2;


    @BeforeEach
    public void beforeEachTest() {
        parityClass2 = new ParityClass2();
    }


    @ParameterizedTest
    @ValueSource(ints = {2, -2, 0})
    void isEvenReturnsTrueIfNumberIsEven(int number) {
        boolean actual = parityClass2.isEven(number);
        assertTrue(actual);
    }


    @ParameterizedTest
    @ValueSource(ints = {1, -1})
    void isEvenReturnsFalseIfNumberIsOdd(int number) {
        boolean actual = parityClass2.isEven(number);
        assertFalse(actual);
    }
}