package no_bugs.data_structure.tasks.task8;

public class User {
    private final int IP;

    public User(int IP) {
        this.IP = IP;
    }

    public int getIP() {
        return IP;
    }

    @Override
    public String toString() {
        return String.valueOf(IP);
    }
}
