package data_structure.tasks.task6;
//
//6. Управление друзьями пользователя
//Требуется хранить связи между пользователями в социальной сети, где каждый пользователь может быть связан с несколькими другими.


public class Main {
    public static void main(String[] args) {
//        Create users
        User user1 = new User("Max");
        User user2 = new User("Boris");
        User user3 = new User("Lulu");
        User user4 = new User("Fedia");
        User user5 = new User("Tania");
        User user6 = new User("Yura");
        User user7 = new User("Erik");
        User user8 = new User("Sveta");
        User user9 = new User("Matvey");
        User user10 = new User("Kolya");
//        Create storage
        Storage storage = new Storage();
//        Show storage
        storage.showStorage();
        System.out.println();
//        Add friends
        storage.addFriend(user1, user2);
        storage.addFriend(user1, user3);
        storage.addFriend(user1, user4);
        storage.addFriend(user7, user2);
        storage.addFriend(user7, user2);
        storage.showStorage();
        System.out.println();
//        Remove friends
        storage.removeFriend(user1, user2);
        storage.removeFriend(user1, user3);
        storage.removeFriend(user2, user7);
        storage.showStorage();
        System.out.println();
    }
}
