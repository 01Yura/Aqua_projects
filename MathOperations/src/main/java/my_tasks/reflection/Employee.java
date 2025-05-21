package my_tasks.reflection;

public class Employee {
    public String name;
    public int id;
    private int age;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee() {
    }

    public Employee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
