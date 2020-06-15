package ru.geekbrains.java2.lesson1_2;

public class Cat implements Actions{
    @Override
    public void run() {
        System.out.println("Cat is running...");
    }

    @Override
    public void jump() {
        System.out.println("Cat is jumping...");
    }
}
