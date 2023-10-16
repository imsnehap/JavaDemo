package company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsJP {

    public static void main(String args[]) {

        List<Employee> data = new ArrayList();

        Map<Employee, Integer> map =  new HashMap<>();
        map.put((new Employee("fname", "Lname", 1)),1);
        map.put((new Employee("fname", "Lname", 1)),1);


        data.add(new Employee("fname", "Lname", 1));
        data.add(new Employee("fname", "Lname", 1));
        data.add(new Employee("fname", "Lname", 1));


        data.add(new Employee("fname2", "Lname2", 2));
        data.add(new Employee("fname3", "Lname3", 3));

        Employee a = data.get(0);

        // a.fName = "test";

        System.out.println("******" + map);

        System.out.println(data.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList()));

        Map<Employee, Long> result2
                = data.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        //Predicate p = emp -> emp.
        String s = "Java Angular Spring Java";

        List<String> s1 = List.of(s.split(" "));
        Map<String, Integer> result = new HashMap<>();

        for (String s2 : s1) {
            if (result.get(s2) == null) {
                result.put(s2, 1);
            } else {
                result.put(s2, result.get(s2) + 1);
            }
        }

        System.out.println(result);


    }
}
