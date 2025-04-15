package test.voweltest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VowelClassTest {
    /*
     * Positive:
     * "hello" -> 2
     * "aaauuu" -> 6
     * "AEIOU" -> 5
     * " " -> 0
     * "dfghjkl" -> 0
     * "DFGH" -> 0
     *
     * Edge:
     * null -> IllegalArgumentException
     * "" -> 0
     * */
    @ParameterizedTest
    @CsvSource({"hello,2", "aaauuu,6", "AEIOU,5", "' ',0", "'',0"})
    void UserCanCountNumberOfVowelsIfWordHasVowels(String input, int expected) {
        int actual = new VowelClass().countVowels(input);
        assertEquals(expected, actual);
    }

    @Test
    void UserCanNotEnterNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            new VowelClass().countVowels(null);
        }, "Methos should throw IllegalArgumentException");
    }
}