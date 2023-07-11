package az.iktlab.hw;

import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if (ValidPass(password)){
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid!");
        }
    }

    public static boolean ValidPass(String password){
        if (password.length() < 10){
            return false;
        }

        if (!password.matches("[a-zA-Z0-9]+")){
            return false;
        }

        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))){
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
}
