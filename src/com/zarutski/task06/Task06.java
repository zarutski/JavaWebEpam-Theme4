package com.zarutski.task06;

public class Task06 {

    public static void main(String[] args) {
        int a1 = 5;
        int d = -8;

        System.out.println(maxN(a1, d, false));
        System.out.println(maxN(a1, d, true));
    }

    public static long maxN(int a1, int d, boolean forLongs) {
        if (forLongs) {
            return maxNForLongs(a1, d);
        } else {
            return maxNForIntegers(a1, d);
        }
    }

    private static int maxNForIntegers(int a1, int d) {
        if (d >= 0) {
            return maxIntAscending(a1, d);
        } else {
            return maxIntDescending(a1, d);
        }
    }

    private static int maxIntAscending(int a1, int d) {
        int intRange = Integer.MAX_VALUE;

        int n = 2;
        int aN = aNInt(a1, d, n);

        int firstSum = sumInt(a1, aN, n);
        int currentSum = firstSum;

        while (currentSum < intRange) {
            if (currentSum < firstSum) {
                break;
            }

            n++;
            aN = aNInt(a1, d, n);
            currentSum = sumInt(a1, aN, n);
        }

        return n;
    }

    private static int maxIntDescending(int a1, int d) {
        int intRange = Integer.MIN_VALUE;

        int n = 2;
        int aN = aNInt(a1, d, n);

        int firstSum = sumInt(a1, aN, n);
        int currentSum = firstSum;

        while (currentSum > intRange) {
            if (currentSum > firstSum) {
                break;
            }

            n++;
            aN = aNInt(a1, d, n);
            currentSum = sumInt(a1, aN, n);
        }

        return n;
    }

    private static int aNInt(int a1, int d, int n) {
        return a1 + d * (n - 1);
    }

    private static int sumInt(int a1, int aN, int n) {
        return (a1 + aN) * (n / 2);
    }

    private static long maxNForLongs(long a1, long d) {
        if (d >= 0) {
            return maxLongAscending(a1, d);
        } else {
            return maxLongDescending(a1, d);
        }
    }

    private static long maxLongAscending(long a1, long d) {
        long longRange = Long.MAX_VALUE;

        long n = 2;
        long aN = aNLong(a1, d, n);

        long firstSum = sumLong(a1, aN, n);
        long currentSum = firstSum;

        while (currentSum < longRange) {
            if (currentSum < firstSum) {
                break;
            }

            n++;
            aN = aNLong(a1, d, n);
            currentSum = sumLong(a1, aN, n);
        }

        return n;
    }

    private static long maxLongDescending(long a1, long d) {
        long longRange = Long.MIN_VALUE;

        long n = 2;
        long aN = aNLong(a1, d, n);

        long firstSum = sumLong(a1, aN, n);
        long currentSum = firstSum;

        while (currentSum > longRange) {
            if (currentSum > firstSum) {
                break;
            }

            n++;
            aN = aNLong(a1, d, n);
            currentSum = sumLong(a1, aN, n);
        }

        return n;
    }

    private static long aNLong(long a1, long d, long n) {
        return a1 + d * (n - 1);
    }

    private static long sumLong(long a1, long aN, long n) {
        return (a1 + aN) * (n / 2);
    }

}