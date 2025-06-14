package no_bugs.practice11.abstractfactory.furniturefactory;

public class ClassicFactory implements FurnitureCreatable {

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
