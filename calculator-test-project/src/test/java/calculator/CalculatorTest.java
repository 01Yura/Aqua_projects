package calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    public static Stream<Arguments> calculatorDataProvider() {
        return Stream.of(Arguments.of(10, 5, 2),
                Arguments.of(20, 5, 4));
    }

    @ParameterizedTest
    @MethodSource("calculatorDataProvider")
    void divide(int initialValue1, int initialValue2, int expectedValue) {
        Calculator calculator = new Calculator();

        int actualValue = calculator.divide(initialValue1, initialValue2);
        assertEquals(expectedValue, actualValue);

    }
}