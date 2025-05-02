package my_tasks.task41;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static List<Account> list = new ArrayList<>();


    public void openAccount(String ownerName, double balance) {
        list.add(new Account(ownerName, balance));
    }

    public void deposit(String ownerName, int sum) {
//        for (Account account1 : list) {
//            if (account1.getOwnerName().equals(ownerName)) {
//                account1.setBalance(account1.getBalance() + sum);
//            }
//        }

        list.stream().filter(account -> account.getOwnerName().equals(ownerName)).findFirst().ifPresent(account -> account.setBalance(account.getBalance() + sum));
    }

    public void withdraw(String ownerName, int sum) {
        for (Account account1 : list) {
            if (account1.getOwnerName().equals(ownerName)) {
                if (account1.getBalance() >= sum) {
                    account1.setBalance(account1.getBalance() - sum);
                } else {
                    System.out.println("Not enough money");
                }
            }
        }
    }

    public void printInfoAccount(String ownerName) {
        for (Account account1 : list) {
            if (account1.getOwnerName().equals(ownerName)) {
                System.out.println(account1);
            }
        }
    }

}
