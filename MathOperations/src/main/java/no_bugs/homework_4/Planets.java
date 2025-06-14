package no_bugs.homework_4;

public enum Planets {
    MERCURY(1, 0.1),
    VENUS(2, 0.5),
    EARTH(3, 1),
    MARS(4, 0.3),
    JUPITER(5, 5.08),
    SATURN(6, 8.018),
    URANUS(7, 1.5),
    NEPTUNE(8, 2.23);


    int order;
    double mass;

    Planets(int order, double mass) {
        this.order = order;
        this.mass = mass;
    }

    public void displayPlanetInfo() {
        System.out.println("Order number: " + this.order);
        System.out.println("Relative mass: " + this.mass);
    }

}

