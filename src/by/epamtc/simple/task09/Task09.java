package by.epamtc.simple.task09;

public class Task09 {

    public static void main(String[] args) {
        System.out.println(calcFunction(10));
    }

    public static long calcFunction(long n) {
        long result = 1;
        long sum = 1;

        for (int i = 2; i <= n; i++) {
            sum = sum + i;
            result = result * sum;
        }
        return result;
    }
}
