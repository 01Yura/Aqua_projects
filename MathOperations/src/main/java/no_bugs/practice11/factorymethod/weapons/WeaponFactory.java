package no_bugs.practice11.factorymethod.weapons;

public class WeaponFactory {

    public static IWeapon createWeapon(String weaponType) {
        return switch (weaponType.toLowerCase()) {
            case "arch" -> new Arch();
            case "sword" -> new Sword();
            case "gun" -> new Gun();
            default -> throw new IllegalArgumentException("Unknown vehicle");
        };
    }
}
