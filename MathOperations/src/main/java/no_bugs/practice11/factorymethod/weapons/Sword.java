package no_bugs.practice11.factorymethod.weapons;

public class Sword implements IWeapon {
    @Override
    public void useWeapon() {
        System.out.println("I swing a sword and hit by sword");
    }
}
