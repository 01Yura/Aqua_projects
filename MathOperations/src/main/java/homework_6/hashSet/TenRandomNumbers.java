package homework_6.hashSet;

import java.util.HashSet;

public class TenRandomNumbers {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        int i = 0;
        while (true) {
            numbers.add((int) (Math.random() * 10));
            i++;
            if (numbers.size() == 10) {
                break;
            }
        }
        numbers.forEach(System.out::println);
    }
}
