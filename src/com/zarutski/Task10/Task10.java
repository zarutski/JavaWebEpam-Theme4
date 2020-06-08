package com.zarutski.Task10;

import java.util.Scanner;

public class Task10 {

    private static boolean isGrowing = true;
    private static boolean hasPair = false;
    private static boolean isAlternating = true;

    private static int numbersCount = 0;
    private static int enteredNum = 0;
    private static int lastEntered = 0;

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an integer ");
        startTyping();
        printValues(isGrowing, hasPair, isAlternating);
    }

    private static void startTyping() {
        while (sc.hasNextInt()) {

            if (enteredNum != 0) {
                lastEntered = enteredNum;
            }

            System.out.println("Enter next integer");
            enteredNum = sc.nextInt();

            if (enteredNum == 0 && numbersCount >= 2) {
                System.out.println("Exiting...\n");
                break;
            } else if (enteredNum == 0) {
                continue;
            }

            numbersCount++;
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
    }

    private static void printValues(boolean isGrowing, boolean hasPair, boolean isAlternating) {
        System.out.printf("Sequence is growing: %b; has pair: %b; isAlternating: %b.",
                isGrowing, hasPair, isAlternating);
    }
}
