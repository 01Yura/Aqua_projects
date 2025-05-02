package task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class InventoryServiceTest {
    InventoryService service;

    @BeforeEach
    void setUp() {
         service = new InventoryService();
    }

    @Test
    void addProductReturnsTrueIfFieldisInventoryOpenEqualsTrue() {
        service.openShop();
        assertTrue(service.addProduct(new Product("Mouse Acer", 100, "PC devices")));
    }

    @Test
    void addProductReturnsFalseIfFieldisInventoryOpenEqualsFalse() {
        assertFalse(service.addProduct(new Product("Mouse Acer", 100, "PC devices")));
    }

    @Test
    void getProductByCategoryReturnsProductIfCategoryIsAvailableAndProductIsAvailable() throws OutOfStockException {
        service.getMap().put("PC devices", new ArrayList<>(Arrays.asList(new Product("Mouse Acer", 100, "PC devices"))));
        service.getMap().put("Smartphones", new ArrayList<>(Arrays.asList(new Product("IphoneXR Apple", 1000, "Smartphones"))));

        Product expected = new Product("IphoneXR Apple", 1000, "Smartphones");

        assertEquals(expected, service.getProductByCategory("Smartphones"));
    }

    @Test
    void getProductByCategoryReturnsOutOfStockExceptionIfCategoryIsAbsent() {
        service.getMap().put("PC devices", new ArrayList<>(Arrays.asList(new Product("Mouse Acer", 100, "PC devices"))));
        service.getMap().put("Smartphones", new ArrayList<>(Arrays.asList(new Product("IphoneXR Apple", 1000, "Smartphones"))));

        assertThrows(OutOfStockException.class, () -> {
            service.getProductByCategory("Toys");
        }, "Method should return OutOfStockException");
    }

    @Test
    void getProductByCategoryReturnsOutOfStockExceptionIfProductIsAbsent() {
        service.getMap().put("PC devices", new ArrayList<>(Arrays.asList(new Product("Mouse Acer", 100, "PC devices"))));
        service.getMap().put("Smartphones", new ArrayList<>());

        assertThrows(OutOfStockException.class, () -> {
            service.getProductByCategory("Smartphones");
        }, "Method should return OutOfStockException");
    }

    @Test
    void filterProductsByPriceShouldReturnCollectionOfProductsInTheFormNameAndPrice() {
        service.getMap().put("PC devices", new ArrayList<>(Arrays.asList(
                new Product("Mouse Acer", 100, "PC devices"),
                new Product("Keybord Acer", 50, "PC devices")))
        );
        service.getMap().put("Smartphones", new ArrayList<>(Arrays.asList(
                new Product("IphoneXR Apple", 1000, "Smartphones"),
                new Product("GooglePixel Android", 900, "Smartphones")))
        );


        Map<String, Integer> expected = Collections.unmodifiableMap(new LinkedHashMap<>(Map.of("Mouse Acer", 100, "GooglePixel Android", 900)));
        assertEquals(expected, service.filterProductsByPrice(99,901));
    }

    @Test
    void filterProductsByCategoryShouldReturnCollectionOfProducts() {

        service.getMap().put("PC devices", new ArrayList<>(Arrays.asList(
                new Product("Mouse Acer", 100, "PC devices"),
                new Product("Keybord Acer", 50, "PC devices")))
        );
        service.getMap().put("Smartphones", new ArrayList<>(Arrays.asList(
                new Product("IphoneXR Apple", 1000, "Smartphones"),
                new Product("GooglePixel Android", 900, "Smartphones")))
        );

        List<Product> expected = new ArrayList<>();
        expected = List.of(
                new Product("IphoneXR Apple", 1000, "Smartphones"),
                new Product("GooglePixel Android", 900, "Smartphones")
        );


        assertEquals(expected, service.filterProductsByCategory("Smartphones"));
    }
}