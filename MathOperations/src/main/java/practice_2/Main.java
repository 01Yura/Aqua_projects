package practice_2;

public class Main {
    public static void main(String[] args) {
        //Check default constructor
        Student student_1 = new Student(18, "Petya");

        student_1.print();

        Student student_2 = new Student(20, "Kolya");

        student_2.print();

        student_1.setAge(30);
        student_1.print();

        student_2.setName("Masha");
        System.out.println(student_2.getName());
        student_2.print();


    }
}
