package disneyland_package;

public class Main {
    public static void main(String[] args) {
        Disneyland myDisneyland = new Disneyland();
        RollerCoaster myCoaster = new RollerCoaster("Crazy Rooler Coaster ", "Only for children older than 15 y.o.");
        Carousel myCarousel = new Carousel("Baby Carousel", "Suitable for little clients");

        myDisneyland.showAttractionInfo(myCoaster);
        myDisneyland.maintainAttraction(myCarousel);
    }
}
