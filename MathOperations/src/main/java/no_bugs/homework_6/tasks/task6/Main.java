package no_bugs.homework_6.tasks.task6;

public class Main {
    public static void main(String[] args) {
        SocialNetwork facebook = new SocialNetwork();

        Friend yura = new Friend("Yura");
        Friend max = new Friend("Max");
        Friend sveta = new Friend("Sveta");
        Friend kolya = new Friend("Kolya");

        facebook.addFriend(yura, max);
        facebook.addFriend(yura, sveta);
        facebook.addFriend(yura, kolya);
        facebook.addFriend(max, sveta);

        facebook.print();
    }
}
