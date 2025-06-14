package no_bugs.practice9.solid.dip.after;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new EmailSender());
        notificationService.sendMessage("I am sending email");
    }
}
