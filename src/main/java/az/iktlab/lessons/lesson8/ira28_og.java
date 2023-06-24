package az.iktlab.lessons.lesson8;

public class ira28_og {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int digit){
        return digit > 1 ? digit * factorial(digit - 1): 1;
    }
}
