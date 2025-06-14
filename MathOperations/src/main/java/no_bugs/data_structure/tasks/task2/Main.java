package no_bugs.data_structure.tasks.task2;

//2. Очередь задач для обработки
//Система должна обрабатывать запросы в порядке их поступления. Требуется поддерживать последовательность.

public class Main {
    public static void main(String[] args) {
//        Create storage
        Storage storage = new Storage();
//        Add new requests
        storage.addRequest("Navigate to the website");
        storage.addRequest("Log in");
        storage.addRequest("Edit profile info");
        storage.addRequest("Save");
        storage.addRequest("Log out");
        System.out.println();
//        Show storage
        storage.showRequests();
        System.out.println();
//        Perform requests
        storage.performRequest();
        storage.performRequest();
        System.out.println();
//        Show storage
        storage.showRequests();
    }
}