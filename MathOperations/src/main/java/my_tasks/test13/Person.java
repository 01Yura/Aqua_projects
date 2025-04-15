package my_tasks.test13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();

        Person p1 = new Person("Yura", 39);
        Person p2 = new Person("Petia", 18);
        Person p3 = new Person("Kolya", 50);
        Person p4 = new Person("Ali", 66);
        Person p5 = new Person("Yarik", 15);

        linkedList.add(p1);
        linkedList.add(p2);
        linkedList.add(p3);
        linkedList.add(p4);
        linkedList.add(p5);

        System.out.println(linkedList);
//        Collections.sort(linkedList, (px, py) -> px.getAge() - py.getAge());
//        System.out.println(linkedList);
//        Collections.sort(linkedList, (px, py) -> px.getName().compareTo(py.getName()));
//        System.out.println(linkedList);

        linkedList.sort((x, y) -> x.getAge() - y.getAge());
        System.out.println(linkedList);
        linkedList.sort(Comparator.comparing(Person::getAge));


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);

        System.out.println(arrayList);

        Collections.sort(arrayList, Comparator.reverseOrder());
        arrayList.sort(null);
        System.out.println(arrayList);


    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
