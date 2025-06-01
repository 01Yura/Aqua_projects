package homework12.task1;

public class Person implements EntityAbilities {
    String name;
    int age;
    boolean isEmployed;

    public Person(String name, int age, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.isEmployed = isEmployed;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean getEmployed() {
        return this.isEmployed;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isEmployed=" + isEmployed +
                '}';
    }
}

