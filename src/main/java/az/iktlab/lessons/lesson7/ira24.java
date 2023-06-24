package az.iktlab.lessons.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class ira24 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int add = sc.nextInt();
        int add2 = sc.nextInt();

        int[] newArr = new int[add];
        int value = add2;
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i<n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = value;
        System.out.println(Arrays.toString(newArr));
    }
}