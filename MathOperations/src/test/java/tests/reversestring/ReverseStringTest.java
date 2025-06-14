package tests.reversestring;


import no_bugs.tests.reversestring.ReverseString;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {
    public static Stream<Arguments> userCanReverseValidString() {
        return Stream.of(
                Arguments.of("qwerty", "ytrewq"),
                Arguments.of("asdf", "fdsa"),
                Arguments.of("a", "a"),
                Arguments.of(" ", " "),
                Arguments.of("", ""),
                Arguments.of(null, null)
        );
    }
    /*
     * Positive:
     * "qwerty" -> "ytrewq"
     * "asdf" -> "fdsa"
     * "a" -> "a"
     * " " -> " "
     * "" -> ""
     * null -> null
     *
     *
     *
     * */


    @ParameterizedTest
    @MethodSource("userCanReverseValidString")
    void userCanReverseValidString(String initial, String expected) {
        ReverseString reverseString = new ReverseString();
        String actual = reverseString.reverse(initial);
        assertEquals(expected, actual);
    }
}