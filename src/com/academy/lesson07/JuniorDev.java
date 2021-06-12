package com.academy.lesson07;

import com.academy.lesson04.Person;

public class JuniorDev extends Person implements Developer {
    @Override
    public void codding() {
        System.out.println("Hard codding");
    }

    @Override
    public void codeReviewing() {
        System.out.println("not qualified for review");
    }

    @Override
    public String toString() {
        return "JuniorDev";
    }
}
