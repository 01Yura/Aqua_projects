package no_bugs.practice9.solid.isp.before;

//7. Нарушение ISP (Interface Segregation Principle) – слишком большой интерфейс
//Задача: Разделите интерфейс на отдельные специализированные интерфейсы.
//Исходный код:

interface Worker {
    void work();

    void eat();
}

public class Programmer implements Worker {
    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Программист не ест на работе");
    }
}


