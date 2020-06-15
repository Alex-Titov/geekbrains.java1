package ru.geekbrains.java2.lesson1_2;

public class Treadmill implements Consumer{
    @Override
    public void consume(Actions actions) {
        Actions.run();
    }
}
