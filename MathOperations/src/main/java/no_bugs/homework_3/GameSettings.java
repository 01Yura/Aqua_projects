package no_bugs.homework_3;

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


public class GameSettings {

    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMax) {
        GameSettings.maxPlayers = newMax;
    }

    public static void main(String[] args) {

        GameSettings myGame1 = new GameSettings("Chess", 2);
        GameSettings myGame2 = new GameSettings("Football", 4);

        GameSettings.maxPlayers = 5;

        myGame1.printGameStatus();
        myGame2.printGameStatus();

        myGame1.addPlayer();
        myGame2.addPlayer();

        myGame1.printGameStatus();
        myGame2.printGameStatus();

        myGame1.addPlayer();
        myGame2.addPlayer();

        myGame1.printGameStatus();
        myGame2.printGameStatus();

    }

    void addPlayer() {
        if (this.currentPlayers < GameSettings.maxPlayers) {
            this.currentPlayers += 1;
        } else {
            System.out.println("The max number of players has been achieved.");
        }
    }

    void printGameStatus() {
        System.out.println(this.gameName);
        System.out.println(this.currentPlayers);
        System.out.println(GameSettings.maxPlayers);
        System.out.println();
    }


}
