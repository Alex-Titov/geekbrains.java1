package ru.geekbrains.java1.lesson6;

public class Cat extends CantSwimAnimal {
    static int countCat = 0;
    public Cat(String name, float runDistans, float maxRunDistans, float jumpHeight, float maxJumpHeight) {
        super(name, runDistans,maxRunDistans,jumpHeight,maxJumpHeight);
        countCat++;
    }
    public static void countCat() {
        System.out.println(String.format("Количество котов в системе: %d ", countCat ));
    }
}
