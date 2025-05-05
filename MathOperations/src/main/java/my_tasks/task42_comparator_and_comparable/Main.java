package my_tasks.task42_comparator_and_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Electronics", "Laptop", "Silver", 15, 1200.00);
        Product p2 = new Product("Electronics", "Smartphone", "Black", 6, 800.00);
        Product p3 = new Product("Clothing", "T-Shirt", "Red", 42, 19.99);
        Product p4 = new Product("Clothing", "Jeans", "Blue", 32, 49.99);
        Product p5 = new Product("Home", "Vacuum Cleaner", "Red", 20, 49.55);
        Product p6 = new Product("Home", "Blender", "Green", 10, 59.99);
        Product p7 = new Product("Sports", "Football", "Brown", 5, 25.00);
        Product p8 = new Product("Sports", "Bicycle", "Blue", 100, 800.00);
        Product p9 = new Product("Toys", "Lego Set", "Black", 3, 89.99);
        Product p10 = new Product("Toys", "Smartphone", "Silver", 2, 14.99);


        List<Product> list = new ArrayList<>();
        Collections.addAll(list, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

        System.out.println("Initial order: ");
        list.forEach(System.out::println);
        System.out.println();

        System.out.println("Sorting by price: ");
        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println();

        System.out.println("Sorting by size using Comparator: ");
        list.sort(new Product.SortBySize());
        list.forEach(System.out::println);
        System.out.println();

        System.out.println("Sorting by name using Comparator and Lambda: ");
        list.sort(new Product.SortByName().thenComparing(Comparator.comparing(Product::getCategory)));
        list.forEach(System.out::println);
        System.out.println();


        System.out.println("Stream but with Comparator and reverse:");
        list.stream().sorted(new Product.SortByName().reversed()).forEach(System.out::println);
        System.out.println();

        System.out.println("Stream with Lambda:");
        list.stream()
                .filter(product -> product.getPrice() > 700)
                .sorted(Comparator.comparing(Product::getSize)).forEach(System.out::println);
        System.out.println();


        list.stream().sorted(new Product.SortByName()).forEach(System.out::println);


    }
}
