package no_bugs.practice9.solid.dip.after;

public class NotificationService {
    MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void sendMessage(String message) {
        sender.send(message);
    }
}

