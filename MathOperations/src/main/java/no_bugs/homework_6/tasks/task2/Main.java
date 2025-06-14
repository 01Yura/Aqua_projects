package no_bugs.homework_6.tasks.task2;

public class Main {
    public static void main(String[] args) {
        OurQueue queue = new OurQueue();

        queue.addRequest("Navigate to the website");
        queue.addRequest("Log in");
        queue.addRequest("Have fun");

        queue.showOurQueue();
        System.out.println();
        queue.performRequest();
        queue.showOurQueue();
    }
}
