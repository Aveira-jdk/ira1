package az.iktlab.lessons.lesson9;

import java.util.Arrays;

public class ira30 {
    public static void main(String[] args) {

        String[] habits = {"hab1", "hab2"};
        Pet cat = new Pet();
        cat.nickname = "Samsung";
        cat.species = "Purrr";
        cat.trickLevel = 90;
        cat.habits = habits;
        cat.age = 12;

        Human human = new Human();
        human.name = "Name of the human";
        human.surname = "Surname of the human";
        human.pet = cat;


        cat.eat();
        cat.respond();
        cat.foul();

        human.greetPet();
        human.greetPet();
        human.describePet();
    }
}

class Pet {
    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits;

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    public void eat(){

        System.out.println("I am eating");
    }

    public void respond(){
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", nickname);
    }

    public void foul(){
        System.out.println("I need to cover it up");
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

    public void greetPet(){
        System.out.printf("Hello, %s\n", pet.nickname);
    }

    public void describePet(){
        if (pet.trickLevel >= 50)
            System.out.printf("I have a %s, he is %s years old, he is very sly\n", pet.species, pet.age);
        else
            System.out.printf("I have a %s, he is %s years old, he is almost not sly\n", pet.species, pet.age);    }

}
