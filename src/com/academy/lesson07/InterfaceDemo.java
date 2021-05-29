package com.academy.lesson07;

import java.util.Arrays;

public class InterfaceDemo {
    public static void main(String[] args) {
        MiddleDev dev = new MiddleDev();
        dev.codding();
        dev.codeReviewing();

        System.out.println("--MiddleDev--");
        Developer middle = new MiddleDev();
        middle.codding();
        middle.codeReviewing();

        System.out.println("--JuniorDev--");
        Developer junior = new JuniorDev();
        junior.codding();
        junior.codeReviewing();

        System.out.println("--Boxer--");
        Boxer boxer = new Fighter();
        boxer.boxing();

        System.out.println("--Genious--");
        Developer genius = new Genius();
        genius.codding();
        genius.codeReviewing();

        Developer[] teamDev = new Developer[3];
        teamDev[0] = middle;
        teamDev[1] = junior;
        teamDev[2] = genius;
        System.out.println(Arrays.toString(teamDev));
    }
}
