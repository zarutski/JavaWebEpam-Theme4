package by.epamtc.simple.task04;

public class Task04 {

    public static void main(String[] args) {
        System.out.println(functionX(14));
    }

    public static double functionX(double x) {
        if (x <= 13) {
            return (-Math.pow(x, 3) + 9);
        }
        return -3 / (x + 1);
    }
}
