package homework_6.tasks.task9;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.performAction("My ");
        storage.performAction("name ");
        storage.performAction("is ");
        storage.performAction("Yuraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        storage.print();
        System.out.println();

        storage.ctrlZ();
        storage.ctrlZ();
        storage.print();
        System.out.println();
        storage.ctrlY();
        storage.print();
        System.out.println();


    }
}
