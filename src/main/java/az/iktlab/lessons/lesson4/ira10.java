package az.iktlab.lessons.lesson4;
 import java.util.Scanner;
public class ira10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
        System.out.print("Enter your number: ");
        int c = scan.nextInt();

//        String result = "";

//        if (a<b){
//            result = "NEGATIVE";
//        }
//        else if (a>b) {
//            result = "POSITIVE";
//        }
//        else {
//            result = "EQUAL";
//        }

//        System.out.println(result);

        if (c<0){
            System.out.println("Number is negative");
        } else if (c>0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is equal to zero");
        }
    }
}
