package task1;

public class Main {
    public static void main(String[] args){
        EntityManager entityManager = new EntityManager<>();

        Entity entity1 = new Entity("Yura", 39, true);
        Entity entity2 = new Entity("Max", 25, false);
        Entity entity3 = new Entity("Sveta", 30, true);
        Entity entity4 = new Entity("Kolya", 20, false);

        entityManager.getList().add(entity1);
        entityManager.getList().add(entity2);
        entityManager.getList().add(entity3);
        entityManager.getList().add(entity4);

        entityManager.returnCopyOfList().forEach(System.out::println);
        System.out.println();
    }
}
