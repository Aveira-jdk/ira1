package az.iktlab.lessons.lesson10.encapsulation;

import az.iktlab.mine.lesson9.Human;

import java.util.Scanner;

import static az.iktlab.mine.lesson9.Human.*;

public class Main {

    private static int ID = 8;

    public static void main(String[] args) {
//        Scanner
        Person person = new Person("Khayal", 25);

//        System.out.println(Human.ID);
        System.out.println(person.getAge());

        System.out.println(person);

    }
}
