package helpers;

import com.github.javafaker.Faker;

public class FakeUsersData {
    static Faker faker = new Faker();
    static String FIRST_NAME = faker.name().firstName();
    static String LAST_NAME = faker.name().lastName();
    static String EMAIL = faker.internet().emailAddress();
    static String MOBILE = faker.phoneNumber().subscriberNumber(10);
    static String SUBJECTS = "History";
    static String CURRENT_ADDRESS = faker.address().fullAddress();
    static String STATE = "Uttar Pradesh";
    static String CITY = "Lucknow";
    static String FEMALE = "Female";
    static String HOBBY = "Female";



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

    public static String getSTATE() { return  STATE; }

    public static String getCITY() { return  CITY; }

    public static String getFemale() { return  FEMALE; }

    public static String getHOBBY() { return  HOBBY; }
}
