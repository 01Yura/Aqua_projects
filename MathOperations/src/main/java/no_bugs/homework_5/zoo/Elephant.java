package no_bugs.homework_5.zoo;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " is walking slowly");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " is trumpeting");
    }
}
