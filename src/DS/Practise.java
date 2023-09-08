package DS;

import java.util.*;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Practise {

    public static void main(String args[]){

        String list = "10,15,8,49,25,98,98,32,15";

        List<String> data = Arrays.asList(list.split(","));

        //unique element
        System.out.println("================Unique=====================");
        data.stream().collect(Collectors.toSet()).forEach(System.out::println);


        //duplicate element
        System.out.println("===============Duplicate=====================");
        Set<String> result = new HashSet<>();
        data.stream().filter(d-> !result.add(d)).forEach(System.out::println);

        //Max element
        System.out.println("================Max=====================");
        System.out.println(data.stream().max(String::compareTo).get());

        //Min element
        System.out.println("================Min=====================");
        System.out.println(data.stream().min(String::compareTo).get());


        System.out.println("================Sorting=====================");
        data.stream().sorted().forEach(System.out::println);


    }
}
