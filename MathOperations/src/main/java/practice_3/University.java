package practice_3;

//Задача 4: Класс University
//Поля:
//static String universityName — название университета (общее для всех студентов).
//final int studentID — уникальный идентификатор студента.
//String studentName — имя студента.
//
//Реализуйте:
//Конструктор для инициализации studentID и studentName.
//Статический метод changeUniversityName(String newName) для изменения названия университета.
//Геттер для studentName и метод printStudentInfo(), который выводит информацию о студенте и университете.
//
//В методе main:
//Создайте 3 объекта студентов.
//Измените название университета через статический метод.
//Выведите информацию о каждом студенте.

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        University.universityName = newName;
    }

    public static void main(String[] args) {
        University student1 = new University(1, "Petya");
        University student2 = new University(2, "Vasya");
        University student3 = new University(3, "Masha");

        University.changeUniversityName("Oxford");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }

    void printStudentInfo() {
        System.out.println("Student name: " + this.studentName + ", University name: " + University.universityName);
    }

    String getStudentName() {
        return this.studentName;
    }


}
