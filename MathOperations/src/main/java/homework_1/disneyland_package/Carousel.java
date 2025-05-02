package homework_1.disneyland_package;

public class Carousel extends Attraction {
    public Carousel(String title, String info) {
        super(title, info);
    }

    @Override
    public void maintain() {
        super.maintain();
        System.out.println("We need to lubricant all mechanism");
    }
}
