package com.academy.lesson08;

public class ExceptionDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result = calc.div(5, 0);
        System.out.println(result);
    }
}
