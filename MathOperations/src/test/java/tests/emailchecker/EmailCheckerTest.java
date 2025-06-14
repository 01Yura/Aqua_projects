package tests.emailchecker;

/*
6. Проверка валидности email
Напишите тесты для метода, который проверяет, является ли строка валидным email:

public boolean isValidEmail(String email) {
    return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
}

Тесты должны проверять:
Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
null
*/

import no_bugs.tests.emailchecker.EmailChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailCheckerTest {
    /*
     * Positive:
     * "test@example.com", true
     * "bad@.com", false
     * "no-at-symbol", false
     * null, false
     * */


    public static Stream<Arguments> isValidEmailReturnsBooleanValueArgs() {
        return Stream.of(
                Arguments.of("test@example.com", true),
                Arguments.of("bad@.com", false),
                Arguments.of("no-at-symbol", false),
                Arguments.of(null, false),
                Arguments.of(" ", false),
                Arguments.of("", false)
        );
    }


    @ParameterizedTest
    @MethodSource("isValidEmailReturnsBooleanValueArgs")
    void isValidEmailReturnsBooleanValue(String email, boolean expected) {

        boolean actual = new EmailChecker().isValidEmail(email);
        assertEquals(actual, expected);
    }
}