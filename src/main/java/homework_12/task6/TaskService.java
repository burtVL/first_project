package homework_12.task6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskService<T> {
    private final Map<T, Task<T>> tasks = new HashMap<>();

    /**
     * Добавляет новую задачу
     * @param task задача для добавления
     * @return true, если задача добавлена, false если задача с таким ID уже существует
     */
    public boolean addTask(Task<T> task) {
        if (tasks.containsKey(task.getId())) {
            return false;
        }
        tasks.put(task.getId(), task);
        return true;
    }

    /**
     * Удаляет задачу по ID (синхронизировано)
     * @param id ID задачи
     * @return удаленная задача или null, если не найдена
     */
    public synchronized Task<T> removeTask(T id) {
        return tasks.remove(id);
    }

    /**
     * Получает задачу по ID
     * @param id ID задачи
     * @return задача или null, если не найдена
     */
    public Task<T> getTask(T id) {
        return tasks.get(id);
    }

    /**
     * Фильтрует задачи по статусу
     * @param status статус для фильтрации
     * @return список задач с указанным статусом
     */
    public List<Task<T>> filterByStatus(String status) {
        return tasks.values().stream()
                .filter(task -> task.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    /**
     * Фильтрует задачи по приоритету
     * @param priority приоритет для фильтрации
     * @return список задач с указанным приоритетом
     */
    public List<Task<T>> filterByPriority(String priority) {
        return tasks.values().stream()
                .filter(task -> task.getPriority().equals(priority))
                .collect(Collectors.toList());
    }

    /**
     * Сортирует задачи по дате (от старых к новым)
     * @return отсортированный список задач
     */
    public List<Task<T>> sortByDateAscending() {
        return tasks.values().stream()
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());
    }

    /**
     * Сортирует задачи по дате (от новых к старым)
     * @return отсортированный список задач
     */
    public List<Task<T>> sortByDateDescending() {
        return tasks.values().stream()
                .sorted(Comparator.comparing(Task<T>::getDate).reversed())
                .collect(Collectors.toList());
    }
}
