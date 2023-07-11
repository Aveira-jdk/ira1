package az.iktlab.lessons.lesson10;

// Human class with name, surname, age, gender, iq and make restrictions such as: name's length is 3-32 letters, surname is like name
// age should be 0-250
//iq should be 1-150
// gender should be male or female


public class Human_2 {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private int iq;

    public Human_2(String name, String surname, int age, String gender, int iq) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setGender(gender);
        setIQ(iq);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3 && name.length() <= 32) {
            this.name = name;
        } else {
            System.out.println("wrong");
        }
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname) {
        if (surname.length() >=3 && surname.length() <= 32){
            this.surname = surname;
        } else{
            System.out.println("wrong");
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age >= 0 && age <= 250){
            this.age = age;
        } else {
            System.out.println("wrong");
        }
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender) {
        if (gender.equals("male") || gender.equals("female")){
            this.gender = gender;
        } else{
            System.out.println("wrong");
        }
    }

    public int getIq(){
        return iq;
    }

    public void setIQ(int iq){
        if (iq >= 1 && iq <= 200){
            this.iq = iq;
        } else {
            System.out.println("wrong");
        }
    }

}
