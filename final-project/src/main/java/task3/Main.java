package task3;

public class Main {
    public static void main(String[] args) throws InvalidGradeException {
        GradeService<Double> gradeService = new GradeService<>();

        StudentGrade<Double> studentGrade1 = new StudentGrade<>("Yura", "Math", 5.5);
        StudentGrade<Double> studentGrade2 = new StudentGrade<>("Max", "PE", 6.0);
        StudentGrade<Double> studentGrade3 = new StudentGrade<>("Sveta", "Math", 8.5);

        gradeService.addGrade(studentGrade1);
        gradeService.addGrade(studentGrade2);
        gradeService.addGrade(studentGrade3);

        gradeService.print();
        System.out.println(gradeService.averageGrade("Math"));

    }
}
