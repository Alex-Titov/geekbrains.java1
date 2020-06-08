package ru.geekbrains.java1.lesson7;

public class Plate {
    private int food;
    private boolean c = true;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n, String catName) {
        if (food >= n) {
            food -= n;
            System.out.println(catName + " покушал.");
//            тут я пробовал присвоить булевой переменной сытости кота true
//            Cat.setCatEat(c);
        } else {
            System.out.println("В тарелке " + food + " еды, а коту надо " + n + ". В тарелке не может быть отрицательного количества еды. " + catName +" не поел.");
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
