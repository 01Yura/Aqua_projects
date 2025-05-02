package my_tasks.task42_comparator_and_comparable;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private String category;
    private String name;
    private String color;
    private int size;
    private double price;

    public Product(String category, String name, String color, int size, double price) {
        this.category = category;
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product o) {
        int result = (int) (this.price - o.price);
        if (result == 0) {
            result = this.size - o.size;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    public static class SortBySize implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.size - o2.size;
        }
    }

    public static class SortByName implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.name.compareTo(o2.name);
        }
    }
}
