package ru.geekbrains.java2.lesson1_2;

public class Man implements Actions{
    @Override
    public void run() {
        System.out.println("Man is running...");
    }

    @Override
    public void jump() {
        System.out.println("Man is jumping...");
    }
}
