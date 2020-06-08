package by.epamtc.zarutski.task10;

import java.util.Scanner;

public class Task10 {

    private static boolean isGrowing = true;
    private static boolean hasPair = false;
    private static boolean isAlternating = true;

    public static void main(String[] args) {
        analyzeSequence();
        printValues(isGrowing, hasPair, isAlternating);
    }

    private static void analyzeSequence() {
        Scanner sc = new Scanner(System.in);

        int number = 0;
        int previousNumber = 0;
        int nonZeroNumbersCount = 0;

        System.out.println("Enter an integer ");
        while (sc.hasNextInt()) {

            if (number != 0) {
                previousNumber = number;
            }

            System.out.println("Enter next integer");
            number = sc.nextInt();

            if (number == 0 && nonZeroNumbersCount >= 2) {
                System.out.println("Exiting...");
                break;
            } else if (number == 0) {
                continue;
            }
            nonZeroNumbersCount++;

            checkConditions(number, previousNumber);
        }
    }

    private static void checkConditions(int enteredNum, int lastEntered) {
        if (lastEntered >= enteredNum) {
            isGrowing = false;
        }
        if (lastEntered == enteredNum) {
            hasPair = true;
        }
        if (Integer.signum(lastEntered) == Integer.signum(enteredNum)) {
            isAlternating = false;
        }
    }

    private static void printValues(boolean isGrowing, boolean hasPair, boolean isAlternating) {
        System.out.printf("Sequence is growing: %b; has pair: %b; isAlternating: %b.",
                isGrowing, hasPair, isAlternating);
    }
}
