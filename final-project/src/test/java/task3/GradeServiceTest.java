package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeServiceTest {

    GradeService<Double> gradeService;
    StudentGrade<Double> studentGrade1;
    StudentGrade<Double> studentGrade2;
    StudentGrade<Double> studentGrade3;

    @BeforeEach
    void setUp() throws InvalidGradeException {
        gradeService = new GradeService<>();

        studentGrade1 = new StudentGrade<>("Yura", "Math", 5.5);
        studentGrade2 = new StudentGrade<>("Max", "PE", 6.0);
        studentGrade3 = new StudentGrade<>("Sveta", "Math", 8.5);

        gradeService.addGrade(studentGrade1);
        gradeService.addGrade(studentGrade2);
        gradeService.addGrade(studentGrade3);
    }

    @Test
    void UserCanAddGradeIfItIsValid() throws InvalidGradeException {
        assertTrue(gradeService.addGrade(new StudentGrade<>("Kolya", "English", 8.5)));
    }

    @Test
    void UserCanNotAddGradeIfItIsNotValid() {
        assertThrows(InvalidGradeException.class, () -> {
            gradeService.addGrade(new StudentGrade<>("Kirill", "PE", -2.5));
        });
    }

    @Test
    void UserCanCountAverageGrade() {
        double expected = 7;
        double actual = gradeService.averageGrade("Math");
        assertEquals(expected, actual);
    }
}