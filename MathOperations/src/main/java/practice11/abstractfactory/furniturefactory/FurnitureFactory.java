package practice11.abstractfactory.furniturefactory;

import java.util.ArrayList;
import java.util.List;

public class FurnitureFactory {
    private static FurnitureCreatable createFactory(String style) {
        FurnitureCreatable factory;
        if (style.equalsIgnoreCase("modern")) {
            factory = new ModernFactory();
        } else if (style.equalsIgnoreCase("classic")) {
            factory = new ClassicFactory();
        } else {
            factory = null;
            System.out.println("We can not make such furniture");
        }
        return factory;
    }

    private static Chair createChair(String style) {
        return createFactory(style).createChair();
    }

    private static Table createTable(String style) {
        return createFactory(style).createTable();
    }

    public static List<Furniture> createSetOfFurniture(String style) {
        List<Furniture> list = new ArrayList<>();
        list.add(createChair(style));
        list.add(createChair(style));
        list.add(createChair(style));
        list.add(createChair(style));
        list.add(createTable(style));

        for (Furniture furniture : list) {
            furniture.info();
        }

        return list;
    }
}
