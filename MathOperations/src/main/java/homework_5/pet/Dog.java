package homework_5.pet;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating dry food");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is running");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " is playing with a ball");
    }
}
