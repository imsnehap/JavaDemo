package company;

import java.util.*;
import java.util.stream.Collectors;

public class Infy {
    public static void main(String[] args) {


        String s = "laptop mobile and desktop are not exempt ";

        List<String> splitList = List.of(s.split(" "));

        Comparator<String> compByLength = Comparator.comparingInt(String::length);
        System.out.println(String.join(" ",splitList.stream().collect(Collectors.toSet()).stream().sorted()
                .collect(Collectors.toList()).stream().sorted(compByLength).collect(Collectors.toList())));

        Comparator<String> compByLengthCaseSen = Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER);
        System.out.println(String.join(" ",splitList.stream().collect(Collectors.toSet()).stream().sorted(compByLengthCaseSen)
                .collect(Collectors.toList())));
    }
}
