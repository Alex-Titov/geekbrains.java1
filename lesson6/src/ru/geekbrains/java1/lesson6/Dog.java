package ru.geekbrains.java1.lesson6;

public class Dog extends CanSwimAnimal {
    private static int countDog = 0;
    public Dog(String name, float runDistans, float maxRunDistans, float jumpHeight, float maxJumpHeight, float swimDistans, float maxSwimDistans) {
        super(name, runDistans, maxRunDistans, jumpHeight, maxJumpHeight, swimDistans, maxSwimDistans);
        countDog++;
    }
    public static void countDog() {
        System.out.println(String.format("Количество собак в системе: %d ", countDog ));
    }
}
