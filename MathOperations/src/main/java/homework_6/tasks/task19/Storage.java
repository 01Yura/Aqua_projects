package homework_6.tasks.task19;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Storage {
    private PriorityQueue<Gamer> queue;

    public Storage() {
        this.queue = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addGamer(Gamer gamer) {
        this.queue.offer(gamer);
    }

    public void print() {
        this.queue.forEach(System.out::println);
    }

    public void showTheMostRateGamer() {
        System.out.println("The gamer with highest rate is " + this.queue.peek().getGamerName());
    }
}
