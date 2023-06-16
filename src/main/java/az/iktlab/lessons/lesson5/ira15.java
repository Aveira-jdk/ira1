//package az.iktlab.lessons.lesson5;
//
//import java.util.Scanner;
//
//public class ira15 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter something: ");
//
//        int numb = sc.nextInt();
//        int summa = 0;
//
//        for (int i = 0; i < numb; i++) {
//            summa += i;
//        }
//        System.out.println(summa);
//    }
//}






package az.iktlab.lessons.lesson5;

import java.util.Scanner;

public class ira15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");

        int numb = sc.nextInt();
        int summa = 1;

        for (int i = 1; i <= numb; i++) {
            summa *= i;
        }
        System.out.println(summa);
    }
}