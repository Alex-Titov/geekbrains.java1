package ru.geekbrains.java2.lesson1_2;

public class Wall implements Consumer{

    @Override
    public void consume(Actions actions) {
        Actions.jump();
    }
}
