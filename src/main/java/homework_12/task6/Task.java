package homework_12.task6;

import java.util.Date;

public class Task<T> {
    private final T id;
    private String status;
    private String priority;
    private final Date date;

    public Task(T id, String status, String priority, Date date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    // Геттеры
    public T getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    public Date getDate() {
        return date;
    }

    // Сеттеры для полей, которые могут изменяться
    public void setStatus(String status) {
        this.status = status;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
