package no_bugs.homework13_same_as_12.task1;

import java.util.Objects;

public class Entity implements EntityMethods {
    private String name;
    private int age;
    private boolean isActive;

    public Entity(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getisActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Entity entity)) return false;
        return getAge() == entity.getAge() && getisActive() == entity.getisActive() && Objects.equals(getName(), entity.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getisActive());
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }
}
