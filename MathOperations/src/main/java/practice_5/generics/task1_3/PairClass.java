package practice_5.generics.task1_3;

public class PairClass<T, U> {
    private T id;
    private U name;

    public PairClass(T id, U name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        PairClass pair1 = new PairClass(1, "One");
        PairClass pair2 = new PairClass(3.14, 'A');

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println();

        pair1.setName("TYRTYRYRYRY");
        pair1.setId(123);

        System.out.println(pair1.getName());
        System.out.println(pair1.getId());

    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
