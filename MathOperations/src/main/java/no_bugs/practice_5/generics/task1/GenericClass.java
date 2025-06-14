package no_bugs.practice_5.generics.task1;

//Обобщённый класс
//Задача: Создайте класс GenericClass<T>, который хранит элемент и возвращает его.


public class GenericClass<T> {
    private T element;

    public GenericClass(T element) {
        this.element = element;
    }

    public static void main(String[] args) {
        GenericClass<Integer> genericClass1 = new GenericClass<>(1);
        GenericClass<String> genericClass2 = new GenericClass<>("Hello");
        GenericClass<Double> genericClass3 = new GenericClass<>(3.14);

        genericClass1.getElement();
        genericClass2.getElement();
        genericClass3.getElement();
        System.out.println(genericClass1.getElement());
        System.out.println(genericClass2.getElement());
        System.out.println(genericClass3.getElement());


    }

    public T getElement() {
        return element;
    }
}
