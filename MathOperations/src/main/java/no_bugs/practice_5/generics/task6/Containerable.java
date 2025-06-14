package no_bugs.practice_5.generics.task6;

//Задача: Создайте интерфейс Containerable<T>, содержащий методы add(T item) и get().

public interface Containerable<T> {


    public void addElement(T element);

    public T getElement();
}
