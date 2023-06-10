package az.iktlab.hackerrank;

import java.util.Scanner;

public class Weird_notWeird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        if (N % 2 == 0 && (N < 6 || N > 20)) {
            System.out.println("Not Weird");
        }
        else {
            System.out.println("Weird");
        }
    }
}