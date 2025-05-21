package my_tasks.task60.clone;

import java.util.Objects;

public class Bird {
    String species;
    int age;

    public Bird(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Bird bird1 = new Bird("Sparrow", 1);
        Bird bird2 = bird1.clone();
        System.out.println(bird1.equals(bird2));

        System.out.println(bird1.toString());
        System.out.println(bird2.toString());
    }

    @Override
    protected Bird clone() throws CloneNotSupportedException {
        return new Bird(species, age);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bird bird)) return false;
        return age == bird.age && Objects.equals(species, bird.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, age);
    }
}
