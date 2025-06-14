package no_bugs.homework12.task5;

import java.util.*;
import java.util.stream.Collectors;

public class InventoryService {
    private boolean isInventoryOpen = false;
    private Map<String, ArrayList<Product>> warehouse;

    public InventoryService() {
        this.warehouse = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (isInventoryOpen) {
            warehouse.putIfAbsent(product.getCategory(), new ArrayList<>());
            warehouse.get(product.getCategory()).add(product);
        } else System.out.println("Невозможно добавить товар в данное время");
    }

    public Map<String, ArrayList<Product>> getWarehouse() {
        return warehouse;
    }

    public void setInventoryOpen(boolean IsinventoryOpen) {
        this.isInventoryOpen = IsinventoryOpen;
    }

    public boolean findProductByName(String name) {
        boolean flag = false;
        Collection<ArrayList<Product>> listOfProduct = warehouse.values();
        for (ArrayList<Product> list : listOfProduct) {
            for (Product product : list) {
                if (product.getName().equals(name)) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public List<Product> findAllProductByCategory(String category) {
        List<Product> list = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Product>> entry : warehouse.entrySet()) {
            if (entry.getKey().equals(category)) {
                list = entry.getValue();
            }
        }
        return list;


    }

    public List<Product> filterProductsByPrice(int min, int max) {
//        List<Product> finalList = new ArrayList<>();
//        for (Map.Entry<String, ArrayList<Product>> entry : warehouse.entrySet()) {
//            List<Product> list = entry.getValue();
//            for (Product product : list) {
//                if (product.getPrice() >= min && product.getPrice() <= max) {
//                    finalList.add(product);
//                }
//            }
//        }
//
//        finalList.sort(Comparator.comparing(Product::getPrice));
//        return finalList;


        return warehouse.values()
                .stream()
                .flatMap(list -> list.stream())
                .filter(product -> product.getPrice() >= min && product.getPrice() <= max)
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }
}
