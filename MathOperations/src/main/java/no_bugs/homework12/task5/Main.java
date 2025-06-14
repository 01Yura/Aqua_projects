package no_bugs.homework12.task5;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("TV", 100, "Technic");
        Product product2 = new Product("Chear", 10, "Furniture");
        Product product3 = new Product("Phone", 75, "Technic");
        Product product4 = new Product("Table", 30, "Furniture");
        Product product5 = new Product("Videocamera", 200, "Technic");
        Product product6 = new Product("Photocamera", 250, "Technic");

        InventoryService service = new InventoryService();
        service.setInventoryOpen(true);

        service.addProduct(product1);
        service.addProduct(product2);
        service.addProduct(product3);
        service.addProduct(product4);
        service.addProduct(product5);
        service.addProduct(product6);

        System.out.println(service.findProductByName("Phone1"));
        System.out.println();

        System.out.println(service.findAllProductByCategory("Furniture"));
        System.out.println(service.filterProductsByPrice(50, 240));

    }
}
