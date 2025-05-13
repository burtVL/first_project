package homework_12.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> grades = new ArrayList<>();

    /**
     * Добавляет оценку с валидацией
     * @param grade оценка для добавления
     * @throws InvalidGradeException если оценка отрицательная
     */
    public synchronized void addGrade(StudentGrade<T> grade) {
        if (grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Оценка не может быть отрицательной");
        }
        if (grade.getSubject() == null || grade.getSubject().trim().isEmpty()) {
            throw new InvalidGradeException("Предмет не может быть пустым");
        }
        grades.add(grade);
    }

    /**
     * Рассчитывает среднюю оценку по предмету
     * @param subject предмет для расчета
     * @return средняя оценка
     */
    public synchronized double calculateAverageForSubject(String subject) {
        List<StudentGrade<T>> subjectGrades = grades.stream()
                .filter(g -> g.getSubject().equals(subject))
                .collect(Collectors.toList());

        if (subjectGrades.isEmpty()) {
            return 0.0;
        }

        double sum = subjectGrades.stream()
                .mapToDouble(g -> g.getGrade().doubleValue())
                .sum();

        return sum / subjectGrades.size();
    }

    /**
     * Возвращает все оценки (защищенная копия)
     * @return список всех оценок
     */
    public synchronized List<StudentGrade<T>> getAllGrades() {
        return new ArrayList<>(grades);
    }
}
