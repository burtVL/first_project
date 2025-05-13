package homework_12.task6;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    @Test
    void testAddAndRemoveTask() {
        TaskService<String> service = new TaskService<>();
        Task<String> task = new Task<>("task1", "NEW", "HIGH", new Date());

        assertTrue(service.addTask(task));
        assertEquals(task, service.getTask("task1"));

        Task<String> removed = service.removeTask("task1");
        assertEquals(task, removed);
        assertNull(service.getTask("task1"));
    }

    @Test
    void testDuplicateTask() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task = new Task<>(1, "NEW", "HIGH", new Date());

        assertTrue(service.addTask(task));
        assertFalse(service.addTask(task)); // Попытка добавить дубликат
    }

    @Test
    void testFilterAndSort() {
        TaskService<Integer> service = new TaskService<>();

        Date now = new Date();
        Task<Integer> task1 = new Task<>(1, "DONE", "LOW", new Date(now.getTime() - 1000));
        Task<Integer> task2 = new Task<>(2, "NEW", "HIGH", now);
        Task<Integer> task3 = new Task<>(3, "NEW", "MEDIUM", new Date(now.getTime() + 1000));

        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);

        // Фильтрация
        assertEquals(2, service.filterByStatus("NEW").size());

        // Сортировка
        List<Task<Integer>> sorted = service.sortByDateAscending();
        assertEquals(task1, sorted.get(0));
        assertEquals(task3, sorted.get(2));
    }
}
