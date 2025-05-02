package my_tasks.task28;

public class Rectangle implements Shape {
    double width;
    double length;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return this.width * this.length;
    }
}
