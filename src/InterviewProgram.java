import java.util.HashMap;
import java.util.Map;

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
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.print(entry.getKey().toString() + entry.getValue().toString());
        }


    }


}
