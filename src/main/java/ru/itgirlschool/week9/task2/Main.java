package ru.itgirlschool.week9.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cat", 3));
        animals.add(new Animal("cow", 1));
        animals.add(new Animal("duck", 5));
        animals.add(new Animal("dog", 4));
        animals.add(new Animal("elephant", 8));
        animals.add(new Animal("horse", 10));
        animals.add(new Animal("hippo", 9));
        animals.add(new Animal("pig", 2));
        animals.add(new Animal("tiger", 6));
        animals.add(new Animal("zebra", 7));

        animals.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .forEach(System.out::println);
    }
}