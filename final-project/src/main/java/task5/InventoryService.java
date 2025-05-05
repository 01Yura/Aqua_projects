package task5;

import java.util.*;
import java.util.stream.Collectors;

public class InventoryService {
    Map<String, List<Product>> map;
    boolean isInventoryOpen;

    public boolean isInventoryOpen() {
        return isInventoryOpen;
    }

    public InventoryService() {
        this.map = new HashMap<>();
    }

    public Map<String, List<Product>> getMap() {
        return map;
    }

    public boolean addProduct(Product product) {
        if (isInventoryOpen) {
            map.putIfAbsent(product.getCategory(), new ArrayList<>());
            map.get(product.getCategory()).add(product);
            System.out.println("The product " + product.getName() + "has been added to our warehouse");
            return true;
        }
        System.out.println("The warehouse is closed");
        return false;
    }

    public Product getProductByCategory(String category) throws OutOfStockException {
        if (!map.containsKey(category) || map.get(category).size() == 0) {
            throw new OutOfStockException("This product is unavailable now");
        }

        Product product = null;
        product = map.get(category).getLast();
        map.get(category).remove(product);
        return product;
    }

    public boolean openShop() {
        if (isInventoryOpen) {
            System.out.println("The shop is already open");
        } else {
            isInventoryOpen = true;
            System.out.println("The shop is open now");
        }
        return true;
    }

    public List<Product> filterProductsByCategory(String category) {
//        List<Product> list = new ArrayList<>();
//        for (Map.Entry<String, List<Product>> entry : map.entrySet()) {
//            if (entry.getKey().equals(category)) {
//                list = entry.getValue();
//            }
//        }
//        return list;

        List<Product> list = map.values().stream()
                .flatMap(products -> products.stream())
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());

        return list;
    }

    public LinkedHashMap<String, Integer> filterProductsByPrice(int min, int max) {
//        Map<Integer, String> treeMap = new TreeMap<>();
//        for (Map.Entry<String, List<Product>> entry : map.entrySet()) {
//            for (Product product : entry.getValue()) {
//                if (product.getPrice() >= min && product.getPrice() <= max){
//                    treeMap.put(product.getPrice(), product.getName());
//                }
//            }
//        }
//
//        return treeMap;
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Product>> entry : map.entrySet()) {
            List<Product> list = entry.getValue();
            for (Product product : list) {
                if (product.getPrice() >= min && product.getPrice() <= max) {
                    linkedHashMap.put(product.getName(), product.getPrice());
                }
            }
        }
        return linkedHashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())               // сортируем по значению, то же самое что и .sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,              // функция разрешения коллизий (если вдруг будут дубликаты ключей)
                        LinkedHashMap::new                          // сохранение порядка
                ));

    }

//    Дополнительные методы не связанные с заданием

    public Map<String, List<Product>> sortByPrice(){
        for (Map.Entry<String, List<Product>> entry : map.entrySet()) {
            List<Product> list = entry.getValue();
            map.put(entry.getKey(), list.stream().sorted(Comparator.comparing(Product::getPrice)).toList());
        }

        return map;
    }

    public List<Product> filterProductsByPriceReturnList(int min, int max){
         List<Product> list = map.values().stream()
                .flatMap(l -> l.stream())
                .filter(product -> product.getPrice()>=min && product.getPrice()<= max)
                 .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());

        return list;
    }

    public Map<String, List<Product>> groupByCategory(){
        return map.values().stream()
                .flatMap(e-> e.stream())
                .collect(Collectors.groupingBy(product -> product.getCategory()));
    }
}


