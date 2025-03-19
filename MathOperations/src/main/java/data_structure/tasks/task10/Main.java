package data_structure.tasks.task10;

//10. Структура телефонной книги
//Требуется хранить имена и номера телефонов, чтобы быстро находить номер по имени.

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        Person person1 = new Person("Yura", "123");
        Person person2 = new Person("Max", "234");
        Person person3 = new Person("Sveta", "345");
        Person person4 = new Person("Kolya", "567");
        Person person5 = new Person("Misha", "678");

        storage.showStorage();
        System.out.println();

        storage.addRecord(person1);
        storage.addRecord(person2);
        storage.addRecord(person3);
        storage.addRecord(person4);
        storage.addRecord(person5);

        storage.showStorage();
        System.out.println();

        storage.findNumber("Sveta");
        storage.findNumber("Yura");
        System.out.println();

        storage.showStorage();
        System.out.println();
    }
}
