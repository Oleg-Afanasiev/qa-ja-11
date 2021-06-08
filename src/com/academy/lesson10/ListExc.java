package com.academy.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExc {
    public static void main(String[] args) {
        String[] names = {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max"};

        // 1 способ из массива коллекцию
        List<String> listNames = new ArrayList<>();
        listNames.addAll(Arrays.asList(names)); // из массива коллекцию
        System.out.println(listNames);

        // 2 способ
        List<String> listNames2 = new ArrayList<>(Arrays.asList(names));
        System.out.println(listNames2);

        listNames.add("Philip");
        listNames.add("Joseph");
        listNames.add("Leon");

        listNames.remove("Veronica");
        listNames.remove("Leonid ");
        System.out.println(listNames);

        for (int i = 0; i < listNames.size(); i++) {
            System.out.println(listNames.get(i));
        }
    }
}
