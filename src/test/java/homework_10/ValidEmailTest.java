package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidEmailTest extends MethodsForCheckTest{

    @ParameterizedTest
    @ValueSource(strings = {
            "test@example.com",
            "user.name@domain.co",
            "a@b.cc"
    })
    public void testValidEmails(String email) {
        assertTrue(methodsForCheck.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "bad@.com",
            "no-at-symbol",
            "@missing-user.com",
            "user@domain"
    })
    public void testInvalidEmails(String email) {
        assertFalse(methodsForCheck.isValidEmail(email));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testNullOrEmptyEmail(String email) {
        assertFalse(methodsForCheck.isValidEmail(email));

    }
}
