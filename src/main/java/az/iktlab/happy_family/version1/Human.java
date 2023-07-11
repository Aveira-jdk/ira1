package az.iktlab.happy_family.version1;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human father;
    public Human mother;
    private String[][] schedule;

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
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
        StringBuilder scheduleStr = new StringBuilder();
        if (schedule != null && schedule.length > 0) {
            for (String[] day : schedule) {
                scheduleStr.append(day[0]).append(": ").append(day[1]).append(", ");
            }
            if (scheduleStr.length() > 0) {
                scheduleStr.setLength(scheduleStr.length() - 2); // Remove the trailing comma and space
            }
        }

        String petStr = (pet != null) ? ", pet=" + pet : "";
        String fatherStr = (father != null) ? ", father=" + father.name + " " + father.surname : "";
        String motherStr = (mother != null) ? ", mother=" + mother.name + " " + mother.surname : "";

        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                petStr +
                fatherStr +
                motherStr +
                (scheduleStr.length() > 0 ? ", schedule=[" + scheduleStr.toString() + "]" : "") +
                '}';
    }
}
