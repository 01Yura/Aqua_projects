package my_tasks.farm;

public class Pig extends Animal {
    public Pig(String name, String food, int age) {
        super(name, food, age);
    }

    @Override
    protected void eat() {
        System.out.println(this.name + " is eating " + food.toString().toLowerCase());
    }

    @Override
    protected void makeSound() {
        System.out.println(this.name + " is Hru-hru-hru...");
    }
}
