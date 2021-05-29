package com.academy.lesson07.lambda;

import com.academy.lesson07.Boxer;
import com.academy.lesson07.Fighter;

public class LambdaDemo {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        Boxer fighter2 = new Fighter();

        fighter1.boxing();
        fighter2.boxing();

        Boxer fighter3 = new BoxerStudent();
        fighter3.boxing();

        // анонимный класс - класс без названия
        Boxer fighter4 = new Boxer() {
            @Override
            public void boxing() {
                System.out.println("New boxing technique");
            }
        };

        fighter4.boxing();

        Boxer fighter5 = ()->System.out.println("New boxing technique (lambda)");
        fighter5.boxing();
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
}
