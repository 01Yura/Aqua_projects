package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTest {
    UserValidator userValidator;

    @BeforeEach
    void setUp() {
        userValidator = new UserValidator();
        userValidator.enableValidation();
    }

    // For name
    static Stream<Arguments> argsFor_userCanCheckCorrectUserName() {
        return Stream.of(
                Arguments.of(new User("Yura", 39, "yura@gmail.com")),
                Arguments.of(new User("Y", 39, "yura@gmail.com")),
                Arguments.of(new User("Yura234324234wrerwerwerYYYYUUiiii", 39, "yura@gmail.com"))
        );
    }

    static Stream<Arguments> argsFor_userCanCheckInCorrectUserName() {
        return Stream.of(
                Arguments.of(new User("", 39, "yura@gmail.com")),
                Arguments.of(new User("     ", 39, "yura@gmail.com")),
                Arguments.of(new User("yura", 39, "yura@gmail.com")),
                Arguments.of(new User("    Yura", 39, "yura@gmail.com"))
        );
    }

    // For age
    static Stream<Arguments> argsFor_userCanCheckAgeValidationIfAgeIsCorrect() {
        return Stream.of(
                Arguments.of(new User("Yura", 18, "yura@gmail.com")),
                Arguments.of(new User("Yura", 100, "yura@gmail.com")),
                Arguments.of(new User("Yura", 19, "yura@gmail.com")),
                Arguments.of(new User("Yura", 99, "yura@gmail.com"))
        );
    }

    static Stream<Arguments> argsFor_userCanCheckAgeValidationIfAgeIsNotCorrect() {
        return Stream.of(
                Arguments.of(new User("Yura", 17, "yura@gmail.com")),
                Arguments.of(new User("Yura", 101, "yura@gmail.com")),
                Arguments.of(new User("Yura", 0, "yura@gmail.com"))

        );
    }

    //    For Email
    static Stream<Arguments> argsFor_userCanCheckCorrectEmail() {
        return Stream.of(
                Arguments.of(new User("Yura", 50, "yura.werwer@gmail.com")),
                Arguments.of(new User("Yura", 50, "yura@gmaildffd.com")),
                Arguments.of(new User("Yura", 50, "yura@gmail.co")),
                Arguments.of(new User("Yura", 50, "yura@gmail.com"))
        );
    }

    static Stream<Arguments> argsFor_userCanCheckEmailValidationIfEmailIsNotCorrect() {
        return Stream.of(
                Arguments.of(new User("Yura", 50, "@gmail.com")),
                Arguments.of(new User("Yura", 50, "yuragmail.com")),
                Arguments.of(new User("Yura", 50, "yura@gmail.c")),
                Arguments.of(new User("Yura", 50, "yura@gmail.comm")),
                Arguments.of(new User("Yura", 50, "yura@gmail")),
                Arguments.of(new User("Yura", 50, "yura@")),
                Arguments.of(new User("Yura", 50, "")),
                Arguments.of(new User("Yura", 50, "   @   .  "))
        );
    }

    @ParameterizedTest
    @MethodSource("argsFor_userCanCheckCorrectUserName")
    void userCanCheckCorrectUserName(User user) throws InvalidUserException {
        boolean actual = userValidator.checkNameValidation(user);
        assertTrue(actual);
    }

    @ParameterizedTest
    @MethodSource("argsFor_userCanCheckInCorrectUserName")
    void userCanCheckInCorrectUserName(User user) {
        assertThrows(InvalidUserException.class, () -> {
            userValidator.checkNameValidation(user);
        }, "The method should return InvalidUserException");
    }

    @ParameterizedTest
    @MethodSource("argsFor_userCanCheckAgeValidationIfAgeIsCorrect")
    void userCanCheckAgeValidationIfAgeIsCorrect(User user) throws InvalidUserException {
        boolean actual = userValidator.checkAgeValidation(user);
        assertTrue(actual);
    }

    @ParameterizedTest
    @MethodSource("argsFor_userCanCheckAgeValidationIfAgeIsNotCorrect")
    void userCanCheckAgeValidationIfAgeIsNotCorrect(User user) {
        assertThrows(InvalidUserException.class, () -> {
            userValidator.checkAgeValidation(user);
        }, "The method should return InvalidUserException");
    }

    @ParameterizedTest
    @MethodSource("argsFor_userCanCheckCorrectEmail")
    void userCanCheckCorrectEmail(User user) throws InvalidUserException {
        boolean actual = userValidator.checkEmailValidation(user);
        assertTrue(actual);
    }

    @ParameterizedTest
    @MethodSource("argsFor_userCanCheckEmailValidationIfEmailIsNotCorrect")
    void userCanCheckEmailValidationIfEmailIsNotCorrect(User user) {
        assertThrows(InvalidUserException.class, () -> {
            userValidator.checkEmailValidation(user);
        }, "The method should return InvalidUserException");
    }
}