package az.iktlab.lessons.lesson8.oop;

public class ira29 {

    public static void main(String[] args) {

        ira29_sub ave = new ira29_sub();

        ave.name = "Aveira";
        ave.surname = "Shiba";
        ave.age = 16;

        ave.run();


        ira29_sub lefi = new ira29_sub();
        lefi.name = "Leficios";
        lefi.surname = "Shiba";
        lefi.age = 16;

        System.out.printf("Aveira: name: %s , surname: %s , age: %s\n", ave.name, ave.surname, ave.age);
        System.out.printf("Leficios: name: %s , surname: %s , age: %s", lefi.name, lefi.surname, lefi.age);
    }
}
