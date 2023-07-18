package az.iktlab.lessons.lesson12;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();

        Person person = new Person();

        Person pe = new Employee();
        pe.run();

        Employee ep = (Employee) new Person();
    }
}
