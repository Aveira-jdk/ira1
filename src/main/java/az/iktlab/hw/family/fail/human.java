//package az.iktlab.hw.family.fail;
//
//import java.util.Arrays;
//
//public class human {
//    public static void main(String[] args) {
//        fail_sub pet1 = new fail_sub("Dog", "Samsung", 6, 80, new String[]{"barking", "begging", "sniffing"});
//
//        pet1.run();
//        pet1.eat();
//        pet1.respond();
//        pet1.foul();
//
//        System.out.println("Pet 1: " + pet1.toString());
//    }
//}
//
//class fail_sub {
//    public String name;
//    public String surname;
//    public int age;
//    public int iq;
//    public String[] habits;
//
//    public fail_sub(String species, String nickname) {
//        this.species = species;
//        this.nickname = nickname;
//    }
//
//    public fail_sub(String species, String nickname, int age, int tricklevel, String[] habits) {
//        this.species = species;
//        this.nickname = nickname;
//        this.age = age;
//        this.tricklevel = tricklevel;
//        this.habits = habits;
//    }
//    public void run() {
//        System.out.printf("fail_sub: %s is running\n", nickname);
//    }
//
//    public void eat() {
//        System.out.println("I am eating");
//    }
//
//    public void respond() {
//        System.out.printf("Hello, owner. I am %s. I miss you!\n", nickname);
//    }
//
//    public void foul() {
//        System.out.println("I need to cover it up");
//    }
//
//    public String toString() {
//        return "Pet: species: " + species + ", nickname: " + nickname + ", age: " + age + ", tricklevel: " + tricklevel + ", habits: " + Arrays.toString(habits);
//    }
//}
