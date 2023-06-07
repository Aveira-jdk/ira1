package az.iktlab.hackerrank;

import java.io.*;
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(isPalindrome(A));
    }

    private static String isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reversedStr)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}