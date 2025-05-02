package task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task<Integer> task1 = new Task<>(1, Status.TODO, Priority.LOW, "2025-05-07");
        Task<Integer> task2 = new Task<>(2, Status.INPROGRESS, Priority.MEDIUM, "2025-05-10");
        Task<Integer> task3 = new Task<>(3, Status.DONE, Priority.HIGH, "2025-04-30");
        Task<Integer> task4 = new Task<>(4, Status.TODO, Priority.HIGH, "2025-06-01");
        Task<Integer> task5 = new Task<>(5, Status.INPROGRESS, Priority.LOW, "2025-05-15");
        Task<Integer> task6 = new Task<>(6, Status.DONE, Priority.MEDIUM, "2025-05-03");
        Task<Integer> task7 = new Task<>(7, Status.TODO, Priority.MEDIUM, "2025-05-20");
        Task<Integer> task8 = new Task<>(8, Status.INPROGRESS, Priority.HIGH, "2025-06-05");
        Task<Integer> task9 = new Task<>(9, Status.DONE, Priority.LOW, "2025-05-25");
        Task<Integer> task10 = new Task<>(10, Status.TODO, Priority.HIGH, "2025-05-18");

        List<Task> list = new ArrayList<>();
        Collections.addAll(list, task1, task2, task3, task4, task5, task6);

        System.out.println("--------- START TESTING ---------");
        System.out.println();

        System.out.println("Sorting By Priority in natural order");
        list.sort(Comparator.comparing(Task::getPriority));
        list.forEach(System.out::println);
        System.out.println();

        System.out.println("Sorting By Priority in reversed order");
        list.sort((o1, o2) -> o2.getPriority().compareTo(o1.getPriority()));

        list.forEach(System.out::println);

        System.out.println();
        System.out.println("--------- END TESTING ---------");
        System.out.println();

        TaskService<Integer> service = new TaskService<>();
        service.addTask(new Task<Integer>(1, Status.TODO, Priority.LOW, "2025-05-07"));
        service.addTask(new Task<Integer>(2, Status.INPROGRESS, Priority.MEDIUM, "2025-05-10"));
        service.addTask(new Task<Integer>(3, Status.DONE, Priority.HIGH, "2025-04-30"));
        service.addTask(new Task<Integer>(4, Status.TODO, Priority.HIGH, "2025-06-01"));
        service.addTask(new Task<Integer>(5, Status.INPROGRESS, Priority.LOW, "2025-05-15"));
        service.addTask(new Task<Integer>(6, Status.DONE, Priority.MEDIUM, "2025-05-03"));
        service.addTask(new Task<Integer>(7, Status.TODO, Priority.MEDIUM, "2025-05-20"));
        service.addTask(new Task<Integer>(8, Status.INPROGRESS, Priority.HIGH, "2025-06-05"));
        service.addTask(new Task<Integer>(9, Status.DONE, Priority.LOW, "2025-05-25"));
        service.addTask( new Task<Integer>(10, Status.TODO, Priority.HIGH, "2025-05-18"));

        service.filterByStatus(Status.TODO).forEach(System.out::println);




    }
}
