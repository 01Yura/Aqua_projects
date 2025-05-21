package practice9.solid.lsp.before;

//6. Нарушение LSP (Liskov Substitution Principle) – некорректное поведение подклассов
//Исходный код:
//Задача: Перепроектируйте код так, чтобы классы-наследники не нарушали поведение базового класса.

public class Bird {
    public void fly() {
        System.out.println("Птица летит");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Пингвины не летают");
    }
}

