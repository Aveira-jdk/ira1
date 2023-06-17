package az.iktlab.hw;
import java.util.stream.*;

public class array_sum {
    public static void main(String[] args) {
        int[] a = {5,6,7,8,9,10};
        int sum = IntStream.of(a).sum();

        System.out.println("The sum is: " + sum);
    }
}
