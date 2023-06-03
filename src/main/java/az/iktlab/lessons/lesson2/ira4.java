package az.iktlab.lessons.lesson2;

public class ira4 {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 8;

        System.out.println(a > 10 && b < 6);
        System.out.println(a > 10 || b < 6);

        System.out.println(a > 10 && b < 9);
        System.out.println(a > 10 || b < 9);

        System.out.println(a > 10 & b < 9);
        System.out.println(a > 10 | b < 9);
        
        boolean x = false,y = false, z = false, t = false;
        System.out.println(x);

        boolean m, n, g, f;
        System.out.println((x = true) & (y = false));
    }
}
