package az.iktlab.lessons.lesson7;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.exit;

public class ira25 {
    public static void main(String[] args) {
    do {
        Scanner sc = new Scanner(System.in);
        int add = sc.nextInt();
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;


        arr[add] = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        String close = sc.nextLine();
        if(Objects.equals(close, "exit")){
            exit(1);
        }
    } while (true);
    }

}
