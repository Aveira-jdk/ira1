package az.iktlab.hackerrank;

import java.io.*;
import java.util.*;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int lengthAll = A.length() + B.length();

        String capitalizedSt1 = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String capitalizedSt2 = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        String result = capitalizedSt1 + " " + capitalizedSt2;

        System.out.println(lengthAll);
        System.out.println("No");
        System.out.println(result);

        sc.close();
    }
}
