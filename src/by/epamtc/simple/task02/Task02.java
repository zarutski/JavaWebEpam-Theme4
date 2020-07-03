package by.epamtc.simple.task02;

public class Task02 {

    public static void main(String[] args) {
        Date date = dateByDayNumber(64);
        System.out.println(date);
    }

    public static Date dateByDayNumber(int dayNumber) {
        int day = dayNumber;
        int month = 1;
        boolean monthNotDetermined = true;

        while (monthNotDetermined) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if ((day - 31) <= 0) {
                        monthNotDetermined = false;
                        break;
                    }
                    day -= 31;
                    month++;
                    break;
                case 2:
                    if ((day - 28) <= 0) {
                        monthNotDetermined = false;
                        break;
                    }
                    day -= 28;
                    month++;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if ((day - 30) <= 0) {
                        monthNotDetermined = false;
                        break;
                    }
                    day -= 30;
                    month++;
                    break;
            }
        }

        return new Date(day, month);
    }
}
