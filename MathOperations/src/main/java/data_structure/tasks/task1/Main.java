package data_structure.tasks.task1;

//1. Хранение уникальных идентификаторов пользователей
//В системе есть список уникальных идентификаторов пользователей. Необходимо быстро проверять, присутствует ли пользователь с заданным идентификатором.


public class Main {
    public static void main(String[] args) {
//        Create storage
        Storage storage1 = new Storage();
//        Create 3 users
        User user1 = new User(12, "Petya");
        User user2 = new User(34, "Max");
        User user3 = new User(7, "Yura");
        User user4 = new User(7, "Sveta");
//        Show storage
        storage1.showIdStorage();
        System.out.println();
//        Add new UserId
        storage1.addUserId(user1);
        storage1.addUserId(user2);
        storage1.addUserId(user3);
        System.out.println();
//        Show storage
        storage1.showIdStorage();
        System.out.println();
//        Check id
        storage1.checkUserId(34);
        storage1.checkUserId(15);
        System.out.println();
//        Try to add user with existing id
        storage1.addUserId(user4);
//        Show storage
        storage1.showIdStorage();

    }
}

