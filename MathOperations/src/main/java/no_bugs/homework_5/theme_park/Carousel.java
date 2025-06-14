package no_bugs.homework_5.theme_park;

public class Carousel extends Attraction {
    public Carousel(String title, String info) {
        super(title, info);
    }

    @Override
    public void maintain() {
        super.maintain();
        System.out.println("Now we are lubricating the mechanisms");
    }
}
