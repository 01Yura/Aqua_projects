package homework_5.pet;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating wet food");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walkin on the rooftops");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " is playing with a cat teaser");
    }
}