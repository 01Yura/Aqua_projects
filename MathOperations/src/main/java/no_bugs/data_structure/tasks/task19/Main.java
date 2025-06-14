package no_bugs.data_structure.tasks.task19;

//19. Система рейтингов
//Вам нужно хранить список игроков с их рейтингами, чтобы быстро находить игрока с самым высоким рейтингом.

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Gamer gamer1 = new Gamer("Yura", 80);
        Gamer gamer2 = new Gamer("Max", 15);
        Gamer gamer3 = new Gamer("Petya", 2);
        Gamer gamer4 = new Gamer("Sveta", 100);
        Gamer gamer5 = new Gamer("Kolya", 57);

        storage.addGamer(gamer1);
        storage.addGamer(gamer2);
        storage.addGamer(gamer3);
        storage.addGamer(gamer4);
        storage.addGamer(gamer5);

        storage.showAllGamers();

        storage.showMAxRateGamer();

    }
}
