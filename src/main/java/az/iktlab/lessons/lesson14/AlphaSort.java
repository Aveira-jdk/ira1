package az.iktlab.lessons.lesson14;

import java.util.Arrays;
import java.util.Scanner;

public class AlphaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String input = sc.nextLine();

        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}
