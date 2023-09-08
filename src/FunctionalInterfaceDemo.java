import java.time.LocalDate;
import java.util.List;

interface CheckPerson {
    boolean test(Person p);
}

public class FunctionalInterfaceDemo{
    public static void main(String[] args) {

        List<Person> p = List.of(new Person("Eric"), new Person("David"),new Person("Ram"));
         //FunctionalInterfaceDemo.printPersonsOlderThan(p, new CheckPersormImpl());
        FunctionalInterfaceDemo.printPersonsOlderThan(p, (Person a) -> a.getGender() == Person.Sex.MALE
                && a.getAge() >= 18
                && a.getAge() <= 25);

    }
    public static void printPersonsOlderThan(List<Person> roster, CheckPerson c) {
        for (Person p : roster) {
            if (c.test(p)) {
                p.printPerson();
            }
        }
    }
}


