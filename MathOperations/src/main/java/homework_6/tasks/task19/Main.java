package homework_6.tasks.task19;

public class Main {
    public static void main(String[] args) {
        Storage gamerList = new Storage();

        Gamer gamer1 = new Gamer("Yura", 50);
        Gamer gamer2 = new Gamer("Max", 1);
        Gamer gamer3 = new Gamer("Sveta", 100);
        Gamer gamer4 = new Gamer("Kolya", 80);
        Gamer gamer5 = new Gamer("Vasya", 25);


        gamerList.addGamer(gamer1);
        gamerList.addGamer(gamer2);
        gamerList.addGamer(gamer3);
        gamerList.addGamer(gamer4);
        gamerList.addGamer(gamer5);

        gamerList.print();

        gamerList.showTheMostRateGamer();
        System.out.println();
    }
}
