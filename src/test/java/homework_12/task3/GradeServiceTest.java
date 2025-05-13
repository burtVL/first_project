package homework_12.task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GradeServiceTest {
    @Test
    void addGrade_shouldAcceptValidGrade() {
        GradeService<Integer> service = new GradeService<>();
        StudentGrade<Integer> grade = new StudentGrade<>("Иван", "Математика", 5);

        assertDoesNotThrow(() -> service.addGrade(grade));
    }

    @Test
    void addGrade_shouldThrowForNegativeGrade() {
        GradeService<Double> service = new GradeService<>();
        StudentGrade<Double> grade = new StudentGrade<>("Петр", "Физика", -2.5);

        assertThrows(InvalidGradeException.class, () -> service.addGrade(grade));
    }

    @ParameterizedTest
    @MethodSource("validGradesProvider")
    <T extends Number> void addGrade_shouldAcceptVariousNumberTypes(StudentGrade<T> grade) {
        GradeService<T> service = new GradeService<>();
        assertDoesNotThrow(() -> service.addGrade(grade));
    }

    private static Stream<StudentGrade<? extends Number>> validGradesProvider() {
        return Stream.of(
                new StudentGrade<>("Анна", "Химия", 4),
                new StudentGrade<>("Борис", "Биология", 4.5f),
                new StudentGrade<>("Мария", "Литература", 3.75)
        );
    }

    @Test
    void calculateAverage_shouldReturnCorrectValue() {
        GradeService<Integer> service = new GradeService<>();

        service.addGrade(new StudentGrade<>("Иван", "Математика", 4));
        service.addGrade(new StudentGrade<>("Петр", "Математика", 5));
        service.addGrade(new StudentGrade<>("Сергей", "Физика", 3));
        service.addGrade(new StudentGrade<>("Анна", "Математика", 3));

        assertEquals(4.0, service.calculateAverageForSubject("Математика"), 0.001);
    }

    @Test
    void calculateAverage_shouldReturnZeroForEmptySubject() {
        GradeService<Double> service = new GradeService<>();
        assertEquals(0.0, service.calculateAverageForSubject("Несуществующий предмет"));
    }

    @Test
    void getAllGrades_shouldReturnCopy() {
        GradeService<Integer> service = new GradeService<>();
        service.addGrade(new StudentGrade<>("Иван", "Математика", 5));

        List<StudentGrade<Integer>> grades = service.getAllGrades();
        grades.clear(); // Не должно влиять на внутренний список

        assertEquals(1, service.getAllGrades().size());
    }
}
