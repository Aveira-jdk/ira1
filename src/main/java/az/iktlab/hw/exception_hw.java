package az.iktlab.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_hw {
    public static void main(String[] args) {

        while (true){
            int number1, number2;
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Enter first number: ");
                number1 = Integer.parseInt(sc.nextLine());

                System.out.print("Enter second number: ");
                number2 = Integer.parseInt(sc.nextLine());

                int result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);

            }
            catch (InputMismatchException e) {
                System.out.println("Your input should be an INTEGER.");
                System.out.println("Exception: " + e);
            }

            catch (NumberFormatException e) {
                System.out.println("Just enter real INTEGER");
                System.out.println("Exception: " + e);
            }

            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
                System.out.println("Exception: " + e);
            }
        }
    }
}