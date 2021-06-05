package com.academy.lesson09.ht;

import com.academy.lesson04.Person;

public class GenArrayDemo {
    public static void main(String[] args) {
        String[] array = new String[10];
        // Создать класс GenArray<String> размера 10
        GenArray<String> genArray = new GenArray<>(new String[10]); // *
        // Записать 2-ой элемент "hello"
        genArray.set(2, "hello");
        // Прочитать этот элемент
        String actualValue = genArray.get(2); // => "hello"
        String expectedValue = "hello";
        System.out.println(actualValue); // => "hello"
        assert expectedValue.equals(actualValue);

        // Записать 11-ый элемент "world"
        // Получить exception
        GenArray<Person> genArrayPerson;
        // set Person with name 'Vasya'
        // check name from genArrayPerson is Vasya

    }
}
