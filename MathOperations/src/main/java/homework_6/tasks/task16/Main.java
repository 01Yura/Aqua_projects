package homework_6.tasks.task16;

public class Main {
    public static void main(String[] args) {
        Storage listOfTasks = new Storage();

        Task task1 = new Task("action1", 15.00);
        Task task2 = new Task("action2", 8.00);
        Task task3 = new Task("action3", 23.00);
        Task task4 = new Task("action4", 10.00);
        Task task5 = new Task("action5", 17.00);

        listOfTasks.addTask(task1);
        listOfTasks.addTask(task2);
        listOfTasks.addTask(task3);
        listOfTasks.addTask(task4);
        listOfTasks.addTask(task5);

        listOfTasks.print();
        System.out.println();

        listOfTasks.sortByDeadline();

        listOfTasks.print();
    }
}
