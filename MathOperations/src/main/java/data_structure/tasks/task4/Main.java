package data_structure.tasks.task4;

//4. Поиск элементов по приоритету
//Система обрабатывает задачи, причём приоритет задачи определяет, когда она будет выполнена.

public class Main {
    public static void main(String[] args) {
//        Create some tasks
        Task task1 = new Task("Wake up", 1);
        Task task2 = new Task("Go work", 4);
        Task task3 = new Task("Have a breakfast", 3);
        Task task4 = new Task("Clean the teeth", 2);
//        Create PriorityQueue
        Storage storage = new Storage();
//        Populate it
        storage.addTask(task1);
        storage.addTask(task2);
        storage.addTask(task3);
        storage.addTask(task4);
        System.out.println();
//        Display it
        storage.showStorage();
        System.out.println();
//        Perform Task according the priority
        storage.performTask();
//        Display it
        storage.showStorage();
    }
}

