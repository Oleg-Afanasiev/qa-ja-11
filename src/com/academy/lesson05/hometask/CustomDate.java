package com.academy.lesson05.hometask;

public class CustomDate {
    protected int day;
    protected int month;
    protected int year;

    // конструктор по умолчанию
    public CustomDate() {
        day = 1;
        month = 1;
        year = 1970;
    }

    // конструктор со всем параметрами
    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%d", day, month, year);
    }

    public String getFormattedDate(DateFormat format) {
        switch (format) {
            case RU:
                return String.format("%02d.%02d.%d", day, month, year);

            case USA:
                return String.format("%02d-%02d-%d", month, day, year);

            default:
                return "";
        }
    }
}
