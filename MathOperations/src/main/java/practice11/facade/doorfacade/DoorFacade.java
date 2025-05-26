package practice11.facade.doorfacade;

public class DoorFacade {
    DoorOpener doorOpener;
    DoorCloser doorCloser;
    DoorBlocker doorBlocker;

    public DoorFacade(DoorOpener doorOpener, DoorCloser doorCloser, DoorBlocker doorBlocker) {
        this.doorOpener = doorOpener;
        this.doorBlocker = doorBlocker;
        this.doorCloser = doorCloser;
    }

    public void doAllOperations() {
        doorOpener.openTheDoor();
        doorCloser.closeTheDoor();
        doorBlocker.blockTheDoor();
    }
}
