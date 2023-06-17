package az.iktlab.hw;

public class array_avg {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12}; //my array
        int length = array.length; //array's length
        int sum  = 0; //zero sum value

        for (int i = 0; i < array.length; i++) {
            sum += array[i]; //array's final sum value
        }

        double average = sum/length; //variable with floating point to find an average value

        System.out.println("Average value of array is: " + average); //print the avg value
    }
}
