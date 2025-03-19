package my_tasks;

public class Test1 {
    public static void main(String[] args) {
        Person yura = new Person("Yura", 39);
        System.out.println(yura);
    }
}

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", age: " + this.age;
    }


}

