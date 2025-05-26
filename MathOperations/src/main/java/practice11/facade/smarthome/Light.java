package practice11.facade.smarthome;

public class Light implements Onable, Offable {
    public void on() {
        System.out.println("The light is turned on");
    }

    public void off() {
        System.out.println("The light is turned off");
    }
}
