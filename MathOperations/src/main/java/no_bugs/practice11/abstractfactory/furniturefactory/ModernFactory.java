package no_bugs.practice11.abstractfactory.furniturefactory;

public class ModernFactory implements FurnitureCreatable {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
