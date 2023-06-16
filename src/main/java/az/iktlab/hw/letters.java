package az.iktlab.hw;

import java.util.Scanner;

public class letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your letter: ");
        String enter = input.nextLine();

        if (enter == "A"){
            System.out.println("Hello");;
        }
    }
}
