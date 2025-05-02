package tests.dopfilterlistofintegers;

import java.util.List;
import java.util.stream.Collectors;

//11. Фильтрация списка чисел (оставить только чётные)
//Метод:
//public List<Integer> filterEvenNumbers(List<Integer> numbers) {
//    return numbers.stream()
//            .filter(n -> n % 2 == 0)
//            .collect(Collectors.toList());
//}
//
//Тесты:
//
//Обычный список ([1, 2, 3, 4, 5, 6] → [2, 4, 6])
//Список без чётных чисел
//Пустой список

public class ListFilter {

    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

}
