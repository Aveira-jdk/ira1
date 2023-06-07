package az.iktlab.lessons.lesson3;

import java.util.Scanner;

public class ira8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int i = sc.nextInt();
        System.out.println(i);

        System.out.print("Enter double: ");
        double d = sc.nextDouble();
        System.out.println(d);

        String word = "Hello again, today we must learn String and methods";

        System.out.println("Enter index: ");
        int index = sc.nextInt();
        System.out.println(word.charAt(index));
    }
}
