package no_bugs.practice11.facade.smarthome;

public class SecuritySystem implements Onable, Offable {
    @Override
    public void off() {
        System.out.println("The security system is turned off");
    }

    @Override
    public void on() {
        System.out.println("The security system is turned on");
    }
}
