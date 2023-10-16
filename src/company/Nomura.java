package company;

import java.net.StandardSocketOptions;
import java.util.HashMap;
import java.util.Map;

public class Nomura {
    /*
    * Find Missing number from 1 to 10 from array of 9
     */
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 1, 7, 8, 9, 10};
        int sum = calculateSum(10);
        System.out.println("SUM ::" + sum);

        int result = 0;

        for (int a: arr){
           result = result + a;
        }
        System.out.println("Missing number ::" + (sum-result));

    }

    static int calculateSum(int val) {
        if (val == 1) {
            return 1;
        }
        int sum = calculateSum(val - 1) + val;
        System.out.println("sum ::" + sum+" Value :: "+val);

        return sum;
    }
}
