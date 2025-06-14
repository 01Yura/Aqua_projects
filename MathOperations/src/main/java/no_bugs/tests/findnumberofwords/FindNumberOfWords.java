package no_bugs.tests.findnumberofwords;

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

public class FindNumberOfWords {

    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }
}
