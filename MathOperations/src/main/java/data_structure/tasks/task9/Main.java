package data_structure.tasks.task9;

//9. История действий пользователя
//Необходимо хранить список последних действий пользователя, чтобы можно было отменить или повторить действия.

public class Main {
    public static void main(String[] args) {
//        Create storages
        Storage storage = new Storage();
//        Type the text
        storage.doAction("Hi, ");
        storage.doAction("my ");
        storage.doAction("name ");
        storage.doAction("issss ");
        storage.doAction("Yuraaaaaaaa.");
//        Show the text
        storage.showStorage();
        System.out.println();
//        Undo 3 last actions
        storage.ctrlZ();
        storage.ctrlZ();
        storage.ctrlZ();
//        Show the text
        storage.showStorage();
        System.out.println();
//        Redo last action
        storage.ctrlY();
//        Show the text
        storage.showStorage();
        System.out.println();
//        Type correct text
        storage.doAction("is ");
        storage.doAction("Yura.");
//        Show the text
        storage.showStorage();


    }
}
