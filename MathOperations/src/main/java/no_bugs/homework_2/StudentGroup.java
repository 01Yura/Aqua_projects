package no_bugs.homework_2;

public class StudentGroup {
//    6. Создайте класс StudentGroup
//    Поля:
//    String groupName (название группы),
//    int studentCount (количество студентов).
//    Реализуйте:
//    Конструктор для задания названия группы и количества студентов.
//    Геттеры и сеттеры для обоих полей.
//    Метод printInfo() для вывода информации о группе:
//            "Группа: QA, Количество студентов: 25".
//    В методе main измените количество студентов через сеттер и выведите обновлённую информацию.

    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public static void main(String[] args) {

        StudentGroup myNewGroup = new StudentGroup("QA", 25);

        myNewGroup.setStudentCount(30);

        myNewGroup.printInfo();
    }

    String getGroupName() {
        return this.groupName;
    }

    void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    int getStudentCount() {
        return this.studentCount;
    }

    void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    void printInfo() {
        System.out.println("Group: " + this.groupName + ", Amount of students: " + this.studentCount);
    }


}
