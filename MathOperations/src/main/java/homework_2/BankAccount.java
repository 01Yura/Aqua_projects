package homework_2;

public class BankAccount {
//    4. Реализуйте класс BankAccount
//    Поля:
//    String owner (владелец счёта),
//    double balance (баланс).
//    Реализуйте:
//    Конструктор, принимающий owner и balance.
//    Геттеры для получения данных.
//    Сеттер для изменения владельца.
//    Метод deposit(double amount) — увеличивает баланс на amount.
//    Метод withdraw(double amount) — уменьшает баланс на amount.
//    Метод printBalance() для вывода текущего баланса.
//    В методе main создайте банковский счёт, внесите депозит, снимите деньги и выведите текущий баланс.

    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public static void main(String[] args) {

        BankAccount myBankAccount = new BankAccount("Yura", 1000);

        myBankAccount.deposit(500);
        myBankAccount.withdraw(150);
        myBankAccount.printBalance();

    }

    String getOwner() {
        return this.owner;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    double getBalance() {
        return this.balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    void printBalance() {
        System.out.println(this.balance);
    }


}
