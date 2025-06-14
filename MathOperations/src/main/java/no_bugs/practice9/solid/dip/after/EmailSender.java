package no_bugs.practice9.solid.dip.after;

public class EmailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}
