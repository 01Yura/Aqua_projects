package no_bugs.practice11.factorymethod.weapons;

public class Gun implements IWeapon {
    @Override
    public void useWeapon() {
        System.out.println("I shoot bullets from the gun");
    }
}
