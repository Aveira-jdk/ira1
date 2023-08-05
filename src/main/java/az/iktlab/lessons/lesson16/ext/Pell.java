package az.iktlab.lessons.lesson16.ext;

public class Pell {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;

        for (int i = 0; i < 15; i++) {
            System.out.print(x + " ");
            System.out.print(y);

            System.out.println((x * 2) + y);

        }
    }
}
