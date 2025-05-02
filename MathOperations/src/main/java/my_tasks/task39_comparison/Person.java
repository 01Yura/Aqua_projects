package my_tasks.task39_comparison;

import java.util.Comparator;
import java.util.TreeSet;

public class Person {
    private String name;
    private int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person(20, "Yura");
        Person person2 = new Person(15, "Zed");
        Person person3 = new Person(30, "Alex");
        Person person4 = new Person(45, "Max");
        Person person5 = new Person(40, "Max");

        TreeSet<Person> treeSet = new TreeSet<>(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        treeSet.add(person4);
        treeSet.add(person5);

        treeSet.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
