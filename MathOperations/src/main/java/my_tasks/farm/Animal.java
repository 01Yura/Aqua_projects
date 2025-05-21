package my_tasks.farm;

public abstract class Animal {
    String name;
    Food food;
    int age;

    public Animal(String name, String food, int age) {
        this.name = name;
        this.food = Food.valueOf(food.toUpperCase());
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Food getFood() {
        return food;
    }

    public int getAge() {
        return age;
    }

    protected abstract void eat();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food=" + food +
                ", age=" + age +
                '}';
    }

    protected abstract void makeSound();
}
