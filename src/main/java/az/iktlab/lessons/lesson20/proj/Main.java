package az.iktlab.lessons.lesson20.proj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String jsonFilePath = "C:\\Java-Projects\\ira1\\docs\\people.json";
        List<Person> peopleList;

        try {
            try (var reader = new BufferedReader(new FileReader(jsonFilePath))) {

                String jsonString = reader.lines().collect(Collectors.joining());
                jsonString = jsonString.substring(1, jsonString.length() - 1);

                String[] personStrings;
                personStrings = jsonString.split("\\},\\s*\\{");

                peopleList = Arrays.stream(personStrings).map(personString -> Person.fromJsonString("{" + personString + "}")).collect(Collectors.toList());
                peopleList.forEach(System.out::println);
            }
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
