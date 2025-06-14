package no_bugs.homework_5.theme_park;

public abstract class Attraction {
    private String title;
    private String info;

    public Attraction(String title, String info) {
        this.title = title;
        this.info = info;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public void maintain() {
        System.out.println(this.getTitle() + " attraction is fixing now");
    }
}
