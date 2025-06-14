package no_bugs.homework_6.tasks.task1;

public class Main {
    public static void main(String[] args) {
        IdStorage idStorage = new IdStorage();

        Id id1 = new Id(1, "Yura");
        Id id2 = new Id(5, "Max");
        Id id3 = new Id(10, "Rolya");


        idStorage.addId(id1);
        idStorage.addId(id2);
        idStorage.addId(id3);

        idStorage.showIdStorage();
        System.out.println();

        System.out.println(idStorage.checkId(1));
        System.out.println(idStorage.checkId(111));

    }
}
