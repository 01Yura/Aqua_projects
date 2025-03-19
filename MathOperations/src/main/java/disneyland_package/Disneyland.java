package disneyland_package;

public class Disneyland {
    public void showAttractionInfo(Attraction attraction) {
        attraction.getInfo();
    }

    public void maintainAttraction(Attraction attraction) {
        System.out.println("Warning!!!");
        attraction.maintain();
    }
}
