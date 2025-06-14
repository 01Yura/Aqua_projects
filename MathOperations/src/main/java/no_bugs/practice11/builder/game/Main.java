package no_bugs.practice11.builder.game;

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter(100, 10, 100, 5);
        GameCharacter flexibleGameCharacter = new GameCharacter.Builder().setHealth(100).setImpact(20).build();
        System.out.println(flexibleGameCharacter);
    }

}
