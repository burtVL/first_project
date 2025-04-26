package homework_10;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("class MethodsForCheck, method isEven")
public class EvenNumberTest extends MethodsForCheckTest {

    @ParameterizedTest
    @ValueSource(ints = {4, -4, 0})
    public void shouldReturnTrueWhenNumberIsEven(int initialNumbers) {
        boolean expectedResult = methodsForCheck.isEven(initialNumbers);
        assertTrue(expectedResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, -3})
    public void shouldNotReturnTrueWhenNumberIsEven(int initialNumbers) {
        boolean expectedResult = methodsForCheck.isEven(initialNumbers);
        assertFalse(expectedResult);
    }
}