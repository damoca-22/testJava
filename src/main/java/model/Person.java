package model;

public class Person {

    private String firstName;
    private String lastName;
    private String fullName;
    private int age;
    private UsableStringsEnum accountStatus;

    public Person(String firstName, String lastName, int age, UsableStringsEnum accountStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.age = age;
        this.accountStatus = accountStatus;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UsableStringsEnum getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(UsableStringsEnum accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getFullName() {
        return fullName;
    }
}
