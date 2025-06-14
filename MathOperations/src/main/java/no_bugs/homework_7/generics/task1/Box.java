package no_bugs.homework_7.generics.task1;

public class Box<T> {
    private T element;

    public static void main(String[] args) {

        Box<Integer> boxOFIntegers = new Box<>();
        Box<String> boxOFStrings = new Box<>();

        boxOFIntegers.setElement(100);
        boxOFStrings.setElement("Hello");

        System.out.println(boxOFIntegers.getElement());
        System.out.println(boxOFStrings.getElement());


    }

    public T getElement() {
        return this.element;
    }

    public void setElement(T value) {
        this.element = value;
    }
}
