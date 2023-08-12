package az.iktlab.lessons.lesson20;

import java.io.File;
import java.io.IOException;

public class ira44 {
    public static void main(String[] args) {

        File file = new File("C:\\Java-Projects\\ira1\\docs\\file.txt");

        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());

        try {
            file.createNewFile();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

//        file.delete();

        System.out.println(file.length());

    }
}
