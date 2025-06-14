package tests.leapyear;

/*
        5. Проверка, является ли год високосным
Напишите тесты для метода, который определяет, является ли год високосным:

public boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

Тесты должны проверять:
Обычные годы
Високосные (2020, 2000, 1600)
Года, которые делятся на 100, но не на 400 (1900, 2100)
*/

import no_bugs.tests.leapyear.LeapYear;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearTest {

    public static Stream<Arguments> userCanCheckIfTheYearIsLeapOrNotArgs() {
        return Stream.of(
                Arguments.of(2020, true),
                Arguments.of(2000, true),
                Arguments.of(1600, true),
                Arguments.of(1900, false),
                Arguments.of(2100, false),
                Arguments.of(0, true)
        );
    }


    /*
     * Positive:
     * 2021 -> false
     * 2024-> true
     * 1900 -> false
     * 0 -> true
     * */
    @ParameterizedTest
    @MethodSource("userCanCheckIfTheYearIsLeapOrNotArgs")
    void userCanCheckIfTheYearIsLeapOrNot(int year, boolean expected) {
        boolean actual = new LeapYear().isLeapYear(year);
        assertEquals(expected, actual);
    }
}