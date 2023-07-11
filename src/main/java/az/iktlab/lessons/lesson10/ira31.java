package az.iktlab.lessons.lesson10;

import java.util.Arrays;

public class ira31 {
    public static void main(String[] args) {
        String[] habits = {"eat", "drink", "sleep"};
        Pet cat = new Pet("Cat", "Samsung", 5, 75, habits);

        Human mother = new Human("Mai", "Sakurajima", 2002,130);
        Human father = new Human("Sakuta", "Azusagawa", 2000,110);
        Human child = new Human("Shoko", "Makinohara", 2010, father, mother, cat,100);

        cat.eat();
        cat.respond();
        cat.foul();

        child.greetPet();
//        child.greetPet();
        child.describePet();

        System.out.println(cat);
        System.out.println(child);
    }
}

class Pet {
    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits;

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) + "}";
    }
}

class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human father;
    public Human mother;
    public String[][] schedule;

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human(String name, String surname, int year, Human father, Human mother, Pet pet, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
        this.pet = pet;
        this.iq = iq;
    }

    public void greetPet() {
        System.out.printf("Hello, %s\n", pet.nickname);
    }

    public void describePet() {
        String slyness = (pet.trickLevel >= 50) ? "very sly" : "almost not sly";
        System.out.printf("I have a %s, he is %s years old, he is %s\n", pet.species, pet.age, slyness);
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year +
                ", iq=" + iq + ", mother=" + mother.name + " " + mother.surname +
                ", father=" + father.name + " " + father.surname + ", pet=" + pet + "}";
    }
}
