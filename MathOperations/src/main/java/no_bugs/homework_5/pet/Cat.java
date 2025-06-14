package no_bugs.homework_5.pet;

public class Cat extends Pet implements Playable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating wet food");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " is playing with a cat teaser");
    }
}