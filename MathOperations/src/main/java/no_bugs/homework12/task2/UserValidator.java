package no_bugs.homework12.task2;

public class UserValidator {
    boolean validationEnabled;

    public void enableValidation() {
        this.validationEnabled = true;
    }

    public void disableValidation() {
        this.validationEnabled = false;
    }

    public boolean checkUserValidation(User user) throws InvalidUserException {

        if (validationEnabled) {

            boolean isNameValid = this.checkNameValidation(user);
            boolean isAgeValid = this.checkAgeValidation(user);
            boolean isEmailValid = this.checkEmailValidation(user);

            if (isNameValid && isAgeValid && isEmailValid) {
                return true;
            } else {
                if (!isNameValid) {
                    System.err.println("Name is less then 2 symbols");
                }

                if (!isAgeValid) {
                    System.err.println("Age is less then 18 or more then 100");
                }

                if (!isEmailValid) {
                    System.err.println("Email is not valid");
                }
                throw new InvalidUserException("User is not valid");
            }
        } else {
            System.out.println("You should enable validation");
            return false;
        }
    }

    private boolean checkNameValidation(User user) {
        return !user.getName().isBlank() && user.getName().charAt(0) == user.getName().toUpperCase().charAt(0);
    }

    private boolean checkAgeValidation(User user) {
        return user.getAge() >= 18 && user.getAge() <= 100;
    }

    private boolean checkEmailValidation(User user) {
        return user.getEmail().matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }
}
