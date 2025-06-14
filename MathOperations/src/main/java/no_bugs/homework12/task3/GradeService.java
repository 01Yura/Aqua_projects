package no_bugs.homework12.task3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    List<StudentGrade<T>> list;

    public GradeService() {
        this.list = new ArrayList<>();
    }

    public synchronized boolean addGrade(StudentGrade<T> studentGrade) throws InvalidGradeException {
        if (studentGrade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Grade is not valid");
        }
        return list.add(studentGrade);
    }

    //    Метод для расчёта среднего значения оценок по конкретному предмету.
    public synchronized double averageScore(String subject) {
//        int counter = 0;
//        double sum = 0;
//        for (StudentGrade<T> studentGrade : list) {
//            if (studentGrade.getSubject().equals(subject)) {
//                sum += studentGrade.getGrade().doubleValue();
//                counter++;
//            }
//        }
//        return sum / counter;

        double average = list.stream().
                filter(grade -> grade.getSubject().equals(subject))
                .mapToDouble(grade -> grade.getGrade().doubleValue())
                .average()
                .getAsDouble();
        return average;
    }


    public synchronized List<StudentGrade<T>> getList() {
        return list;
    }
}

