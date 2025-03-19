package data_structure.tasks.task19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Storage {
    List<Gamer> storage;

    public Storage() {
        this.storage = new ArrayList<>();
    }

    public void addGamer(Gamer gamer) {
        this.storage.add(gamer);
    }

    public void showAllGamers() {
        System.out.println("The list of all gamers: ");
        this.storage.forEach(System.out::println);
    }

    /* Вот тут внимание!
       Показано как отсортировать список обьектов в обратном порядке - Collections.sort(this.storage, Collections.reverseOrder());
     */
    public void showMAxRateGamer() {
        System.out.print("Max rate gamer: ");
//        Collections.sort(this.storage, Collections.reverseOrder());
//        System.out.println(this.storage.getFirst());
        System.out.println(Collections.max(this.storage));

    }
}
