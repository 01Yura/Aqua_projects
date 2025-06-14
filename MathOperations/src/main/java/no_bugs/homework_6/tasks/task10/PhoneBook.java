package no_bugs.homework_6.tasks.task10;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addContact(Contact contact) {
        this.phoneBook.put(contact.getName(), contact.getPhoneNumber());
    }

    public void findContactbyName(String name) {
        System.out.println(this.phoneBook.get(name));
    }

    public void print() {
        this.phoneBook.entrySet().forEach(entry -> System.out.println("Contact name: " + entry.getKey() + ", phone number: " + entry.getValue()));
    }


}
