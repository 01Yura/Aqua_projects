package no_bugs.practice11.facade.smarthome;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();
        SecuritySystem securitySystem = new SecuritySystem();
        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(light, airConditioner, securitySystem);
        smartHomeFacade.on();
        smartHomeFacade.off();
    }
}
