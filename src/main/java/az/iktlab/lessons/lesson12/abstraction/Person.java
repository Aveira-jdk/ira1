package az.iktlab.lessons.lesson12.abstraction;

public class Person extends Human {

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void write() {
        System.out.println("Main write");
    }

    @Override
    public void run() {
        System.out.println("Main run function");
    }
}
