package task4;

public class Main {
    public static void main(String[] args) {
        MovieService netflix = new MovieService();

        netflix.addMovie("Home Alone");
        netflix.addMovie("Terminator");
        netflix.addMovie("Ace Ventura");


        netflix.addGrade("Home Alone", 5);
        netflix.addGrade("Terminator",3);
        netflix.addGrade("Home Alone",3);
        netflix.addGrade("Ace Ventura",6);
        netflix.addGrade("Terminator",10);
        netflix.addGrade("Terminator",2);
        System.out.println();

        netflix.getMap().entrySet().forEach(System.out::println);
        System.out.println();

        System.out.println(netflix.average("Home Alone"));
        System.out.println();

        netflix.sortByAverageRating();


    }
}
