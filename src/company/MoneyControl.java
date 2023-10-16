package company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MoneyControl {

    public static void main(String[] args) {
        /*
         *
         * find the max repeated number in the list with java 8 streams.
         * 1, 2, 3, 4, 5, 3, 5, 5
         * Ans is :: 5 - 3 times
         */

        // Get the List
        List<Integer> g
                = Arrays.asList(1, 2, 3, 4, 5, 3, 5, 5);

        // Collect the list as map
        // by groupingBy() method and sorted by values

        g.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting())).
                entrySet().stream().
                sorted(Map.Entry.comparingByValue()).
                forEach(System.out::println);


        g.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting())).entrySet()
                .forEach(k -> System.out.println("Key -> " + k.getKey() + " Value ->" + k.getValue()));

        g.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting())).
                entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)).stream().
                forEach(System.out::println);

    }
}
