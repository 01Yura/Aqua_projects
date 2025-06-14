package no_bugs.tests.maxelement;

/*
4. Поиск максимального числа в массиве
Напишите тесты для метода, который находит максимальное число в массиве:

public int findMax(int[] numbers) {
    return Arrays.stream(numbers).max().orElseThrow();
}

Тесты должны проверять:
Обычный массив ([3, 5, 7, 2])
Один элемент в массиве
Отрицательные числа
Пустой массив (должно выбрасываться исключение)
*/

import java.util.Arrays;

public class FindMaxElement {

    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
