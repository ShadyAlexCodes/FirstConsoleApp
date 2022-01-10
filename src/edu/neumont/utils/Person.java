package edu.neumont.utils;

public class Person {

    private String prefix;
    private String firstName;
    private String lastName;
    private String suffix;
    private int age;

    public Person() {

    }

    public Person(String prefix, String firstName, String lastName, String suffix, int age) {
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.age = age;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompleteName() {
        return prefix + " " + firstName + " " + lastName + " " + suffix;
    }

    @Override
    public String toString() {
        return "Hello " + prefix + " " + firstName + " " + lastName + " " + suffix + " you are " + age;
    }
}
