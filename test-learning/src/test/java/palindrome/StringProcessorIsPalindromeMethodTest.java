package palindrome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("class StringProcessor, method isPalindrome()")
class StringProcessorIsPalindromeMethodTest extends StringProcessorTest {
/*
* Positive:
*   Even:
*       "abba" -> true
*   Odd:
*       "ere" -> true
*   Edge:
*       "a" -> true
*       " " -> ?
*       "" -> ?
*       null -> IllegalArgumentException
* Negative:
*       "hello" -> false
*
*
* */
    @ParameterizedTest
    @ValueSource(strings = {"abba", "ere", "a", " ", ""})
    void userCanCheckIsValidStringIsPalindrome(String initial){

        boolean actual = stringProcessor.isPalindrome(initial);
        assertTrue(actual);
    }
    @ParameterizedTest
    @ValueSource(strings = {"hello"})
    void userCanCheckIsValidStringIsNotPalindrome(String initial){

        boolean actual = stringProcessor.isPalindrome(initial);
        assertFalse(actual);
    }
    @Test
    void userCanNotUseNullString(){
        assertThrows(IllegalArgumentException.class, () -> {
            boolean actual = stringProcessor.isPalindrome(null);
        }, "Method should throw IllegalArgumentException");

    }

}
