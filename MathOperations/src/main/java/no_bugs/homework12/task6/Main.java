package no_bugs.homework12.task6;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task<>(1, "backlog", "low", "2027-03-25");
        Task task2 = new Task<>(2, "done", "high", "2023-03-25");
        Task task3 = new Task<>(3, "test", "medium", "2025-03-26");
        Task task4 = new Task<>(4, "done", "high", "2023-02-25");
        Task task5 = new Task<>(5, "test", "medium", "2024-03-25");

        TaskService taskService = new TaskService();
        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);
        taskService.addTask(task4);
        taskService.addTask(task5);

        taskService.printTasks();
        System.out.println("----------------------------------");
        System.out.println(taskService.removeTask(6));
        System.out.println(taskService.removeTask(1));
        System.out.println("----------------------------------");
        System.out.println(taskService.searchById(1));
        System.out.println(taskService.searchById(2));
        System.out.println("----------------------------------");
        taskService.sortByDate().forEach(System.out::println);
        System.out.println("----------------------------------");
        taskService.sortByDateUsingStream().forEach(System.out::println);
    }
}
