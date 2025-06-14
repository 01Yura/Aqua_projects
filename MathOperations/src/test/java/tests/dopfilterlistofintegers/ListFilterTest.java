package tests.dopfilterlistofintegers;

import no_bugs.tests.dopfilterlistofintegers.ListFilter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListFilterTest {
    public static Stream<Arguments> ArgsForUserCanFilterValidList() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5, 6, 7, 8), List.of(2, 4, 6, 8)),
                Arguments.of(List.of(2), List.of(2)),
                Arguments.of(List.of(1), List.of()),
                Arguments.of(List.of(), List.of()
                ));
    }

    /*
     * Positive:
     * 1,2,3,4,5,6,7,8  2,4,6,8
     * 2    2
     * ()   ()
     *
     * */


    @ParameterizedTest
    @MethodSource("ArgsForUserCanFilterValidList")
    void userCanFilterValidList(List<Integer> list, List<Integer> expected) {
        assertEquals(new ListFilter().filterEvenNumbers(list), expected);
    }
}