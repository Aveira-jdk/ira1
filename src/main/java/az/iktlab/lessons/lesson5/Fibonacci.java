package az.iktlab.lessons.lesson5;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;

        int first = 0;
        int second = 1;
        int count = 0;

        System.out.println("Fibonacci Series:");

        while (count < n) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            count++;
        }
    }
}
