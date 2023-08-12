package az.iktlab.lessons.lesson20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ira45 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Java-Projects\\ira1\\docs\\file.txt");


        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
