package homework12.task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {
    TaskService taskService;

    public static Stream<Arguments> argsFor_sortByDateUsingStream() {
        return Stream.of(
                Arguments.of(List.of(
                        new Task<>(4, "done", "high", "2023-02-25"),
                        new Task<>(2, "done", "high", "2023-03-25"),
                        new Task<>(5, "test", "medium", "2024-03-25"),
                        new Task<>(3, "test", "medium", "2025-03-26"),
                        new Task<>(1, "backlog", "low", "2027-03-25")
                )));
    }

//    List.of()

    @BeforeEach
    void setUp() {
        Task task1 = new Task<>(1, "backlog", "low", "2027-03-25");
        Task task2 = new Task<>(2, "done", "high", "2023-03-25");
        Task task3 = new Task<>(3, "test", "medium", "2025-03-26");
        Task task4 = new Task<>(4, "done", "high", "2023-02-25");
        Task task5 = new Task<>(5, "test", "medium", "2024-03-25");

        taskService = new TaskService();

        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);
        taskService.addTask(task4);
        taskService.addTask(task5);
    }

    @Test
    void removeTaskPositive() {
        assertTrue(taskService.removeTask(1));
    }

    @Test
    void removeTaskNegative() {
        assertFalse(taskService.removeTask(10));
    }

    @ParameterizedTest
    @MethodSource("argsFor_sortByDateUsingStream")
    void sortByDateUsingStream(List<Task> expected) {
        assertEquals(expected, taskService.sortByDateUsingStream());
    }


}