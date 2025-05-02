package task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {
    TaskService<Integer> service;

    @BeforeEach
    void setUp() {
        service = new TaskService<>();
    }

    @Test
    void addTaskShouldReturnTrueIfTaskIsNotInList() {
        assertTrue(service.addTask(new Task<Integer>(1, Status.TODO, Priority.LOW, "2025-05-07")));
    }

    @Test
    void addTaskShouldReturnsFalseIfTaskIsAlreadyInList() {
        service.getList().add(new Task<Integer>(1, Status.TODO, Priority.LOW, "2025-05-07"));
        assertFalse(service.addTask(new Task<Integer>(1, Status.TODO, Priority.LOW, "2025-05-07")));
    }

    @Test
    void removeTaskShouldReturnTrueIfTaskWithSpecificIdIsInList() {
        service.getList().add(new Task<Integer>(1, Status.TODO, Priority.LOW, "2025-05-07"));
        assertTrue(service.removeTask(1));
    }

    @Test
    void removeTaskShouldReturnFalseIfTaskWithSpecificIdIsNotInList() {
        service.getList().add(new Task<Integer>(1, Status.TODO, Priority.LOW, "2025-05-07"));
        assertFalse(service.removeTask(2));
    }

    @Test
    void filterByStatusShouldReturnFilteredList() {
        service.getList().add(new Task<Integer>(1, Status.TODO, Priority.LOW, "2025-05-07"));
        service.getList().add(new Task<Integer>(2, Status.INPROGRESS, Priority.MEDIUM, "2025-05-10"));
        service.getList().add(new Task<Integer>(3, Status.DONE, Priority.HIGH, "2025-04-30"));
        service.getList().add(new Task<Integer>(4, Status.TODO, Priority.HIGH, "2025-06-01"));
        service.getList().add(new Task<Integer>(5, Status.INPROGRESS, Priority.LOW, "2025-05-15"));
        service.getList().add(new Task<Integer>(6, Status.DONE, Priority.MEDIUM, "2025-05-03"));

        List<Task<Integer>> expected = List.of(
                new Task<Integer>(1, Status.TODO, Priority.LOW, "2025-05-07"),
                new Task<Integer>(4, Status.TODO, Priority.HIGH, "2025-06-01")
        );

        assertEquals(expected, service.filterByStatus(Status.TODO));

    }

    @Test
    void filterByPriorityShouldReturnFilteredList() {
        service.getList().add(new Task<Integer>(1, Status.TODO, Priority.LOW, "2025-05-07"));
        service.getList().add(new Task<Integer>(2, Status.INPROGRESS, Priority.MEDIUM, "2025-05-10"));
        service.getList().add(new Task<Integer>(3, Status.DONE, Priority.HIGH, "2025-04-30"));
        service.getList().add(new Task<Integer>(4, Status.TODO, Priority.HIGH, "2025-06-01"));
        service.getList().add(new Task<Integer>(5, Status.INPROGRESS, Priority.LOW, "2025-05-15"));
        service.getList().add(new Task<Integer>(6, Status.DONE, Priority.MEDIUM, "2025-05-03"));

        List<Task<Integer>> expected = List.of(
                new Task<Integer>(1, Status.TODO, Priority.LOW, "2025-05-07"),
                new Task<Integer>(5, Status.INPROGRESS, Priority.LOW, "2025-05-15")
        );

        assertEquals(expected, service.filterByPriority(Priority.LOW));

    }

    @Test
    void sortByDateShouldReturnFilteredList() {
        service.getList().add(new Task<Integer>(1, Status.TODO, Priority.LOW, "2025-05-07"));
        service.getList().add(new Task<Integer>(2, Status.INPROGRESS, Priority.MEDIUM, "2025-05-10"));
        service.getList().add(new Task<Integer>(3, Status.DONE, Priority.HIGH, "2025-04-30"));

        List<Task<Integer>> expected = List.of(
                new Task<Integer>(3, Status.DONE, Priority.HIGH, "2025-04-30"),
                new Task<Integer>(1, Status.TODO, Priority.LOW, "2025-05-07"),
                new Task<Integer>(2, Status.INPROGRESS, Priority.MEDIUM, "2025-05-10")
        );

        assertEquals(expected, service.sortByDate());
    }
}