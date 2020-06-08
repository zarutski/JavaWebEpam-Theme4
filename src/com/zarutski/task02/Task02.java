package com.zarutski.task02;

public class Task02 {

    private static final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        int dayOfAYear = 32;
        int[] dayAndMonth = getDayAndMonth(dayOfAYear);
        int day = dayAndMonth[0];
        int month = dayAndMonth[1];

        System.out.printf("Day of a year: %d. It's a day - %d of a month - %d", dayOfAYear, day, month);
    }

    public static int[] getDayAndMonth(int dayOfAYear) {
        int currentMonth = 1;
        int daysInCurrentMonth = daysInMonths[currentMonth - 1];
        int dayOfMonth = dayOfAYear;

        while (dayOfMonth > daysInCurrentMonth) {
            dayOfMonth = dayOfMonth - daysInCurrentMonth;
            currentMonth++;
        }

        int[] dayAndMonth = new int[2];
        dayAndMonth[0] = dayOfMonth;
        dayAndMonth[1] = currentMonth;
        return dayAndMonth;
    }
}
