package tests.commonpackage;

import no_bugs.tests.commonpackage.CommonClass1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Positive:
 *
 *
 *
 * */

class CommonClass1Test {
    CommonClass1 commonClass;


    static Stream<Arguments> ArgsForUserCanSortValidListOfStrings() {
        return Stream.of(
                Arguments.of(List.of("Java", "C", "Python"), List.of("C", "Java", "Python")),
                Arguments.of(List.of("aa", "bb", "cc"), List.of("aa", "bb", "cc")),
                Arguments.of(List.of(), List.of())
        );
    }


    public static Stream<Arguments> ArgsForUserCanFilterEvenNumbersFromValidList() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5, 6), List.of(2, 4, 6)),
                Arguments.of(List.of(1, 3, 3, 5, 5, 7), List.of()),
                Arguments.of(List.of(2, 4, 10, 8, 16, 20), List.of(2, 4, 10, 8, 16, 20)),
                Arguments.of(List.of(), List.of())
        );
    }


    @BeforeEach
    void setUp() {
        commonClass = new CommonClass1();
    }


    @ParameterizedTest
    @MethodSource("ArgsForUserCanSortValidListOfStrings")
    void UserCanSortValidListOfStrings(List<String> list, List<String> expected) {

        List<String> actual = commonClass.sortByLength(list);
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @MethodSource("ArgsForUserCanFilterEvenNumbersFromValidList")
    void UserCanFilterEvenNumbersFromValidList(List<Integer> list, List<Integer> expected) {
        List<Integer> actual = commonClass.filterEvenNumbers(list);
        assertEquals(expected, actual);
    }
}