package helpers;

import com.github.javafaker.Faker;

public class FakeUsersData {
    static Faker faker = new Faker();
    static String FIRST_NAME = faker.name().firstName();
    static String LAST_NAME = faker.name().lastName();
    static String EMAIL = faker.internet().emailAddress();
    static String MOBILE = faker.phoneNumber().subscriberNumber(10);
    static String SUBJECTS = faker.dragonBall().character();
    static String CURRENT_ADDRESS = faker.address().fullAddress();

    public static String getFirstName() {
        return FIRST_NAME;
    }

    public static String getLastName() {
        return LAST_NAME;
    }

    public static String getEmail() {
        return EMAIL;
    }

    public static String getMobile() {
        return MOBILE;
    }

    public static String getSubjects() {
        return SUBJECTS;
    }

    public static String getCurrentAddress() {
        return CURRENT_ADDRESS;
    }
}
