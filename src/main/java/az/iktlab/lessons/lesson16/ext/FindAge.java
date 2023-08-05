package az.iktlab.lessons.lesson16.ext;

import java.util.Arrays;
import java.util.Random;

public class FindAge {
    public static void main(String[] args) {

        int[] ages = new int[10_000_000];
        int[] counts  = new int[15];

        Random rnd = new Random();
        for (int i = 0; i < ages.length; i++) {
            ages[i] = rnd.nextInt(15);
        }

        for (int age : ages) {
            counts[age]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " --> " + counts[i]);
        }

        System.out.println(Arrays.toString(counts));
    }
}
