package homework12.task3;

public class StudentGrade<T extends Number> {
    String studentName;
    String subject;
    T grade;

    public StudentGrade(T grade, String studentName, String subject) {
        this.grade = grade;
        this.studentName = studentName;
        this.subject = subject;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }

    public T getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "studentName='" + studentName + '\'' +
                ", subject='" + subject + '\'' +
                ", grade=" + grade +
                '}';
    }
}
