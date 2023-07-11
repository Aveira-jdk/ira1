package az.iktlab.mine;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pet species:");
        String species = scanner.nextLine();

        System.out.println("Enter pet nickname:");
        String nickname = scanner.nextLine();

        System.out.println("Enter pet age:");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter pet trick level (1-100):");
        int trickLevel = Integer.parseInt(scanner.nextLine());

        String[] habits = new String[3];
        System.out.println("Enter 3 pet habits:");
        for (int i = 0; i < 3; i++) {
            habits[i] = scanner.nextLine();
        }

        Pet cat = new Pet(species, nickname, age, trickLevel, habits);

        System.out.println("Enter mother's name:");
        String motherName = scanner.nextLine();

        System.out.println("Enter mother's surname:");
        String motherSurname = scanner.nextLine();

        System.out.println("Enter mother's year of birth:");
        int motherYear = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter mother's IQ (1-100):");
        int motherIQ = Integer.parseInt(scanner.nextLine());

        Human mother = new Human(motherName, motherSurname, motherYear, motherIQ);

        System.out.println("Enter father's name:");
        String fatherName = scanner.nextLine();

        System.out.println("Enter father's surname:");
        String fatherSurname = scanner.nextLine();

        System.out.println("Enter father's year of birth:");
        int fatherYear = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter father's IQ (1-100):");
        int fatherIQ = Integer.parseInt(scanner.nextLine());

        Human father = new Human(fatherName, fatherSurname, fatherYear, fatherIQ);

        System.out.println("Enter child's name:");
        String childName = scanner.nextLine();

        System.out.println("Enter child's surname:");
        String childSurname = scanner.nextLine();

        System.out.println("Enter child's year of birth:");
        int childYear = Integer.parseInt(scanner.nextLine());

        Human child = new Human(childName, childSurname, childYear, father, mother, cat);

        cat.eat();
        cat.respond();
        cat.foul();

        child.greetPet();
        child.describePet();

        System.out.println(cat);
        System.out.println(child);
    }
}

class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
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

    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel +
                ", habits=" + String.join(", ", habits) + "}";
    }
}

class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human father;
    private Human mother;

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human(String name, String surname, int year, Human father, Human mother, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
        this.pet = pet;
    }

    public void greetPet() {
        System.out.printf("Hello, %s\n", pet.getNickname());
    }

    public void describePet() {
        String slyness = (pet.getTrickLevel() >= 50) ? "very sly" : "almost not sly";
        System.out.printf("I have a %s, he is %s years old, he is %s\n", pet.getSpecies(), pet.getAge(), slyness);
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year +
                ", iq=" + iq + ", mother=" + mother.getName() + " " + mother.getSurname() +
                ", father=" + father.getName() + " " + father.getSurname() + ", pet=" + pet + "}";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }
}
