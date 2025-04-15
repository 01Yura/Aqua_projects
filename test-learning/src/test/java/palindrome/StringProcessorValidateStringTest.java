package palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorValidateStringTest extends StringProcessorTest {
    public static Stream<Arguments> userCanNotUseNullString() {
        return Stream.of(Arguments.of(null, 5));
    }
    /*
     * Positive:
     * "hello",4 -> "hello"
     * "hello",5 -> "hello"
     * "hello", 6 -> IllegalArgumentException
     * Edge:
     * null -> IllegalArgumentException
     * "",0 -> ""
     * " ", 0 -> " "
     * "hello" -> -1
     *
     * */

    @ParameterizedTest
    @CsvSource({"hello,4,hello", "hello,5,hello", "'',0,''","' ',1,' '","hello,-1,hello"})
    void userCanUseValidString(String initialString, int initialLength, String expectedString) {
        String actualString = stringProcessor.validateLength(initialString, initialLength);
        assertEquals(expectedString, actualString);
    }

    @ParameterizedTest
    @CsvSource({"hello,6"})
    void userCanNotUseInvalidString(String initialString, int initialLength) {

        assertThrows(IllegalArgumentException.class, () -> {
            String expectedString = stringProcessor.validateLength(initialString, initialLength);
        }, "Method should throw IllegalArgumentException");

    }

    @ParameterizedTest
    @MethodSource()
    void userCanNotUseNullString(String initialString, int initialLength) {
        assertThrows(IllegalArgumentException.class, () -> {
            String expectedString = stringProcessor.validateLength(initialString, initialLength);
        }, "Method should throw IllegalArgumentException");

    }
}