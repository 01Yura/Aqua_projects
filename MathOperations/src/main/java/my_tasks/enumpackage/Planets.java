package my_tasks.enumpackage;

public enum Planets {
    MERCURY(1000),
    VENUS(5000),
    EARTH(900000);
    private int mass;

    Planets(int mass) {
        this.mass = mass;
    }

    public void getInfo() {
        System.out.println("Massa planety " + this + " ravna " + this.mass);
    }
}
