package test.voweltest;

public class VowelClass {
    public static void main(String[] args) {
        System.out.println(new VowelClass().countVowels("sdsds"));
    }

    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
