package az.iktlab.lessons.lesson6;

import java.util.Scanner;

public class ira18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int limit = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= limit; i++) {

            if ((i%2) != 0){
                sum += i;
            }

            System.out.println(sum);
        }
    }
}
