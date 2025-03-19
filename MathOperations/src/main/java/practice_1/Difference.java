package practice_1;

public class Difference {
//    3. Реализуйте метод для нахождения разницы между двумя числами
//    Создайте метод difference(int x, int y), который возвращает разницу между двумя числами.
//    Проверьте работу метода в main.

    static int findDifference(int x, int y) {

        int maxNum = Math.max(x, y);
        int minNum = Math.min(x, y);

        return maxNum - minNum;
    }

    public static void main(String[] args) {
        System.out.println(Difference.findDifference(3, 18));
    }
}
