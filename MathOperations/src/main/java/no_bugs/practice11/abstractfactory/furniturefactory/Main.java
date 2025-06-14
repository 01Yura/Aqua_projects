package no_bugs.practice11.abstractfactory.furniturefactory;

public class Main {
    public static void main(String[] args) {
        System.out.println(FurnitureFactory.createSetOfFurniture("classic"));
        System.out.println(FurnitureFactory.createSetOfFurniture("modern"));
    }
}
