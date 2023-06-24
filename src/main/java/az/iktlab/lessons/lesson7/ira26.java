package az.iktlab.lessons.lesson7;

import java.util.Arrays;

public class ira26 {
    public static void main(String[] args) {
        int elem = 0;
        byte b = 5;

        methodOne();

        int m2 = methodTwo();
        System.out.println(m2);

        int m3 = methodThree(6, "Hello", new int[]{5, 2, 3, 4, 6});

        int m4 = methodFour(16);
        System.out.println(m4);
    }

    public static void methodOne(){
        System.out.println("MTH ONE");

        int a = 5;
        byte b = 5;
    }

    public static int methodTwo(){
        System.out.println("MTH TWO");
        return 12+5;
    }

    public static int methodThree(int elem, String str, int[] arr){
        System.out.println("MTH THREE");

        int sqr = elem * elem;
        System.out.println(sqr);
        System.out.println(str);
        System.out.println(Arrays.toString(arr));
        return sqr;
    }

    public static int methodFour(int elem){
        System.out.println("MTH FOUR");

        return 2 * elem;
    }
}
