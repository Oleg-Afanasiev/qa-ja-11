package com.academy.lesson08.ht;

import com.academy.lesson05.hometask.CustomDate;

public class CustomDateDemo {
    public static void main(String[] args) {
        CustomDate customDate1 = new CustomDate(21, 6, 2021);
        System.out.println(customDate1);
        try {
            CustomDate customDate2 = new CustomDate(21, 16, 2021);
            System.out.println(customDate2);
        } catch (Exception e) {
            System.out.println("Ошибка. неверная дата");
        }
    }
}
