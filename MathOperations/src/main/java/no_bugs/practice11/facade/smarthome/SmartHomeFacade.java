package no_bugs.practice11.facade.smarthome;

public class SmartHomeFacade implements Onable, Offable {
    private Light light;
    private AirConditioner airConditioner;
    private SecuritySystem securitySystem;

    public SmartHomeFacade(Light light, AirConditioner airConditioner, SecuritySystem securitySystem) {
        this.light = light;
        this.airConditioner = airConditioner;
        this.securitySystem = securitySystem;
    }

    @Override
    public void off() {
        light.off();
        airConditioner.off();
        securitySystem.off();
    }

    @Override
    public void on() {
        light.on();
        airConditioner.on();
        securitySystem.on();
    }


}
