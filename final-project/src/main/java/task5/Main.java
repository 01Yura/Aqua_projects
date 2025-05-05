package task5;

public class Main {
    public static void main(String[] args) throws OutOfStockException {
        Product mouse = new Product("Mouse Acer", 100, "PC devices");
        Product keyboard = new Product("Keybord Acer", 50, "PC devices");
        Product IphoneXR = new Product("IphoneXR Apple", 1000, "Smartphones");
        Product GooglePixel = new Product("GooglePixel Android", 900, "Smartphones");

        InventoryService mVideoShop = new InventoryService();

        mVideoShop.openShop();

        mVideoShop.addProduct(mouse);
        mVideoShop.addProduct(keyboard);
        mVideoShop.addProduct(IphoneXR);
        mVideoShop.addProduct(GooglePixel);
        System.out.println();

//        System.out.println(mVideoShop.getProductByCategory("Smartphones"));
        System.out.println();

        mVideoShop.getMap().entrySet().forEach(System.out::println);
        System.out.println("------------------------------------");
        mVideoShop.filterProductsByCategory("PC devices").forEach(System.out::println);
        System.out.println("------------------------------------");
        mVideoShop.filterProductsByPrice(99,999).entrySet().forEach(System.out::println);
        System.out.println();

        mVideoShop.sortByPrice().entrySet().forEach(System.out::println);
    }
}
