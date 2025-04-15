package homework_7.exceptions.task4;

public class EmailChecker {

    public static boolean isEmailValid(String email) {
        String pattern = "[\\w-.]+@[\\w-.]+\\.[a-zA-Z]{2,3}";
        if (email.matches(pattern)) {
            System.out.println("Email is valid");
            return true;
        } else {
            throw new InvalidEmailException("Email is not valid!");
        }
    }


    public static void main(String[] args) {

        String email = "some@gmail.com";
        isEmailValid(email);
    }
}
