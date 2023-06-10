package az.iktlab.lessons.lesson4;

import java.util.Scanner;

public class ira11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String day = sc.nextLine();

        String dayy = "";

//        if (num==1){
//            day = "MONDAY";
//        } else if (num==2) {
//            day = "TUESDAY";
//        } // ..
//
        //SWITCH

        switch (num){
            case 1: 
                day = "MONDAY";
                break;
            case 2: 
                day = "TUESDAY";
                break;
            case 3: 
                day = "WEDNESDAY";
                break;
            case 4: 
                day = "THURSDAY";
                break;
            case 5: 
                day = "FRIDAY";
                break;
            case 6: 
                day = "SATURDAY";
                break;
            case 7: 
                day = "SUNDAY";
                break;

            default:
                System.out.println("NO DAY FOUND");
        }

        System.out.println(dayy);

        switch (day){
            case "MONDAY":
                day = "1";
                break;
            case "TUESDAY":
                day = "2";
                break;
            case "WEDNESDAY":
                day = "3";
                break;
            case "THURSDAY":
                day = "4";
                break;
            case "FRIDAY":
                day = "5";
                break;
            case "SATURDAY":
                day = "6";
                break;
            case "SUNDAY":
                day = "7";
                break;

            default:
                System.out.println("NO DAY FOUND");
        }
        System.out.println(day);
    }
}
