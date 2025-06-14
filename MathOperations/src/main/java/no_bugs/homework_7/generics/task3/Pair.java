package no_bugs.homework_7.generics.task3;

public class Pair<T, U> {
    private T id;
    private U name;

    public Pair(T id, U name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Pair pair1 = new Pair(1, "One");
        Pair pair2 = new Pair(3.14, 'O');

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println();

        pair1.setId(12345);
        pair1.setName("qwerty");
        System.out.println(pair1.getId());
        System.out.println(pair1.getName());
    }

    public String toString() {
        return this.id + " " + this.name;
    }

    public T getId() {
        return this.id;
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
}
