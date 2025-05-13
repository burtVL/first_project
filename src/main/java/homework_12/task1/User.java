package homework_12.task1;

public class User {
    private final String name;
    private final int age;
    private final boolean active;

    public User(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    // Геттеры
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isActive() { return active; }
}
