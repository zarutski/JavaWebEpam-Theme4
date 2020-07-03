package by.epamtc.simple.task08;

public class Task08 {

    public static void main(String[] args) {
        printFunctionResults(2, 25, 3);
    }

    public static void printFunctionResults(double a, double b, double step) {
        for (; a <= b; a += step) {
            System.out.println(calcFuncY(a));
        }
    }

    private static double calcFuncY(double x) {
        double c = 4;
        if (x == 15) {
            return (x + c) * 2;
        }

        return (x - c) + 6;
    }
}
