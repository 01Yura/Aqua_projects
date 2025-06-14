package no_bugs.practice9.solid.isp.after;

public class Programmer implements Workable {
    @Override
    public void work() {
        System.out.println("Programmer is writing the code");
    }
}
