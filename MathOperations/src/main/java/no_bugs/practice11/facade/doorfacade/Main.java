package no_bugs.practice11.facade.doorfacade;

public class Main {
    public static void main(String[] args) {
        DoorOpener doorOpener = new DoorOpener();
        DoorCloser doorCloser = new DoorCloser();
        DoorBlocker doorBlocker = new DoorBlocker();

        DoorFacade doorFacade = new DoorFacade(doorOpener, doorCloser, doorBlocker);
        doorFacade.doAllOperations();
    }
}
