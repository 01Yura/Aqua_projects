package no_bugs.homework_5.museum;

public class Main {
    public static void main(String[] args) {
        Museum myMuseum = new Museum();
        Manuscript myManuscript = new Manuscript("The age of this manuscript 1000 y.o.", "Egipt Manuscript", "temp is 20, humidity is 20", "temp is 30, humidity is 50");
        Sculpture mySculpture = new Sculpture("This is a ancient sculpture", "Egipt Sculpture", "Material is in perfect condition", "Material is in bad condition ");

        myMuseum.addExhibit(myManuscript);
        System.out.println();

        myMuseum.showInfo(myManuscript);
        myMuseum.showIdealCond(myManuscript);
        myMuseum.showCurrentCond(myManuscript);
        myMuseum.maintain(myManuscript, "temp is 25, humidity is 20");
    }
}
