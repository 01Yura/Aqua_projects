package homework_5.pet;

public class Dog extends Pet implements Walkable {
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

}
