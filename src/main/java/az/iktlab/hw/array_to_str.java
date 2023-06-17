package az.iktlab.hw;
import java.util.Arrays;

public class array_to_str {
    public static void main(String[] args) {
        int[] num = {4,2,1,9,8,7};

        System.out.println("Array before sorting: " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Array after sorting: " + Arrays.toString(num));
    }
}
