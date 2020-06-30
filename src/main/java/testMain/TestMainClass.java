package testMain;

import model.MappedPerson;
import model.Person;
import model.UsableStringsEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMainClass {

    //Constantes en mayúscula
    private static String HELLO_WORLD = "Hola Wendy";
    private static int ACTUAL_YEAR = 2020;

    private String makeGreetingMessage() {
        return HELLO_WORLD + " en el famoso: " + ACTUAL_YEAR;
    }

    private List<Person> createPeopleList(int numberOfPeople) {
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            people.add(new Person("person" + i, "lastName" + i, 17 + i,
                    UsableStringsEnum.ACTIVE));
        }
        return people;
    }


    public static void main(String[] args) {

        System.out.println("Este es el año static: " + TestMainClass.ACTUAL_YEAR);
        System.out.println("Este es el saludo static: " + TestMainClass.HELLO_WORLD);

        TestMainClass mainClass = new TestMainClass();
        List<Person> people = mainClass.createPeopleList(20);

        people = people.stream().filter(person -> person.getAge() > 20).collect(Collectors.toList());

        List<MappedPerson> mappedPeople = people.stream().map(person ->
                new MappedPerson(person.getFirstName() + " " + person.getLastName(), person.getAge())).collect(Collectors.toList());

        System.out.println(mappedPeople.size());


    }


}
