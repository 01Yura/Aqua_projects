package museum_package;

public class Museum {
    public void maintain(Exhibit exhibit, String condition) {
        exhibit.setCurrentStoreConditions(condition);
        System.out.println("Store conditions for " + exhibit.getName() + " have been changed");
        System.out.println("Current store conditions for " + exhibit.getName() + ": " + exhibit.getCurrentStoreConditions());
    }

    public void showExibitInfo(Exhibit exhibit) {
        exhibit.getInfo();
    }

    public void showExibitIdealConditions(Exhibit exhibit) {
        System.out.println("Ideal conditions for " + exhibit.getName() + ": ");
        System.out.println(exhibit.getIdealStoreConditions());
    }

    public void showExibitCurrentConditions(Exhibit exhibit) {
        System.out.println("Current conditions for " + exhibit.getName() + ": ");
        System.out.println(exhibit.getCurrentStoreConditions());
    }
}