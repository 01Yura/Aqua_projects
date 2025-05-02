package my_tasks.task34;

public abstract class Vehicle {
    private String model;
    private String name;
    private int capacity;

    public Vehicle(String model, String name, int capacity) {
        this.model = model;
        this.name = name;
        this.capacity = capacity;
    }

    protected void showInfo() {
        System.out.println("The capacity of " + this.getName() + " is equal to " + this.getCapacity());
    }


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
