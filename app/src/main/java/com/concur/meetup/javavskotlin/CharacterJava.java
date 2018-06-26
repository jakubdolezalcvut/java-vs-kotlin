package com.concur.meetup.javavskotlin;

import android.util.Log;

import java.util.Objects;

public class CharacterJava {

    private String firstName;
    private String lastName;
    private int birthYear;

    public CharacterJava() { }

    public CharacterJava(final String firstName, final String lastName, final int birthYear) {
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
        final StringBuilder sb = new StringBuilder("CharacterJava{");
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
        final CharacterJava characterJava = (CharacterJava) o;

        return birthYear == characterJava.birthYear &&
                Objects.equals(firstName, characterJava.firstName) &&
                Objects.equals(lastName, characterJava.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthYear);
    }

    public static class Example {

        private static final String TAG = "CharacterJava";

        // This code is actually supposed to be called from another class.
        public static void createPersons() {
            CharacterJava bilbo = new CharacterJava("Bilbo", "Baggins", 2890);

            int born = bilbo.getBirthYear();
            String businessCard = bilbo.getFirstName() + " " + bilbo.getLastName() + ", born " + bilbo.getBirthYear();
            //String businessCard = String.format(Locale.US, "%s %s, born %d", bilbo.getFirstName(), bilbo.getLastName(), bilbo.getBirthYear());
            Log.i(TAG, "born: " + born);
            Log.i(TAG, "businessCard: " + businessCard);

            CharacterJava sauron = new CharacterJava(null, "Sauron", 0);
            sauron.setLastName("Melkor");

            int hashCode = sauron.hashCode();
            Log.i(TAG, "Hashcode: " + hashCode);
            Log.i(TAG, "toString: " + sauron);

            CharacterJava melkor = new CharacterJava(null, "Melkor", 0);
            boolean naiveEqual = sauron == melkor;
            boolean realEqual = sauron.equals(melkor);
            Log.i(TAG, "sauron and melkor are equal: naively '" + naiveEqual + "' really '" + realEqual + "'");
        }

        private Example() { }
    }
}
