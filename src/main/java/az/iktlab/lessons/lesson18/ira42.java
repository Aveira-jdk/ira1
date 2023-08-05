package az.iktlab.lessons.lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ira42 {
    public static void main(String[] args) {
        List <String> wordList0 = new ArrayList<>(Arrays.asList("Red", "Green", "Orange", "White","White", "Black"));
        List <String> wordList1 = new ArrayList<>(Arrays.asList("Pink", "Purple", "Blue", "Gray", "Red", "Red"));

        System.out.println("First arrayList with duplicates: " + wordList0);
        System.out.println("Second arrayList with duplicates: " + wordList1);

        System.out.println(" ");

        List<String> removeDupl = wordList1.stream().distinct().collect(Collectors.toList());
        System.out.println("First arrayList without duplicates: " + removeDupl);

        List<String> noDupl = wordList0.stream().distinct().collect(Collectors.toList());
        System.out.println("Second arrayList without duplicates: " + noDupl);

        System.out.println(" ");

        List<String> joined = Stream.concat(wordList0.stream().distinct(), wordList1.stream().distinct()).collect(Collectors.toList());
        System.out.println(joined);

/*
        ArrayList<String> wordListMerge = new ArrayList<String>();
        wordListMerge.addAll(wordList0);
        wordListMerge.addAll(wordList1);

        System.out.println(wordListMerge);
*/

    }
}


// remove repeated elements in array using stream.