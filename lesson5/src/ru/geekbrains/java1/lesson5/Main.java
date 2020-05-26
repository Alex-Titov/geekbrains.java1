package ru.geekbrains.java1.lesson5;

import static ru.geekbrains.java1.lesson5.dataBase.*;

public class Main {

    public static void main(String[] args) {
        doTask1();
    }

    public static void doTask1() {
        User[] userArray = dataBase.getArrayPersons();

        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i].age > 30){
               userArray[i].userInfo();
                System.out.println();
            }
        }
    }
}
