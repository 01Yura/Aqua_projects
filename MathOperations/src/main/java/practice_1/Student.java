public class Student {
    int age;
    String name;

    // Конструктор
    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Метод для установки имени
    void setName(String newName) {
        this.name = newName;
    }

    // Метод для установки возраста
    void setAge(int newAge) {
        this.age = newAge;
    }

    // Метод для получения информации
    String getInfo() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    public static void main(String[] args) {
        // Создание объекта без именованных аргументов
        Student newStudent = new Student(18, "Petr");

        // Вывод информации
        System.out.println(newStudent.getInfo());
    }
}
