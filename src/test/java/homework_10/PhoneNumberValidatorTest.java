package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberValidatorTest extends MethodsForCheckTest{

    private static Stream<String> validPhoneNumbers() {
        return Stream.of(
                "+1 1234567890",
                "+44 9876543210",
                "+999 1111111111"
        );
    }

    @ParameterizedTest
    @MethodSource("validPhoneNumbers")
    public void testValidPhoneNumbers(String phone) {
        assertTrue(methodsForCheck.isValidPhoneNumber(phone));
    }

    private static Stream<String> invalidPhoneNumbers() {
        return Stream.of(
                "12345",
                "invalid",
                "+1 abcdefghij",
                "+1234 1234567890",  // слишком длинный код страны
                "+1 123",            // недостаточно цифр
                ""                  // пустая строка
        );
    }

    @ParameterizedTest
    @MethodSource("invalidPhoneNumbers")
    public void testInvalidPhoneNumbers(String phone) {
        assertFalse(methodsForCheck.isValidPhoneNumber(phone));
    }

    @ParameterizedTest
    @NullSource
    public void testNullPhoneNumber(String phone) {
        assertThrows(IllegalArgumentException.class, () -> methodsForCheck.isValidPhoneNumber(phone));
    }
}
