package by.epamtc.zarutski.task06;

public class Task06 {

    public static void main(String[] args) {
        System.out.println(overflowIntRange(12, -30));
        System.out.println(overflowLongRange(12, -30));
    }

    public static long overflowIntRange(double firstMember, double step) {
        double sum;
        double nthMember;
        long n = 1;

        while (true) {
            n++;
            nthMember = firstMember + step * (n - 1);
            sum = (firstMember + nthMember) * (n / 2.0);

            if (isGrowingProgression(firstMember, step) && (sum > Integer.MAX_VALUE)) {
                break;
            } else if (!isGrowingProgression(firstMember, step) && (sum < Integer.MIN_VALUE)) {
                break;
            }
        }

        return n;
    }

    public static long overflowLongRange(double firstMember, double step) {
        double sum;
        double nthMember;
        long n = 1;

        while (true) {
            n++;
            nthMember = firstMember + step * (n - 1);
            sum = (firstMember + nthMember) * (n / 2.0);

            if (isGrowingProgression(firstMember, step) && (sum > Long.MAX_VALUE)) {
                break;
            } else if (!isGrowingProgression(firstMember, step) && (sum < Long.MIN_VALUE)) {
                break;
            }
        }

        return n;
    }

    private static boolean isGrowingProgression(double a1, double d) {
        return (d > 0) || ((d == 0) && (a1 > 0));
    }
}