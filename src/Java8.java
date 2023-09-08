import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String args[]) {

        List<Integer> lit = Arrays.asList(2, 4, 6, 7, 10);
        //filtering even
        // lit.stream().filter(i -> i%2 == 0).forEach(System.out::println);

        List<Integer> dup = Arrays.asList(2, 2, 4, 6, 7, 10, 45, 45);
        Set<Integer> result = new HashSet();
        dup.stream().filter(n -> !result.add(n)).forEach(System.out::println);

        List<String> dupS = Arrays.asList("test1", "");
        Map<String, Integer> resultS = new HashMap();
        dupS.stream().map(n -> {
            if (resultS.get(n) == null) {
                return resultS.put(n, 1);
            } else {
                return resultS.put(n, resultS.get(n) + 1);
            }
        }).forEach(System.out::println);

    }
}
