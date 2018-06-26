package com.concur.meetup.javavskotlin;

import android.util.Log;
import java.util.Locale;
import java.util.Objects;

public class UserJava {

    private String firstName;
    private String lastName;
    private int birthYear;

    public UserJava(final String firstName, final String lastName, final int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(final int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserJava{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", birthYear=").append(birthYear);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final UserJava userJava = (UserJava) o;

        return birthYear == userJava.birthYear &&
                Objects.equals(firstName, userJava.firstName) &&
                Objects.equals(lastName, userJava.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthYear);
    }

    public static class Example {

        private static final String TAG = "UserJava";

        // This code is actually supposed to be called from another class.
        public static void createUsers() {
            UserJava user1 = new UserJava("Bilbo", "Baggins", 2890);

            int born = user1.getBirthYear();
            String businessCard = user1.getFirstName() + " " + user1.getLastName() + ", born " + user1.getBirthYear();
            //String businessCard = String.format(Locale.US, "%s %s, born %d", user1.getFirstName(), user1.getLastName(), user1.getBirthYear());
            Log.i(TAG, "born: " + born);
            Log.i(TAG, "businessCard: " + businessCard);

            UserJava user2 = new UserJava(null, "Sauron", 0);
            user2.setLastName("Melkor");

            int hashCode = user2.hashCode();
            Log.i(TAG, "Hashcode: " + hashCode);
            Log.i(TAG, "toString: " + user2);

            UserJava user3 = new UserJava(null, "Melkor", 0);
            boolean naiveEqual = user2 == user3;
            boolean realEqual = user2.equals(user3);
            Log.i(TAG, "user2 and user3 are equal: naively '" + naiveEqual + "' really '" + realEqual + "'");
        }

        private Example() { }
    }
}
