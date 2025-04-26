package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest extends MethodsForCheckTest{

    @ParameterizedTest
    @ValueSource(ints = {2019, 2021, 2022})
    public void testNonLeapYears(int year) {
        assertFalse(methodsForCheck.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    public void testLeapYears(int year) {
        assertTrue(methodsForCheck.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100})
    public void testCenturyNonLeapYears(int year) {
        assertFalse(methodsForCheck.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 4, 400})
    public void testBoundaryYears(int year) {
        assertTrue(methodsForCheck.isLeapYear(year));
    }
}
