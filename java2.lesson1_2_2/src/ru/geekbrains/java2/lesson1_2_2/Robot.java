package ru.geekbrains.java2.lesson1_2_2;

public class Robot implements Actions{
    @Override
    public void run() {
        System.out.println("Robot is running...");
    }

    @Override
    public void jump() {
        System.out.println("Robot is jumping...");
    }
}
