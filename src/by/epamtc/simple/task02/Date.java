package by.epamtc.simple.task02;

public class Date {
    public int day;
    public int month;

    public Date(int day, int month) {
        this.day = day;
        this.month = month;
    }

    @Override
    public String toString() {
        return String.format("Date(dd.mm): %02d.%02d", day, month);
    }
}
