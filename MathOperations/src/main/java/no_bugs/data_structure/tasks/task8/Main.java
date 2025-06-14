package no_bugs.data_structure.tasks.task8;

//8. Учет посещений страниц
//Система должна отслеживать уникальные посещения страниц на веб-сайте и вести подсчёт общего числа посещений.

public class Main {
    public static void main(String[] args) {
//        Create storage
        Storage storage = new Storage();
//        Create users
        User user1 = new User(11111);
        User user2 = new User(22222);
        User user3 = new User(33333);
        User user4 = new User(44444);
        User user5 = new User(55555);

//        Do different requests
        storage.navigateToWebPage("google.com", user1);
        storage.navigateToWebPage("yandex.ru", user1);
        storage.navigateToWebPage("google.com", user2);
        storage.navigateToWebPage("google.com", user2);
        storage.navigateToWebPage("yandex.ru", user1);
        storage.navigateToWebPage("vk.com", user2);
        storage.navigateToWebPage("google.com", user3);
        storage.navigateToWebPage("yandex.ru", user1);
        storage.navigateToWebPage("vk.com", user2);
        storage.navigateToWebPage("vk.com", user5);
        storage.navigateToWebPage("google.com", user5);
//        Show storage
        storage.showStorage();
        System.out.println();
//        Show number of unique visits
        storage.checkUniqueVisits("google.com");
        storage.checkUniqueVisits("yandex.ru");
        storage.checkUniqueVisits("vk.com");


    }
}
