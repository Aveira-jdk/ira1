package az.iktlab.lessons.lesson14.dateAndTime;

import java.time.LocalDate;
public class DateEx {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println("Now: " + date);
        System.out.println("Month: " + date.getDayOfMonth());
        System.out.println("Year: " + date.getYear());
    }
}


