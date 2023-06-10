package az.iktlab.lessons.lesson4;

import java.util.Scanner;

public class ira12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b){
            System.out.println(a);
        } else if (a>c) {
            System.out.println(a);
        } else if (b<a) {
            System.out.println(b);
        } else if (b>c) {
            System.out.println(b);
        } else if (c>a) {
            System.out.println(c);
        } else if (c>b) {
            System.out.println(c);
        } else {
            System.out.println("Numbers are Equal");
        }
    }
}
