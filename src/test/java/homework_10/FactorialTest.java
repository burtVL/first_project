package homework_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends MethodsForCheckTest{


    @Test
    public void testFactorialOfZero() {
        assertEquals(1, methodsForCheck.factorial(0));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "5, 120",
            "7, 5040"
    })
    public void testFactorialOfPositiveNumbers(int n, int expected) {
        assertEquals(expected, methodsForCheck.factorial(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -5, -10})
    public void testFactorialOfNegativeNumbers(int n) {
        assertThrows(IllegalArgumentException.class, () -> methodsForCheck.factorial(n));
    }
}
