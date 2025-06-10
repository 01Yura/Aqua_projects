package generators.faker;

import com.github.javafaker.Faker;

public class RandomDataFaker {

    public static void main(String[] args) {
        System.out.println(getFullname());
        System.out.println(getEmail());
    }


    public static String getFullname() {
        Faker faker = new Faker();
        return faker.name().firstName() + " " + faker.name().lastName();
    }


    public static String getEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }
}
