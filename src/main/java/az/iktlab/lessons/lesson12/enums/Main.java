package az.iktlab.lessons.lesson12.enums;

public class Main {

    public static void main(String[] args) {

        System.out.println(DayOfWeek.MONDAY);

        System.out.println(DayOfWeekE.MONDAY);

        for (DayOfWeekE day : DayOfWeekE.values())
            System.out.println(day);

        DayOfWeekE day = DayOfWeekE.MONDAY;

        if (day instanceof DayOfWeekE) {
            System.out.println(((DayOfWeekE) day).getDescription());
        } else {
            System.out.println("Invalid day");
        }

    }
}
