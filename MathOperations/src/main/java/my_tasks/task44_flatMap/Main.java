package my_tasks.task44_flatMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Yura", 90);
        Student student2 = new Student("Anna", 34);
        Student student3 = new Student("Dima", 15);
        Student student4 = new Student("Lena", 60);
        Student student5 = new Student("Ivan", 45);
        Student student6 = new Student("Olga", 12);
        Student student7 = new Student("Pavel", 67);
        Student student8 = new Student("Sasha", 18);
        Student student9 = new Student("Nina", 22);
        Student student10 = new Student("Egor", 29);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Medicine");

        Collections.addAll(f1.getList(), student1, student2, student3, student4, student5);

        f2.addStudentOnFaculty(student6);
        f2.addStudentOnFaculty(student7);
        f2.addStudentOnFaculty(student8);
        f2.addStudentOnFaculty(student9);
        f2.addStudentOnFaculty(student10);

        List<Faculty> listOfFaculties = new ArrayList<>();
        listOfFaculties.add(f1);
        listOfFaculties.add(f2);

        listOfFaculties.stream().flatMap(e -> e.getList().stream())
                .filter(student -> student.getAge() > 50)
                .sorted(Comparator.comparing(Student::getAge))
                .forEach(o -> System.out.println(o.getName() + " " + o.getAge()));

        int sum = listOfFaculties.stream().flatMap(faculty -> faculty.getList().stream()).mapToInt(value -> value.getAge()).sum();
        System.out.println(sum);


        Map<Integer, List<Student>> map = new HashMap<>();
        map.put(1, f1.getList());
        map.put(2, f2.getList());

        map.values().stream()
                .flatMap(students -> students.stream())
                .sorted(Comparator.comparing(Student::getAge))
                .forEach(System.out::println);

        int sum2 = map.values().stream()
                .flatMap(students -> students.stream())
                .sorted(Comparator.comparing(Student::getAge))
                .mapToInt(Student::getAge)
                .sum();

        System.out.println(sum2);

        ArrayList<Student> list1 = new ArrayList<>(List.of(student1, student2));
        ArrayList<Student> list2 = new ArrayList<>(Arrays.asList(student1, student2));
        List<Student> list3 = List.of(student1, student2);

    }
}
