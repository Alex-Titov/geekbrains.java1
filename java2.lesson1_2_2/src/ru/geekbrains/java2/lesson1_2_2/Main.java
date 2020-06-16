package ru.geekbrains.java2.lesson1_2_2;

public class Main {

    public static void main(String[] args) {
        Actions[] actionsArr = new Actions[]{
                new Cat(), new Man(), new Robot(), new Man(), new Cat()
        };

        Wall wall = new Wall();
        Treadmill treadmill = new Treadmill();

        for (Actions actions: actionsArr) {
            treadmill.consume(actions);
            wall.consume(actions);
        }
    }
}
