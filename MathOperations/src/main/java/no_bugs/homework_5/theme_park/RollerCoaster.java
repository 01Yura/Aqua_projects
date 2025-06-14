package no_bugs.homework_5.theme_park;

public class RollerCoaster extends Attraction {
    public RollerCoaster(String title, String info) {
        super(title, info);
    }

    @Override
    public void maintain() {
        super.maintain();
        System.out.println("Now we are tightening the bolts");
    }
}
