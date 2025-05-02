package homework_1.zoo_package;

public class Elephant extends Animal {


    public Elephant(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " is walking");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " is trumpeting");
    }


}
