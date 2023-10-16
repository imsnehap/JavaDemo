import java.time.LocalDate;
import java.util.List;
import java.util.function.BiFunction;


interface CheckPerson2 {
    boolean test2(Person p);

    default boolean test22(Person p) {
        return false;
    }
}

@FunctionalInterface
interface CheckPerson  extends CheckPerson2{
    boolean test(Person p);
    default boolean test2(Person p) {
        return false;
    }
}


public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        List<Person> p = List.of(new Person("Eric"), new Person("David"), new Person("Ram"));
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

    public static void addAgre(List<Person> roster, BiFunction c) {
        for (Person p : roster) {
            System.out.println(c.apply(p.getAge(), p.getAge()));
        }
    }
}




