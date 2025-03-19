package homework_2;

public class Teacher {
//    8. Реализуйте класс Teacher
//    Поля:
//    String name (имя учителя),
//    String subject (предмет).
//    Реализуйте:
//    Конструктор для задания имени и предмета.
//    Геттеры и сеттеры для обоих полей.
//    Метод printInfo() для вывода:
//            "Учитель: Анна Ивановна, Предмет: Математика".
//    В методе main создайте объект учителя, измените предмет через сеттер и выведите информацию.

    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public static void main(String[] args) {

        Teacher myTeacher = new Teacher("Anna Ivanovna", "Math");

        myTeacher.setSubject("Science");
        myTeacher.printInfo();

    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSubject() {
        return this.subject;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    void printInfo() {
        System.out.println("Teacher: " + this.name + ", Subject: " + this.subject);
    }


}
