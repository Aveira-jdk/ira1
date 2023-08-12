package az.iktlab.lessons.lesson20.proj;

public class Person {

    private String name;
    private String surname;
    private int age;
    private String gender;
    private String birthDate;

    public Person(String name, String surname, int age, String gender, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public static Person fromJsonString(String jsonString) {
        jsonString = jsonString.substring(1, jsonString.length() - 1);
        String[] parts = jsonString.split(",\\s*");

        String name = parts[0].split(":")[1].replace("\"", "");
        String surname = parts[1].split(":")[1].replace("\"", "");
        int age = Integer.parseInt(parts[2].split(":")[1].trim());
        String gender = parts[3].split(":")[1].replace("\"", "");
        String birthDate = parts[4].split(":")[1].replace("\"", "");

        return new Person(name, surname, age, gender, birthDate);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

}
