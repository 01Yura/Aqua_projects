package homework_5.theme_park;

public class Disneyland {
    public void showInfo(Attraction attraction) {
        System.out.println("Welcome to our " + attraction.getTitle());
        System.out.println("This attraction is  " + attraction.getInfo());
    }

    public void maintain(Attraction attraction) {
        System.out.println("Warning!!!");
        attraction.maintain();
    }
}
