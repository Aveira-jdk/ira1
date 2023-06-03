package az.iktlab.lessons.lesson2;

public class ira3 {
    public static void main(String[] args) {
        int a = 8;
        int b = 7;
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //System.out.println(a-- == b); //false
        System.out.println(a-- == ++b); //true
    }
}
