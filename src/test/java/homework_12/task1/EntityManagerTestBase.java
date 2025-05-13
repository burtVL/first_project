package homework_12.task1;

import org.junit.jupiter.api.BeforeEach;

public class EntityManagerTestBase {
    protected EntityManager<User> userManager;
    protected User alice;
    protected User bob;
    protected User charlie;
    protected User david;

    @BeforeEach
    void init() {
        userManager = new EntityManager<>();

        alice = new User("Alice", 25, true);
        bob = new User("Bob", 30, false);
        charlie = new User("Charlie", 35, true);
        david = new User("David", 40, false);

        userManager.add(alice);
        userManager.add(bob);
        userManager.add(charlie);
        userManager.add(david);
    }
}
