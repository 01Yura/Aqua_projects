package my_tasks.hashmap_experiment;

import java.util.HashMap;
import java.util.Objects;

public class HashMapExperiment {
    public static void main(String[] args) {
        HashMap<Person, Integer> hashMap = new HashMap<>();
        Person yura = new Person("Yura", 3, 39, "CEO");
        Person petya = new Person("Petya", 3, 25, "Bartender");
        Person kolya = new Person("Kolya", 2, 27, "Waiter");
        Person masha = new Person("Masha", 1, 18, "Prostitute");

        hashMap.put(yura, yura.id);
        hashMap.put(petya, petya.id);
        hashMap.put(kolya, kolya.id);

        hashMap.entrySet().forEach(System.out::println);
        System.out.println("-------");
        System.out.println("yura.hashCode() = " + yura.hashCode());
        System.out.println(hashMap.containsKey(yura));
        System.out.println("----Changed name, but it takes part in hashcode---");
        yura.setName("qwerty");
        System.out.println("yura.hashCode() = " + yura.hashCode());
        System.out.println(hashMap.get(yura)); // возвращает null, так как не может найти такой ключ из-за того что изменив имя мы сменили hashcode и он ищет не в том бакете
        System.out.println("-------");
        hashMap.entrySet().forEach(System.out::println);

        System.out.println("---Added to new hashmap and rehash has been done----");
        HashMap<Person, Integer> hashMap2 = new HashMap<>(hashMap);
        System.out.println(hashMap2.containsKey(yura));


    }
}

class Person {
    String name;
    int id;
    int age;
    String position;

    public Person(String name, int id, int age, String position) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return getId() == person.getId() && getAge() == person.getAge() && Objects.equals(getName(), person.getName()) && Objects.equals(getPosition(), person.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getAge(), getPosition());
    }
}
