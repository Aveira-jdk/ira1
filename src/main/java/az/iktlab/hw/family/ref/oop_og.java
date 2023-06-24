package az.iktlab.hw.family.ref;
import java.util.Arrays;

public class oop_og {
    public static void main(String[] args) {
        oop_mini pet = new oop_mini();

        pet.name = "Samsung";
        pet.species = "Dog";
        pet.age = 6;
        pet.tricklevel = 80;
        pet.habits = new String[]{"friendly", "begging", "barking"};

        pet.run();

        System.out.printf("Pet: name: %s , species: %s , age: %s, tricklevel: %s, habits: %s\n", pet.name, pet.species, pet.age, pet.tricklevel, Arrays.toString(pet.habits));

    }
}
