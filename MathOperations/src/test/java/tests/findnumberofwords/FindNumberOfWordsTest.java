package tests.findnumberofwords;

/*
9. Подсчёт количества слов в строке
Напишите тесты для метода, который считает количество слов в строке:

public int countWords(String sentence) {
    return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
}

Тесты должны проверять:
Пустую строку
null
Строку с несколькими пробелами
*/

/*
 * Positive:
"hello world baby", 3
"Hello World!", 2
" ", 0
"", 0
" hello ", 1
 * */

import no_bugs.tests.findnumberofwords.FindNumberOfWords;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindNumberOfWordsTest {

    public static Stream<Arguments> ArgsForUserCanCountNumberOfWordsInValidString() {
        return Stream.of(
                Arguments.of("hello world baby", 3),
                Arguments.of("Hello World!", 2),
                Arguments.of(" ", 0),
                Arguments.of("", 0)
        );
    }


    @ParameterizedTest
    @MethodSource("ArgsForUserCanCountNumberOfWordsInValidString")
    void UserCanCountNumberOfWordsInValidString(String string, int expected) {
        int actual = new FindNumberOfWords().countWords(string);
        assertEquals(expected, actual);
    }
}