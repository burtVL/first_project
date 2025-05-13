package homework_12.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {

    static Stream<Arguments> invalidUserProvider() {
        return Stream.of(
              Arguments.of(new User("",25,"valid.email@axample.com"), "Поле Имя не может быть пустым"),
              Arguments.of(new User("john",25,"valid.email@axample.com"), "Имя должно начинаться с заглавной буквы"),
              Arguments.of(new User("John",17,"valid.email@axample.com"), "Возраст должен быть от 18 до 100 лет"),
              Arguments.of(new User("John",101,"valid.email@axample.com"), "Возраст должен быть от 18 до 100 лет"),
              Arguments.of(new User("John",37,""), "Email не должен быть пустым"),
              Arguments.of(new User("John",37,"invalid.email.example.com"), "Некорректный формат email")
        );
    }

    @ParameterizedTest
    @MethodSource("invalidUserProvider")
    void testInvalidUsers(User user, String expectedMessage) {
        InvalidUserException exception = assertThrows(InvalidUserException.class,
                ()-> UserValidator.validate(user));
        assertTrue(exception.getMessage().contains(expectedMessage));
    }

    @Test
    void testValidUser() {
        User validUser = new User("John", 45, "correct.email@example.com");
        assertDoesNotThrow(()->UserValidator.validate(validUser));
    }
}
