package az.iktlab.lessons.lesson5;


public class ira17 {
    public static void main(String[] args) {
        int n = 7;
        int one = 0;
        int two = 1;
        int i = 1;

        System.out.println(one);
        System.out.println(two);

        while (i<n){
            int sum = one + two;

            System.out.println(sum);
            i = sum;
            one = two;
            two = sum;

        }


    }
}
