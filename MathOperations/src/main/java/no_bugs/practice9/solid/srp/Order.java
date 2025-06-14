package no_bugs.practice9.solid.srp;

//4. Нарушение SRP (Single Responsibility Principle) – класс выполняет несколько задач
//Исходный код:
//Задача: Разделите класс Order на отдельные классы, каждый из которых выполняет только одну задачу.

public class Order {
    public void processOrder() {
        System.out.println("Обрабатываем заказ...");
    }

    public void sendEmailConfirmation() {
        System.out.println("Отправляем письмо клиенту...");
    }

    public void generateInvoice() {
        System.out.println("Генерируем счет...");
    }
}

class EmailConfirmator {
    public void sendEmailConfirmation() {
        System.out.println("Отправляем письмо клиенту...");
    }
}

class InvoiceGenerator {
    public void sendEmailConfirmation() {
        System.out.println("Отправляем письмо клиенту...");
    }
}

class OrderProcessor {
    public void processOrder() {
        System.out.println("Обрабатываем заказ...");
    }
}

