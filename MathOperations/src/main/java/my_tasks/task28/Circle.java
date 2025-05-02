package my_tasks.task28;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * Math.PI * Math.pow(this.radius, 2);
    }
}
