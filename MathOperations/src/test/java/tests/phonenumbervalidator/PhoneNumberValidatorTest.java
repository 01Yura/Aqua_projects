package tests.phonenumbervalidator;

/*
 * Positive:
 * +1 1234567890, true
 * +123 1234567890, true
 * Negative:
 * "+1 1234567", false
 * "+1 12345678909", false
 * "+1234 1234567890", false
 * "1 1234567890", false
 * "1234 1234567890", false
 * "+q qwertyuiop", false
 * "qwerty", false
 * " ", false
 * "", false
 *
 *
 * */

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PhoneNumberValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "+1 1234567890",
            "+123 1234567890"
    })
    void isValidPhoneNumberReturnsTrueWhenPhoneNumberIsValid(String phoneNumber) {
        assertTrue(new PhoneNumberValidator().isValidPhoneNumber(phoneNumber));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "+1 1234567",
            "+1 12345678909",
            "+1234 1234567890",
            "+q qwertyuiop",
            "qwerty",
            " ",
            ""
    })
    void isValidPhoneNumberReturnsFalseWhenPhoneNumberIsInvalid(String phoneNumber) {
        assertFalse(new PhoneNumberValidator().isValidPhoneNumber(phoneNumber));
    }
}