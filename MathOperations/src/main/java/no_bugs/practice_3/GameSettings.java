package no_bugs.practice_3;

//
//Задача 5: Класс GameSettings
//Поля:
//static int maxPlayers — максимальное количество игроков (общее для всех игр).
//final String gameName — название игры.
//int currentPlayers — текущее количество игроков.
//
//        Реализуйте:
//Конструктор для инициализации gameName и начального количества игроков.
//Статический метод setMaxPlayers(int newMax) для изменения максимального количества игроков.
//Метод addPlayer(), который увеличивает текущее количество игроков на 1, если не превышен maxPlayers.
//Метод printGameStatus(), который выводит название игры, текущее количество игроков и максимальное количество.
//
//В методе main:
//Создайте 2 игры, установите разные начальные параметры.
//Измените максимальное количество игроков для всех игр.
//Добавьте игроков в каждую игру и выведите её статус.
//
public class GameSettings {

    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Chess", 2);
        GameSettings game2 = new GameSettings("Football", 22);

        game1.printGameStatus();
        game2.printGameStatus();

        GameSettings.maxPlayers = 50;

        game1.addPlayer();
        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();


    }

    void setMaxPlayers(int newMax) {
        GameSettings.maxPlayers = newMax;
    }

    void addPlayer() {
        if (this.currentPlayers < GameSettings.maxPlayers) {
            this.currentPlayers += 1;
        } else {
            System.out.println("The maximum amount of players has been reached");
        }
    }

    void printGameStatus() {
        System.out.println("Game title: " + this.gameName + ", Current number of players: " + this.currentPlayers + ", Maximum number of players: " + GameSettings.maxPlayers);
    }

}
