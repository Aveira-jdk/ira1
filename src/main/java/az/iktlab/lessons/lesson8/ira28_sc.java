package az.iktlab.lessons.lesson8;

import java.util.Scanner;

public class ira28_sc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        System.out.println("The factorial of your number is: " + factorial(num));
    }

    private static int factorial(int digit){
        return digit > 1 ? digit * factorial(digit - 1): 1;
    }
}
