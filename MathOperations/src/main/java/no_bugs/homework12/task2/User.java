package no_bugs.homework12.task2;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return this.name;
    }
}
