package no_bugs.practice11.facade.smarthome;

public class AirConditioner implements Onable, Offable {
    public void on() {
        System.out.println("The air conditioner is turned on");
    }

    public void off() {
        System.out.println("The air conditioner is turned off");
    }
}
