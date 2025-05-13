package homework_12.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T> {
    // Потокобезопасная коллекция для хранения элементов
    private final List<T> entities = new CopyOnWriteArrayList<>();

    // Флаг включения валидации
    private boolean validationEnabled = true;

    /**
     * Включает/выключает валидацию
     */
    public void setValidationEnabled(boolean enabled) {
        this.validationEnabled = enabled;
    }

    /**
     * Добавляет элемент (потокобезопасно)
     */
    public void add(T entity) {
        entities.add(entity);
    }

    /**
     * Удаляет элемент (потокобезопасно)
     * @return true если элемент был удален, false если не найден
     */
    public boolean remove(T entity) {
        return entities.remove(entity);
    }

    /**
     * Возвращает копию списка всех элементов
     */
    public List<T> getAll() {
        return new ArrayList<>(entities);
    }

    // Специализированные методы для User

    /**
     * Фильтрует пользователей по возрастному диапазону
     */
    public List<User> filterUsersByAge(int minAge, int maxAge) {
        if (!validationEnabled) return Collections.emptyList();

        return entities.stream()
                .filter(e -> e instanceof User)
                .map(e -> (User)e)
                .filter(u -> u.getAge() >= minAge && u.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    /**
     * Фильтрует пользователей по имени
     */
    public List<User> filterUsersByName(String name) {
        if (!validationEnabled) return Collections.emptyList();

        return entities.stream()
                .filter(e -> e instanceof User)
                .map(e -> (User)e)
                .filter(u -> u.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    /**
     * Фильтрует пользователей по активности
     */
    public List<User> filterUsersByActive(boolean active) {
        if (!validationEnabled) return Collections.emptyList();

        return entities.stream()
                .filter(e -> e instanceof User)
                .map(e -> (User)e)
                .filter(u -> u.isActive() == active)
                .collect(Collectors.toList());
    }
}
