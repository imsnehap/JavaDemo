package DS;

public class Recursion {

    public static void main(String[] args) {
        System.out.println("Factorial of 0:: " + fact(0));
        System.out.println("Fibo Sum :: " + fibo(0, 1, 6));
        fiboSeries(0, 1, 6);


    }

    static int fact(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        int sum = a * fact(a - 1);
        return sum;
    }

    static int fibo(int a, int b, int n) {
        if (n == 0) {
            return 0;
        }
        int sum = a + b;
        // System.out.println(" " +sum);
        return sum + fibo(b, sum, n - 1);
        // System.out.println(" " +total);

    }

    static void fiboSeries(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int sum = a + b;
        System.out.println("  " + sum);
        fiboSeries(b, sum, (n - 1));

    }
}
