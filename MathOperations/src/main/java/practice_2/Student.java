package practice_2;

public class Student {
    //    fields
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    void print() {
        System.out.println("Student name " + this.name + ", age is " + this.age);
    }
}



