package my_tasks.task51.fromscrinning;
/*Поиск суммы элементов массива
Задача: Напишите функцию, которая принимает массив чисел и возвращает сумму его элементов.

Проверка палиндрома
Задача: Напишите функцию, которая принимает строку и возвращает true, если строка является палиндромом, и false в противном случае.

Факториал числа
Задача: Напишите функцию, которая вычисляет факториал заданного числа.

Фибоначчиева последовательность
Задача: Напишите функцию, которая принимает число n и возвращает n-ый элемент последовательности Фибоначчи.

Поиск максимального/минимального элемента в массиве
Задача: Напишите функцию, которая принимает массив чисел и возвращает максимальный (или минимальный) элемент.

Линейный поиск
Задача: Напишите функцию, которая выполняет линейный поиск элемента в массиве и возвращает индекс этого элемента или -1, если элемент не найден.

Поиск гласных букв в строке
Задача: Напишите функцию, которая подсчитывает количество гласных букв в данной строке.

Обращение строки
Задача: Напишите функцию, которая принимает строку и возвращает её в обратном порядке.

Сортировка массива
Задача: Напишите функцию, которая сортирует массив чисел по возрастанию или убыванию.

Проверка на простое число
Задача: Напишите функцию, которая определяет, является ли число простым.*/


import java.util.Arrays;
import java.util.List;

public class Main {
    public static int sumOfnumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static boolean isPalindrome(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        String reversedString = stringBuilder.reverse().toString();
        return string.equals(reversedString);
    }

    public static int calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num - 2; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int findFibonnaci(int num) {

        if (num == 1) return 0;
        if (num == 2 || num == 3) return 1;


        int prevNumber = 1;
        int current = 1;
        int temp = 0;
        for (int i = 4; i <= num; i++) {
            temp = current;
            current = prevNumber + current;
            prevNumber = temp;
        }
        return current;
    }

    public static int findMaxElement(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) max = number;
        }
        return max;
    }

    public static int findMinElement(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) min = number;
        }
        return min;
    }

    public static int findElement(int[] numbers, int element) {
        for (int number : numbers) {
            if (number == element) return element;
        }
        return -1;
    }

    public static int countAllVowels(String string) {
        List<Character> vowels = List.of('a', 'e', 'y', 'u', 'i', 'o');
        int count = 0;
        for (char c : string.toCharArray()) {
            for (Character vowel : vowels) {
                if (c == vowel) count++;
            }
        }
        return count;
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static boolean isSimple(int number) {
        if (number == 1) return false;

        for (int i = 1; i < number; i++) {
            if (number % i == 0 && number != i && i != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("------------------sumOfnumbers-------------------");
        System.out.println(sumOfnumbers(new int[]{1, 2, 3, 4, 5}));
        System.out.println("------------------isPalindrome-------------------");
        System.out.println(isPalindrome("ololo"));
        System.out.println("------------------calculateFactorial-------------------");
        System.out.println(calculateFactorial(5));
        System.out.println("------------------findFibonnaci-------------------");
        System.out.println(findFibonnaci(10));
        System.out.println("------------------findMaxElement-------------------");
        System.out.println(findMaxElement(new int[]{1, 122, 33, 49, 5}));
        System.out.println("------------------findMinElement-------------------");
        System.out.println(findMinElement(new int[]{6, 122, 33, 49, 5}));
        System.out.println("------------------findElement-------------------");
        System.out.println(findElement(new int[]{6, 122, 33, 49, 5}, 33));
        System.out.println("------------------countAllVowels-------------------");
        System.out.println(countAllVowels("Hello fucking bitch"));
        System.out.println("------------------reverseString-------------------");
        System.out.println(reverseString("Hello fucking bitch"));
        System.out.println("------------------sortArray-------------------");
        System.out.println(Arrays.toString(sortArray(new int[]{6, 122, 33, 49, 5, -1, 99, 4, 55, 155, -33, -100})));
        System.out.println("------------------isSimple-------------------");
        System.out.println("------------------true-------------------");
        System.out.println(isSimple(2));

        
        System.out.println(isSimple(1013));
        System.out.println(isSimple(1087));
        System.out.println(isSimple(1093));
        System.out.println("------------------false-------------------");
        System.out.println(isSimple(1092));
        System.out.println(isSimple(1062));
        System.out.println(isSimple(1000));
        System.out.println(isSimple(1));

    }

}
