package az.iktlab.happy_family.version1;

public class Main {
    public static void main(String[] args) {
        String[] habits = {"eat", "drink", "sleep"};
        Pet cat = new Pet("Cat", "Samsung", 5, 75, habits);

        String[][] schedule = {
                {"Monday", "VideoGames"},
                {"Tuesday", "Gym"},
                {"Wednesday", "WaterPolo"},
        };

        Human mother = new Human("Mai", "Sakurajima", 2002, 130, schedule);
        Human father = new Human("Sakuta", "Azusagawa", 2000, 110, schedule);
        Human child = new Human("Shoko", "Makinohara", 2010, father, mother, cat, 100);

        cat.eat();
        cat.respond();
        cat.foul();

        child.greetPet();
        child.describePet();

        System.out.println(cat);
        System.out.println(child);
        System.out.println(mother);
        System.out.println(father);
    }
}
