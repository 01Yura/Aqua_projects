package practice_4;

public class TaskSolver {

    public static void main(String[] args) {
        System.out.println(describeSeason(Season.WINTER));
    }

    public static String describeSeason(Season season) {
        String description = "";
        switch (season) {
            case WINTER -> description = "Холодно";
            case AUTUMN -> description = "Слякоть";
            case SPRING -> description = "Капель";
            case SUMMER -> description = "Жара";

        }
        return description;
    }
}
