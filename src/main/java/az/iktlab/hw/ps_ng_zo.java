package az.iktlab.hw;

import java.util.Scanner;

public class ps_ng_zo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Count of numbers: ");
        int count = input.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number" + ": ");
            int number = input.nextInt();

            if (number > 0) {
                positiveCount++;
            }
            else if (number < 0) {
                negativeCount++;
            }
            else {
                zeroCount++;
            }
        }

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zero numbers: " + zeroCount);
    }
}
