package homework_6.tasks.task19;

public class Gamer implements Comparable<Gamer> {
    private String gamerName;
    private int gamerRate;

    public Gamer(String gamerName, int gamerRate) {
        this.gamerName = gamerName;
        this.gamerRate = gamerRate;
    }

    public String getGamerName() {
        return gamerName;
    }

    public int getGamerRate() {
        return gamerRate;
    }

    @Override
    public String toString() {
        return "Gamer: " + gamerName +
                " has gamerRate " + gamerRate;
    }

    @Override
    public int compareTo(Gamer o) {
        return this.getGamerRate() - o.getGamerRate();
    }
}
