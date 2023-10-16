package company;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewProgram {

    public static void main(String[] args) {
        String abc = "AAAAABBCCAATUUUZZ";
        HashMap<Character, Integer> result = new HashMap<>();
        char[] ch = abc.toCharArray();
        for (char c : ch) {
            if (result.get(c) == null) {
                result.put(c, 1);
            } else {
                int cnt = result.get(c) + 1;
                result.put(c, cnt);
            }
        }
        //InterviewProgram Arrays.asList(ch).stream().map( ch -> {result.put(ch) ==  null })
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey().toString() + entry.getValue().toString());
        }
        //With stream API implementation
        abc.chars().mapToObj(c -> (char) c).toList().stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.println("Key -> " + key + " Value ->" + value));


    }


}
