package farm_package;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating grass");
    }

    @Override
    public void clean() {
        System.out.println(this.getName() + " is cleaning its skin");
    }

    @Override
    public void graze() {
        System.out.println(this.getName() + " is grazing in the pasture");

    }
}
