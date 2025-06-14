package no_bugs.practice11.builder.game;

public class GameCharacter {
    int health;
    int impact;
    int armor;
    int magic;

    public GameCharacter(int health, int impact, int armor, int magic) {
        this.health = health;
        this.impact = impact;
        this.armor = armor;
        this.magic = magic;
    }

    public GameCharacter(Builder builder) {
        this.health = builder.health;
        this.impact = builder.impact;
        this.armor = builder.armor;
        this.magic = builder.magic;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "health=" + health +
                ", impact=" + impact +
                ", armor=" + armor +
                ", magic=" + magic +
                '}';
    }

    public static class Builder {
        int health;
        int impact;
        int armor;
        int magic;

        public Builder setHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder setImpact(int impact) {
            this.impact = impact;
            return this;
        }

        public Builder setArmor(int armor) {
            this.armor = armor;
            return this;
        }

        public Builder setMagic(int magic) {
            this.magic = magic;
            return this;
        }

        public GameCharacter build() {
            return new GameCharacter(this);
        }
    }


}
