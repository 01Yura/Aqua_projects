package no_bugs.practice_5.exceptions.task3;

// This is checked exception

public class IncompatibleAgeException extends Exception {
    public IncompatibleAgeException(String message) {
        super(message);
    }
}
