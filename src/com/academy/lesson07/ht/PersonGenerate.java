package com.academy.lesson07.ht;

import com.academy.lesson04.Person;
import com.academy.lesson05.Gender;

import java.util.Random;

public class PersonGenerate {
    public static void main(String[] args) {
        Gender[] genders = {Gender.MALE,Gender.FEMALE}; // [0, 1]
        String[] manFirstNames = {"Архип","Болеслав","Марат","Семён",
                "Юлиан","Сергей","Нифонт","Максим","Евгений","Геннадий",
                "Володар","Ждан","Марк","Григорий","Леонид","Олег"};

        String[] womanFirstNames = {"Виктория","Дария","Арина","Зоя","Лиза","Мария","Надя","Раиса","Тамара",
                "Октябрина","Рая","Роза","Нелли","Милана","Любовь","Леся",
                "Каролина","Зинаида","Карина","Клавдия"};

        Random random = new Random();

        Person[] persons = new Person[100]; // [null,null,null,...] =>[Person1, Person2,...]
        for(int i = 0; i < persons.length; i++) {
            int ageFrom = 4;
            int ageTo = 90;
            int ageRandom = ageFrom + random.nextInt(ageTo-ageFrom+1); // 4 + [0..87]
            Gender gender = genders[random.nextInt(2)];
            String name;

            if (gender == Gender.MALE) {
                name = manFirstNames[random.nextInt(manFirstNames.length)]; // [0, ..., manFirstNames.length-1]
            } else {
                name = womanFirstNames[random.nextInt(womanFirstNames.length)];
            }

            persons[i] = new Person();
            persons[i].setFirstName(name);
            persons[i].setLastName("Ivanova"); // доделать
            persons[i].setAge(ageRandom);
            persons[i].setGender(Gender.FEMALE);
        }

        for(int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
            assert persons[i].getAge() >= 4 && persons[i].getAge() <=90;
        }
    }

    public static int nextInt(int from, int to) {
        return from + new Random().nextInt(from-to+1);
    }
}
