package homework_5.theme_park;


public class Main {
    public static void main(String[] args) {
        Disneyland myDisneyland1 = new Disneyland();
        RollerCoaster myCoaster = new RollerCoaster("Crazy Roller Coaster", "available for children aged more then 15");
        Carousel myCarousel = new Carousel("Baby Carousel", "available for all ages");

        myDisneyland1.showInfo(myCoaster);
        myDisneyland1.showInfo(myCarousel);
        System.out.println();
        myDisneyland1.maintain(myCoaster);
        System.out.println();
        myDisneyland1.maintain(myCarousel);

    }
}
