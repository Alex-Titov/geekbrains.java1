package ru.geekbrains.java1.lesson7;

public class Main {

    public static void main(String[] args) {
        Cat[] catsArr = new Cat[3];
        catsArr[0] = new Cat("Barsik", 5, false);
        catsArr[1] = new Cat("Kotik", 15, false);
        catsArr[2] = new Cat("Mauser", 20, false);


        Plate plate = new Plate(35);
        plate.info();
        for (int i = 0; i < catsArr.length; i++) {
                catsArr[i].eat(plate);
                plate.info();
        }

    }


}



