package task3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    private List<StudentGrade<T>> list;

    public GradeService() {
        this.list = new ArrayList<>();
    }

    public void print(){
        list.forEach(System.out::println);
    }

    public synchronized boolean addGrade(StudentGrade<T> grade) throws InvalidGradeException {
        if (grade.getGrade().doubleValue() >= 0){
            return list.add(grade);
        } else {
            throw new InvalidGradeException("Grade is less than 0");
        }
    }

    public synchronized double averageGrade(String subject){
        double average;
        average = list.stream()
                .filter(element -> element.getSubject().equals(subject))
                .mapToDouble(element -> element.getGrade().doubleValue())
                .average()
                .getAsDouble();

        return average;
    }




}
