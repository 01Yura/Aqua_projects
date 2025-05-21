package my_tasks.farm;

public class Cow extends Animal {
    public Cow(String name, String food, int age) {
        super(name, food, age);
    }

    @Override
    protected void eat() {
        System.out.println(this.name + " is eating now");
    }

    @Override
    protected void makeSound() {
        System.out.println(this.name + " is Mooooooo...");
    }
}
