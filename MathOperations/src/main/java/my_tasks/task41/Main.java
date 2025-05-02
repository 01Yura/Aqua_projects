package my_tasks.task41;

public class Main {
    public static void main(String[] args) {
        Bank sberBank = new Bank();
        sberBank.openAccount("Yuri", 100);
        sberBank.printInfoAccount("Yuri");
        System.out.println();

        sberBank.deposit("Yuri", 50);
        sberBank.printInfoAccount("Yuri");
        System.out.println();

        sberBank.withdraw("Yuri", 200);
        sberBank.withdraw("Yuri", 30);
        sberBank.printInfoAccount("Yuri");

    }
}
