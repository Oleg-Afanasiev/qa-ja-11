package com.academy.lesson08.exc;

public class Calculator {
    // метод выбрасывает проверяемый тип исключения
    public double div(double d1, double d2) throws DivisionByZero {
        if (d2 == 0) {
            // выбросим исключение
            throw new DivisionByZero();
        }

        return d1/d2;
    }

    // считает сумму положительных чисел
    // метод выбрасывает непроверяемый тип исключения
    public int sumPositiveNumbers(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            throw new NegativeNumberException();
        }

        return n1 + n2;
    }
}
