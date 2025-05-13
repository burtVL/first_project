package homework_12.task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest extends EntityManagerTestBase {

    @Test
    void getAllUsers_shouldReturnAllAddedUsers() {
        List<User> users = userManager.getAll();
        assertEquals(4, users.size());
        assertTrue(users.containsAll(List.of(alice, bob, charlie, david)));
    }

    @Test
    void removeUser_shouldReturnCorrectStatus() {
        assertAll(
                () -> assertTrue(userManager.remove(alice)),
                () -> assertFalse(userManager.remove(alice)), // Повторное удаление
                () -> assertEquals(3, userManager.getAll().size())
        );
    }

    @ParameterizedTest
    @MethodSource("userProvider")
    void addUser_shouldIncreaseSize(User user) {
        userManager.add(user);
        assertTrue(userManager.getAll().contains(user));
    }

    private static Stream<User> userProvider() {
        return Stream.of(
                new User("Eve", 28, true),
                new User("Frank", 45, false)
        );
    }

    @ParameterizedTest
    @CsvSource({
            "25, 35, 3",  // alice, bob, charlie
            "30, 40, 3",  // bob, charlie, david
            "40, 50, 1"   // только david
    })
    void filterByAge_shouldReturnCorrectUsers(int minAge, int maxAge, int expectedCount) {
        List<User> filtered = userManager.filterUsersByAge(minAge, maxAge);
        assertEquals(expectedCount, filtered.size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Alice", "ALICE", "alice"})
    void filterByName_shouldBeCaseInsensitive(String name) {
        List<User> filtered = userManager.filterUsersByName(name);
        assertEquals(1, filtered.size());
        assertEquals(alice, filtered.get(0));
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    void filterByActive_shouldReturnCorrectUsers(boolean active) {
        List<User> filtered = userManager.filterUsersByActive(active);
        long expectedCount = userManager.getAll().stream()
                .filter(u -> u.isActive() == active)
                .count();
        assertEquals(expectedCount, filtered.size());
    }
}
