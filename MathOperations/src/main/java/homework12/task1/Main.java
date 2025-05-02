package homework12.task1;

import java.util.Collections;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Person p1 = new Person("Yura", 39, true);
        Person p2 = new Person("Misha", 30, true);
        Person p3 = new Person("Sveta", 25, false);
        Person p4 = new Person("Boris", 45, true);
        Person p5 = new Person("Ekaterina", 18, false);
        Person p6 = new Person("Petr", 99, false);

        EntityManager entityManager = new EntityManager();
        Collections.addAll(entityManager.getList(), p1, p2, p3, p4, p5);
        entityManager.addElement(p6);
        entityManager.getList().forEach(System.out::println);
        System.out.println();

        System.out.println(entityManager.filterByName("Boris"));
        System.out.println();

        System.out.println(entityManager.filterByStatus(false));
        System.out.println();

        System.out.println(entityManager.filterByAge(20, 40));
        System.out.println();

        Thread thread1 = new Thread(() -> entityManager.removeElement(p1));
        Thread thread2 = new Thread(() -> entityManager.removeElement(p1));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(entityManager.getList());
        

    }
}