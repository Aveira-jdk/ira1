package az.iktlab.mine.lesson9.anotherpackage;

import az.iktlab.mine.lesson9.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("NAME");
//        person.name = "Name";

        System.out.println(Person.ID);

        System.out.println(person);

//        person.name="another name";
        System.out.println(person);

//        person.surname = "";
//        person.age =9;
//        person.iq = 9;
    }
}
