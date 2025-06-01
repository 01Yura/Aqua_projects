package homework12.task3;

import java.util.Collections;

public class Main {
    public static void main(String[] args) throws InvalidGradeException {
        StudentGrade<Integer> studentGrade1 = new StudentGrade<>(2, "Yura", "Math");
        StudentGrade<Integer> studentGrade2 = new StudentGrade<>(8, "Max", "PE");
        StudentGrade<Double> studentGrade3 = new StudentGrade<>(5.25, "Petya", "Math");
        StudentGrade<Integer> studentGrade4 = new StudentGrade<>(6, "Kolya", "PE");
        StudentGrade<Double> studentGrade5 = new StudentGrade<>(1.11, "Sveta", "Math");
        StudentGrade<Integer> studentGrade6 = new StudentGrade<>(2, "Olya", "Math");

        GradeService gradeService = new GradeService();
        Collections.addAll(gradeService.getList(), studentGrade1, studentGrade2, studentGrade3, studentGrade4, studentGrade5, studentGrade6);
        gradeService.addGrade(studentGrade1);
        System.out.println(gradeService.averageScore("Math"));
        gradeService.getList().forEach(System.out::println);
    }
}
