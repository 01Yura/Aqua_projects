package my_tasks.enumpackage;

public class Main {
    public static void main(String[] args) {
        String s = "mercury";
        switch (s) {
            case "mercury" -> Planets.valueOf(s.toUpperCase()).getInfo();
            case "venus" -> Planets.VENUS.getInfo();
        }
    }


}
