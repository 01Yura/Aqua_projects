package tests.secondmaxnumber;

/*
8. Поиск второго максимального числа в массиве
Напишите тесты для метода, который находит второе по величине число:

public int findSecondMax(int[] numbers) {
    return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
}

Тесты должны проверять:
Обычные массивы
Массив с одинаковыми числами
Один элемент в массиве (должно выбрасываться исключение)
*/

/*
 * Positive:
 * new int[] {1,3,5,7,2,6,4}, 6
 * new int[] {1,6,5,7,2,6,7}, 6
 * Negative:
 * new int[] {5}, IllegalArgumentException
 *
 *
 *
 * */

import no_bugs.tests.secondmaxnumber.SecondMaxNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SecondMaxNumberTest {

    public static Stream<Arguments> ArgsForFindSecondMaxReturnsCorrectResultIfArrayIsValid() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 7, 2, 6, 4}, 6),
                Arguments.of(new int[]{1, 6, 5, 7, 2, 6}, 6)
        );
    }


    public static Stream<Arguments> ArgsForFindSecondMaxShouldThrowExceptionIfArrayHasOneElement() {
        return Stream.of(
                Arguments.of(new int[]{5})
        );
    }


    @ParameterizedTest
    @MethodSource("ArgsForFindSecondMaxReturnsCorrectResultIfArrayIsValid")
    void findSecondMaxReturnsCorrectResultIfArrayIsValid(int[] array, int expected) {
        assertEquals(expected, new SecondMaxNumber().findSecondMax(array));
    }


    @ParameterizedTest
    @MethodSource("ArgsForFindSecondMaxShouldThrowExceptionIfArrayHasOneElement")
    void findSecondMaxShouldThrowExceptionIfArrayHasOneElement(int[] array) {
        assertThrows(IllegalArgumentException.class, () -> {
            new SecondMaxNumber().findSecondMax(array);
        }, "Method should throw NoSuchElementException");
    }
}