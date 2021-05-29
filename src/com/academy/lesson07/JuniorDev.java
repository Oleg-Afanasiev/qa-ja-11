package com.academy.lesson07;

public class JuniorDev implements Developer {
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
