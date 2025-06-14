package no_bugs.data_structure.tasks.task16;

//16. Список дел
//Требуется сохранить список задач, который можно пополнять, удалять и сортировать по сроку выполнения.

public class Main {
    public static void main(String[] args) {
//        Create storage
        Storage storage = new Storage();
//        Create tasks
        Task task1 = new Task("Clean the room", 16.00);
        Task task2 = new Task("Eat", 9.00);
        Task task3 = new Task("Go for a walk", 19.00);
        Task task4 = new Task("Go to sleep", 23.00);
        Task task5 = new Task("x", 10.00);
        Task task6 = new Task("y", 18.00);
//        Add tasks to the storage
        storage.addTask(task1);
        storage.addTask(task2);
        storage.addTask(task3);
        storage.addTask(task4);
        storage.addTask(task5);
        storage.addTask(task6);
//        Print storage
        storage.print();
        System.out.println();
//        Remove one task
        storage.removeTask(task1);
//        Print storage
        storage.printSortedTasks();
        System.out.println();
    }
}
