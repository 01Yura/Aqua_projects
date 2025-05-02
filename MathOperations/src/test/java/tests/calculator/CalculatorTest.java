package tests.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"1,2,3", "10,11,21"})
    void addReturnsCorrectValue(int a, int b, int expected) {
        int actual = calculator.add(a, b);
        assertEquals(expected, actual);
    }
}