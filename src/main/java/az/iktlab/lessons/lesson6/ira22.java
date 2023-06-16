package az.iktlab.lessons.lesson6;

public class ira22 {

    public static void main(String[] args) {
        int[] arr = {2,5,6,8,10};
        int a=9;
        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a){
               found=true;
                break;
            }
        }

        if (found){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
