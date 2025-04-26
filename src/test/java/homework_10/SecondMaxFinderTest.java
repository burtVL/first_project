package homework_10;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondMaxFinderTest extends MethodsForCheckTest {
    @Test
    public void testFindSecondMax_NormalArray() {
        int[] numbers = {3, 5, 7, 2};
        int result = methodsForCheck.findSecondMax(numbers);
        assertEquals(5, result);
    }

    @Test
    public void testFindSecondMax_AllElementsSame() {
        int[] numbers = {4, 4, 4, 4};
        assertThrows(NoSuchElementException.class, () -> methodsForCheck.findSecondMax(numbers));
    }

    @Test
    public void testFindSecondMax_SingleElementArray() {
        int[] numbers = {8};
        assertThrows(NoSuchElementException.class, () -> methodsForCheck.findSecondMax(numbers));
    }

    @Test
    public void testFindSecondMax_EmptyArray() {
        int[] numbers = {};
        assertThrows(NoSuchElementException.class, () -> methodsForCheck.findSecondMax(numbers));
    }
}
