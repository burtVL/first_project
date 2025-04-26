package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest extends MethodsForCheckTest{
    private static Stream<Arguments> passwordTestCases() {
        return Stream.of(
                Arguments.of("Password1", true),    // Корректный пароль
                Arguments.of("pass", false),        // Слишком короткий
                Arguments.of("password", false),    // Нет цифры и заглавной буквы
                Arguments.of(null, false)           // Null пароль
        );
    }
    @ParameterizedTest
    @MethodSource("passwordTestCases")
    public void testIsValidPassword(String password, boolean expected) {
        assertEquals(expected, methodsForCheck.isValidPassword(password));
    }

}
