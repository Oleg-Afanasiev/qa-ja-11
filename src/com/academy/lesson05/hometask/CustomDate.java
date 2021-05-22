package com.academy.lesson05.hometask;

public class CustomDate {
    private int day;
    private int month;
    private int year;

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
}
