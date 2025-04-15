package palindrome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Class StringProcessor, method reverse()")
public class StringProcessorReverseMethodTest extends StringProcessorTest {
    public static Stream<Arguments> userCanReverseValidString() {
        return Stream.of(
                Arguments.of("hello","olleh"),
                Arguments.of("a","a"),
                Arguments.of(" ", " ")
        );
    }

    /*
     * Tests for string reverse
     * Positive:
     * "hello" -> "olleh"
     * Edge:
     * "a" -> "a"
     * "" -> ""
     * Negative:
     * null -> IllegalArgumentException
     *
     *
     * */
    @ParameterizedTest
//    @CsvSource({"'hello','olleh'", "'a','a'", "'',''"})
    @MethodSource("userCanReverseValidString")
//    @CsvFileSource(resources = "/data.csv")
    public void userCanReverseValidString(String initial, String expected) {

        String actual = stringProcessor.reverse(initial);
        assertEquals(expected, actual, "String is not reversed");
    }

    @Test
    public void userCanNotReverseNullString(){

        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "There is should be exception");

    }


}
