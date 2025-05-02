package my_tasks.task26;

public class Product {

    private static int productCount = 0;

    private String name;
    private double price;
    private boolean available;

    public Product(double price, boolean available, String name) {
        this.price = price;
        this.available = available;
        this.name = name;
        Product.productCount += 1;
    }

    public static void main(String[] args) {
        Product p1 = new Product(1000, true, "Watch");
        Product p2 = new Product(10, true, "Watch2");
        Product p3 = new Product(100, true, "Watch3");
        System.out.println(p1.getPrice());

        p1.applyDiscount(50);
        System.out.println(p1.getPrice());

        System.out.println(Product.getProductCount());
    }

    public static int getProductCount() {
        return productCount;
    }

    public void applyDiscount(double percent) {
        price = price - (price / 100 * percent);
    }

    public double getPrice() {
        return this.price;
    }
}
