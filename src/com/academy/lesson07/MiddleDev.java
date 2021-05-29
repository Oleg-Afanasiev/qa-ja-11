package com.academy.lesson07;

public class MiddleDev implements Developer {

    @Override
    public void codding() {
        System.out.println("codding");
    }

    @Override
    public void codeReviewing() {
        System.out.println("code reviewing");
    }

    @Override
    public String toString() {
        return "MiddleDev";
    }
}
