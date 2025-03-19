package disneyland_package;

public class RollerCoaster extends Attraction {
    public RollerCoaster(String title, String info) {
        super(title, info);
    }

    @Override
    public void maintain() {
        super.maintain();
        System.out.println("We need to tighten all bolts");
    }
}
