package practice5.exceptions.task4;

public class IncorrectEmailException extends RuntimeException {
    public IncorrectEmailException(String message) {
        super(message);
    }
}
