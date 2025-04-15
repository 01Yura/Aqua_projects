package my_tasks;

import java.util.Objects;

public class Test16 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2015);
        Car car2 = new Car("Mitsubishi", 2010);
        Car car3 = new Car("Mitsubishi", 2010);

        System.out.println(car2.equals(car3));
    }

}

class Car {
    String name;
    int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car) || o == null) return false;
        else return this.year == car.year && this.name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
