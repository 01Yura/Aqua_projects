package no_bugs.homework13_same_as_12.task1;

public class Main {
    public static void main(String[] args) {
        Entity entity1 = new Entity("Yura", 39, true);
        Entity entity2 = new Entity("Anna", 27, false);
        Entity entity3 = new Entity("Noah", 45, true);
        Entity entity4 = new Entity("Sophie", 31, false);
        Entity entity5 = new Entity("Liam", 22, true);
        Entity entity6 = new Entity("Olivia", 36, false);
        Entity entity7 = new Entity("Noah", 29, true);
        Entity entity8 = new Entity("Emma", 41, false);
        Entity entity9 = new Entity("Lucas", 34, true);
        Entity entity10 = new Entity("Mia", 25, false);


        EntityManager entityManager = new EntityManager();
        entityManager.addEntity(entity1);
        entityManager.addEntity(entity2);
        entityManager.addEntity(entity3);
        entityManager.addEntity(entity4);
        entityManager.addEntity(entity5);
        entityManager.addEntity(entity6);
        entityManager.addEntity(entity7);
        entityManager.addEntity(entity8);
        entityManager.addEntity(entity9);
        entityManager.addEntity(entity10);

        entityManager.returnCopyOfList().forEach(System.out::println);
        System.out.println("------------------------------------------");
        entityManager.filterByAge(39, 45).forEach(System.out::println);
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        entityManager.filterByStatus(true).forEach(System.out::println);
        System.out.println("------------------------------------------");
        entityManager.filterByName("Noah").forEach(System.out::println);
    }
}
