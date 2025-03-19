package data_structure.tasks.task19;

public class Gamer implements Comparable<Gamer> {
    private String name;
    private int rate;

    public Gamer(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public int compareTo(Gamer o) {
        return this.rate - o.rate;
    }

    @Override
    public String toString() {
        return "Gamer " + name + " with rate " + rate;
    }
}
