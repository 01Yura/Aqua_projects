package homework_5.museum;

public class Museum {
    public void addExhibit(Exhibit exhibit) {
        System.out.println(exhibit.getName() + "has been added to the museum");
    }

    public void showInfo(Exhibit exhibit) {
        System.out.println(exhibit.getInfo());
    }

    public void showIdealCond(Exhibit exhibit) {
        System.out.println(exhibit.getIDEAL_STORAGE_COND());
    }

    public void showCurrentCond(Exhibit exhibit) {
        System.out.println(exhibit.getCurrentStorageCond());
    }

    public void maintain(Exhibit exhibit, String conditions) {
        System.out.println("Attention! Maintain is performing");
        exhibit.setCurrentStorageCond(conditions);
        System.out.println(exhibit.getCurrentStorageCond());
    }
}
