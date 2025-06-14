package no_bugs.homework12.task2;

public class Main {
    public static void main(String[] args) throws InvalidUserException {
        UserValidator userValidator = new UserValidator();
        User validUser = new User("Yura", 25, "example@google.com");
        User inValidUser1 = new User("M", 30, "example2@google.com");
        User inValidUser2 = new User("Kolya", 6, "e@ample2@google.com");
        User inValidUser3 = new User("Vasya", 40, "example3google.com");

        userValidator.enableValidation();
        
        System.out.println(userValidator.checkUserValidation(validUser));
        System.out.println();
        System.out.println(userValidator.checkUserValidation(inValidUser2));


    }
}
