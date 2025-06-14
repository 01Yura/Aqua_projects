package no_bugs.homework_6.tasks.task8;

public class Main {
    public static void main(String[] args) {
        WebStorage webStorage = new WebStorage();
        webStorage.navigateToWebsite("vk.com", 1);
        webStorage.navigateToWebsite("yandex.com", 1);
        webStorage.navigateToWebsite("google.com", 2);
        webStorage.navigateToWebsite("google.com", 3);
        webStorage.navigateToWebsite("google.com", 1);
        webStorage.navigateToWebsite("vk.com", 2);
        webStorage.navigateToWebsite("vk.com", 1);

        webStorage.print();
        System.out.println();
        webStorage.checkUniqueVisits("vk.com");
        webStorage.checkUniqueVisits("yandex.com");
        webStorage.checkUniqueVisits("google.com");
    }
}
