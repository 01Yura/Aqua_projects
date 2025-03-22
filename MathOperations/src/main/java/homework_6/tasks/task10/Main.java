package homework_6.tasks.task10;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.print();
        System.out.println();

        Contact yura = new Contact("Yura", "222222222222");
        Contact vasya = new Contact("Vasya", "333333333333");
        Contact kolya = new Contact("Kolya", "111111111111");

        phoneBook.addContact(yura);
        phoneBook.addContact(vasya);
        phoneBook.addContact(kolya);
        phoneBook.print();
        System.out.println();
        
        phoneBook.findContactbyName("Kolya");


    }
}
