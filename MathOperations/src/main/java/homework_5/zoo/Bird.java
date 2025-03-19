package homework_5.zoo;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " is flying");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " is tweeting");
    }
}
