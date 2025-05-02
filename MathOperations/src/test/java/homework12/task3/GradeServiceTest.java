package homework12.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GradeServiceTest {
    StudentGrade<Double> studentGrade1;
    StudentGrade<Double> studentGrade2;
    StudentGrade<Double> studentGrade3;
    StudentGrade<Double> studentGrade4;
    StudentGrade<Double> studentGrade5;
    StudentGrade<Double> studentGrade6;

    GradeService gradeService;

    static Stream<Arguments> argsFor_UserCanAddValidGrade() {
        return Stream.of(
                Arguments.of(new StudentGrade<Double>(1.1, "Sveta", "Math")),
                Arguments.of(new StudentGrade<Double>(1.11, "Sveta", "Math")),
                Arguments.of(new StudentGrade<Double>(0.001, "Sveta", "Math"))
        );
    }

    static Stream<Arguments> argsFor_UserCanNotAddInvalidGrade() {
        return Stream.of(
                Arguments.of(new StudentGrade<Integer>(-1, "Sveta", "Math")),
                Arguments.of(new StudentGrade<Integer>(-1000, "Sveta", "Math"))
        );
    }

    @BeforeEach
    void setUp() {
        studentGrade1 = new StudentGrade<Double>(5.0, "Yura", "Math");
        studentGrade2 = new StudentGrade<Double>(8.0, "Max", "PE");
        studentGrade3 = new StudentGrade<Double>(4.75, "Petya", "Math");
        studentGrade4 = new StudentGrade<Double>(6.0, "Kolya", "PE");
        studentGrade5 = new StudentGrade<Double>(5.25, "Sveta", "Math");
//        studentGrade6 = new StudentGrade<Double>(2, "Olya", "Math");

        gradeService = new GradeService<Double>();
        Collections.addAll(gradeService.getList(), studentGrade1, studentGrade2, studentGrade3, studentGrade4, studentGrade5);
    }

    @ParameterizedTest
    @MethodSource("argsFor_UserCanAddValidGrade")
    void UserCanAddValidGrade(StudentGrade<Double> grade) throws InvalidGradeException {
        assertTrue(gradeService.addGrade(grade));
    }

    @ParameterizedTest
    @MethodSource("argsFor_UserCanNotAddInvalidGrade")
    void UserCanNotAddInvalidGrade(StudentGrade<Double> grade) {
        assertThrows(InvalidGradeException.class, () -> {
            gradeService.addGrade(grade);
        }, "Method should return InvalidGradeException");
    }

    @ParameterizedTest
    @CsvSource({"'Math', 5", "'PE',7"})
    void userCanCountAverageGrade(String subject, double result) {
        assertEquals(result, gradeService.averageScore(subject));
    }
}