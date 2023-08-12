package az.iktlab.lessons.lesson20.proj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String jsonFilePath = "C:\\Java-Projects\\ira1\\docs\\people.json";
        List<Person> peopleList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(jsonFilePath))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }

            String jsonString = jsonContent.toString();
            jsonString = jsonString.substring(1, jsonString.length() - 1);

            String[] personStrings = jsonString.split("\\},\\s*\\{");

            for (String personString : personStrings) {
                Person person = Person.fromJsonString("{" + personString + "}");
                peopleList.add(person);
            }

            for (Person person : peopleList) {
                System.out.println(person);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
