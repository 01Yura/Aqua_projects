package museum_package;

public class Main {
    public static void main(String[] args) {
        Museum myMuseum = new Museum();
        Manuscript myManuscript = new Manuscript("Old Manuscript", "issue year: 125", "temperature about 25C, humidity about 30", "temperature about 15C, humidity about 10");
        Sculpture mySculpture = new Sculpture("Old Sculpture", "issue year: 1200", "material in perfect condition", "material in bad condition");

        myMuseum.showExibitIdealConditions(myManuscript);
        myMuseum.showExibitCurrentConditions(myManuscript);
        myMuseum.maintain(myManuscript, "temperature about 30C, humidity about 40");

    }
}
