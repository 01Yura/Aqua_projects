package practice11.factorymethod.weapons;

public class Main {
    public static void main(String[] args) {
        IWeapon weapon;
        weapon = WeaponFactory.createWeapon("GUN");
        weapon.useWeapon();

        WeaponFactory.createWeapon("dsf").useWeapon();
    }
}
