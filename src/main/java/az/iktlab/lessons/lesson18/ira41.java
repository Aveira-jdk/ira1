package az.iktlab.lessons.lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ira41 {
    public static void main(String[] args) {
        List <String> wordList = new ArrayList<>(Arrays.asList("Red", "Green", "Orange", "White", "Black"));

//        System.out.println(wordList.stream().filter(t -> t.startsWith("Red")).collect(Collectors.toList()));
        System.out.println(wordList.stream().equals("Red") );
    }
}
