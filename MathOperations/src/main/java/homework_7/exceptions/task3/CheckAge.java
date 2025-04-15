package homework_7.exceptions.task3;

public class CheckAge {
    public static void main(String[] args) {

        try {
            checkAge(200);
        } catch (IncompatibleAgeException e) {
            System.err.println(e.getMessage());
        }

    }

    public static boolean checkAge(int age) throws IncompatibleAgeException {
        if (age < 0 || age > 150) {
            throw new IncompatibleAgeException("Entered age is not valid");
        } else {
            System.out.println("Age is eligible");
            return true;
        }
    }


}
