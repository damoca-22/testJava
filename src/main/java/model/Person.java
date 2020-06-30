package model;

public class Person {
    private String namePerson;
    private int agePerson;

    public Person(String namePerson, int agePerson) {
        this.namePerson = namePerson;
        this.agePerson = agePerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getAgePerson() {
        return agePerson;
    }

    public void setAgePerson(int agePerson) {
        this.agePerson = agePerson;
    }
}
