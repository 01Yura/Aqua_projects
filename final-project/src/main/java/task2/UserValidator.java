package task2;

public class UserValidator {
    boolean isValidationEnabled;

    public boolean isValidationEnabled() {
        return isValidationEnabled;
    }

    public void enableValidation() {
        this.isValidationEnabled = true;
    }

    public void disableValidation() {
        this.isValidationEnabled = false;
    }

    public boolean checkNameValidation(User user) throws InvalidUserException {
        if (this.isValidationEnabled) {
            if (!user.getName().isBlank() && user.getName().charAt(0) == user.getName().toUpperCase().charAt(0)) {
                return true;
            } else {
                throw new InvalidUserException("Name is not valid");
            }
        } else {
            System.out.println("You should enable the validation");
            return false;
        }
    }

    public boolean checkAgeValidation(User user) throws InvalidUserException {
        if (this.isValidationEnabled) {
            if (user.getAge() >= 18 && user.getAge() <= 100) {
                return true;
            } else {
                throw new InvalidUserException("Age is not valid");
            }
        } else {
            System.out.println("You should enable the validation");
            return false;
        }
    }

    public boolean checkEmailValidation(User user) throws InvalidUserException {
        if (this.isValidationEnabled) {
            if (user.getEmail().matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,3}$")) {
                return true;
            } else {
                throw new InvalidUserException("Email is not valid");
            }
        } else {
            System.out.println("You should enable the validation");
            return false;
        }
    }


}

