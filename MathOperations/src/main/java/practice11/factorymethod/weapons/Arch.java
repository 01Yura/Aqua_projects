package practice11.factorymethod.weapons;

public class Arch implements IWeapon {
    @Override
    public void useWeapon() {
        System.out.println("I shoot arrows from the arch");
    }
}
