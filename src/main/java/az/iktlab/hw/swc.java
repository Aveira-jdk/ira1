package az.iktlab.hw;

import java.util.Scanner;

public class swc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String word = "";

        switch (num){
            case 10:
            case 9:
                word ="Sobresaliente";
                break;
            case 8:
            case 7:
                word ="Notable";
                break;
            case 6:
                word ="Bien";
                break;
            case 5:
                word ="Aprobado";
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                word ="Suspenso";
                break;
            default:
                System.out.println("ERR0R");

        }
        System.out.println(word);
    }
}
