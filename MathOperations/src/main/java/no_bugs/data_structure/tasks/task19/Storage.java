package no_bugs.data_structure.tasks.task19;

import java.util.PriorityQueue;
import java.util.Queue;

public class Storage {
    Queue<Gamer> storage;

    // Чтобы из дефолтной min-Heap, где в корне находится элемент с мин значением, сделать max-Heap, то надо в параметры создания передать компаратор
    public Storage() {
        this.storage = new PriorityQueue<>();
    }

    public void addGamer(Gamer gamer) {
        this.storage.offer(gamer);
    }

    public void showAllGamers() {
        System.out.println("The list of all gamers: ");
        this.storage.forEach(System.out::println);
    }

    /* Вот тут внимание!
       Показано как отсортировать Cписок обьектов в обратном порядке - Collections.sort(this.storage, Collections.reverseOrder());
     */
    public void showMAxRateGamer() {
        System.out.print("Max rate gamer: ");
//        Collections.sort(this.storage, Collections.reverseOrder());
//        System.out.println(this.storage.getFirst());
//        System.out.println(Collections.max(this.storage));
        System.out.println(this.storage.peek());
    }
}
