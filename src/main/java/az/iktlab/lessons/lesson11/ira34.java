package az.iktlab.lessons.lesson11;

import java.util.Arrays;

public class ira34 {
    public static void main(String[] args) {
        int[][] my_arr = {{1, 3, 5}, {2, 4, 6}, {3, 5, 8}};
        int count = 0;

        for (int i = 0; i < my_arr.length; i++) {
            int start = (i % 2 == 0) ? 0 : my_arr[i].length - 1;
            int end = (i % 2 == 0) ? my_arr[i].length : -1;
            int increment = (i % 2 == 0) ? 1 : -1;

            for (int j = start; j != end; j += increment) {
                System.out.print((j == 0 ? "" : "_") + my_arr[i][j] + " ");
            }
        }
    }
}
