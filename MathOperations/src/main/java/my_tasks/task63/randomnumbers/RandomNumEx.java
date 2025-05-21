package my_tasks.task63.randomnumbers;

import java.util.Random;

public class RandomNumEx {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(new Random().nextInt(1, 11) + " ");
        }
    }
}
