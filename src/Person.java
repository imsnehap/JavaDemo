import java.time.LocalDate;

public class Person {

    public Person(String name) {
        this.name = name;
    }

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;

    public Sex getGender() {
        return gender;
    }

    Sex gender;
    String emailAddress;

    public int getAge() {
        return 20;
    }

    public void printPerson() {
        System.out.println("Name :: " + name);
    }
}
