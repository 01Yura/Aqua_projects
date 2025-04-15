package homework_8.anonimus_class;

//2. Использование анонимного класса
//Задача: Создайте анонимный класс, реализующий интерфейс Runnable, который выводит сообщение "Hello from anonymous class!".

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
