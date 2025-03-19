package farm_package;

public class Chicken extends Animal {
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating grain");
    }

    @Override
    public void clean() {
        System.out.println(this.getName() + " is cleaning its feathers");
    }

    @Override
    public void graze() {
        System.out.println(this.getName() + " is grazing in the chicken fold");

    }
}
