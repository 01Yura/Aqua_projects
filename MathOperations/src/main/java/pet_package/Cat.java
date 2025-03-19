package pet_package;

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
        System.out.println(this.getName() + " is walking on the rooftops");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " is playing with cat teaser");
    }

}
