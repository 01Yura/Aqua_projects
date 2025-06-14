package no_bugs.practice_6.anonimus_class;

/*2. Использование анонимного класса
Задача: Создайте анонимный класс, реализующий интерфейс Runnable, который выводит сообщение "Hello from anonymous class!".

В данном примере printer - это объект типа Runnable, который хранит анонимный класс, реализующий метод run().
Что происходит под капотом:
Интерфейс Runnable — это функциональный интерфейс, у которого есть один метод: void run().
Мы создаем анонимный (безымянный) класс, который реализует Runnable и переопределяет метод run().
Мы сразу создаём объект этого класса и присваиваем его в переменную printer.
То есть printer — это объект, который "знает", как выполнять run().*/

public class Main {
    public static void main(String[] args) {
        Runnable printer = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        printer.run();
    }
}
