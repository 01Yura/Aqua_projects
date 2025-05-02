package homework10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CommonClassTest extends CommonClassSetup {

    static Stream<Arguments> ArgsFor_UserCanCountNumberOfVowelLettersInTheString() {
        return Stream.of(Arguments.of("hello", 2), Arguments.of("aeoi", 4), Arguments.of("MORNING", 2), Arguments.of("AEIOU", 5), Arguments.of("sdfghj", 0), Arguments.of("LKJH", 0), Arguments.of(" ", 0), Arguments.of("", 0));
    }

    static Stream<Arguments> ArgsFor_UserCanReverseValidString() {
        return Stream.of(Arguments.of("qwerty", "ytrewq"), Arguments.of("qwe", "ewq"), Arguments.of("q", "q"), Arguments.of(" ", " "), Arguments.of("    ", "    "), Arguments.of("", ""));
    }

    static Stream<Arguments> ArgsFor_UserCanFindMaxNumberInValidArray() {
        return Stream.of(Arguments.of(new int[]{1, 3, 5, 9, 6, 2}, 9), Arguments.of(new int[]{-1, 3, -5, -9, 6, 2}, 6), Arguments.of(new int[]{-1, -3, -5, -9, -6, -2}, -1), Arguments.of(new int[]{11}, 11));
    }

    static Stream<Arguments> ArgsFor_UserCanFindTheSecondMaxElementInValidArray() {
        return Stream.of(Arguments.of(new int[]{1, 5, 7, 2, 6, 4}, 6), Arguments.of(new int[]{1, 6, 5, 7}, 6), Arguments.of(new int[]{1, 6, 5, 7, 2, 6, 7}, 6));
    }

    static Stream<Arguments> ArgsFor_UserShouldGetAnExceptionIfArrayIsInvalid() {
        return Stream.of(Arguments.of(new int[]{5}), Arguments.of(new int[]{}));
    }

    static Stream<Arguments> ArgsFor_UserCanCountNumberOfWordsForValidString() {
        return Stream.of(Arguments.of("Hello world", 2), Arguments.of("Helloworld", 1), Arguments.of("Hello world my friend", 4), Arguments.of("   Hello world my friend  ", 4), Arguments.of(" ", 0), Arguments.of("      ", 0), Arguments.of("", 0));
    }

    @ParameterizedTest
    @ValueSource(ints = {10, -10, 0})
    void UserCanCheckIfEvenNumberReturnsTrue(int number) {
        boolean actual = commonClass.isEven(number);
        assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {11, -11})
    void UserCanCheckIfOddNumberReturnsFalse(int number) {
        boolean actual = commonClass.isEven(number);
        assertFalse(actual);
    }

    @ParameterizedTest
    @MethodSource("ArgsFor_UserCanCountNumberOfVowelLettersInTheString")
    void UserCanCountNumberOfVowelLettersInTheString(String string, int expected) {
        assertEquals(expected, commonClass.countVowels(string));
    }

    @Test
    void UserCanCheckThatNullReturnsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            commonClass.countVowels(null);
        }, "Method should return IllegalArgumentException");
    }

    @ParameterizedTest
    @MethodSource("ArgsFor_UserCanReverseValidString")
    void UserCanReverseValidString(String string, String expected) {
        assertEquals(expected, commonClass.reverse(string));
    }

    @Test
    void UserCanNotReverseInvalidString() {
        String string = null;
        String expected = null;
        String actual = commonClass.reverse(string);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("ArgsFor_UserCanFindMaxNumberInValidArray")
    void UserCanFindMaxNumberInValidArray(int[] array, int expected) {
        assertEquals(expected, commonClass.findMax(array));
    }

    @Test
    void MethodThrowsExceptionIfArrayIsEmpty() {
        int[] array = {};

        assertThrows(NoSuchElementException.class, () -> {
            commonClass.findMax(array);
        }, "Method should throw NoSuchElementException");
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    void UserCanCheckIfTheYearIsLeap(int year) {
        assertTrue(commonClass.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100})
    void UserCanCheckIfTheYearIsNotLeap(int year) {
        assertFalse(commonClass.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com", "test.test@example.com", "test@example.co"})
    void UserCanCheckIfEmailIsValid(String email) {
        assertTrue(commonClass.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@.com", "test@.com", "test@example.c", " ", ""})
    void UserCanCheckIfEmailIsNotValid(String email) {
        assertFalse(commonClass.isValidEmail(email));
    }

    @ParameterizedTest
    @CsvSource({"1,1", "3,6", "5,120", "0,1"})
    void UserCanFindFactorialForValidNumber(int number, int expected) {
        int actual = commonClass.factorial(number);
        assertEquals(expected, actual);
    }

    @Test
    void UserShouldGetExceptionForInvalidNumber() {
        int number = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            commonClass.factorial(number);
        }, "Method should throw IllegalArgumentException");
    }

    @ParameterizedTest
    @MethodSource("ArgsFor_UserCanFindTheSecondMaxElementInValidArray")
    void UserCanFindTheSecondMaxElementInValidArray(int[] array, int expected) {
        assertEquals(expected, commonClass.findSecondMax(array));
    }
    /*Тесты должны проверять:
    Пустую строку
    null
    Строку с несколькими пробелами
    Positive:
    "Hello world", 2
    "Helloworld", 1
    "Hello world my friend", 4
    "   Hello world my friend  ", 4
    Edge:
    " ", 0
    "      ", 0
    "", 0
    Negative:
    null, ????
     */

    @ParameterizedTest
    @MethodSource("ArgsFor_UserShouldGetAnExceptionIfArrayIsInvalid")
    void UserShouldGetAnExceptionIfArrayIsInvalid(int[] array) {
        assertThrows(IllegalArgumentException.class, () -> {
            commonClass.findSecondMax(array);
        }, "Method should return IllegalArgumentException");

    }

    @ParameterizedTest
    @MethodSource("ArgsFor_UserCanCountNumberOfWordsForValidString")
    void UserCanCountNumberOfWordsForValidString(String string, int expected) {
        assertEquals(expected, commonClass.countWords(string));
    }

    @Test
    void UserShouldGetNullPointerExceptionForNullValue() {
        assertThrows(NullPointerException.class, () -> {
            commonClass.countWords(null);
        }, "Method should return NullPointerException");
    }


/*    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");}

  Positive:
  "+1 1234567890", true
  "+123 1234567890", true
  Negative:
  "123 1234567890", false
  "+ 1234567890", false
  "+1231234567890", false
  "+1234 1234567890", false
  "+123 12345678909", false

*/


    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890", "+123 1234567890"})
    void UserCanCheckIfMethodReturnsTrueIfNumberIsValid(String phoneNumber) {
        assertTrue(commonClass.isValidPhoneNumber(phoneNumber));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123 1234567890", "+ 1234567890", "+1231234567890", "+1234 1234567890", "+123 12345678909"})
    void UserCanCheckIfMethodReturnsFalseIfNumberIsInvalid(String phoneNumber) {
        assertFalse(commonClass.isValidPhoneNumber(phoneNumber));
    }


}