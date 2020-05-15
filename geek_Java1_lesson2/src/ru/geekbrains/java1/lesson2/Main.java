package ru.geekbrains.java1.lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
        doTask4();
        doTask5();
    }

    // задание №1
    private static void doTask1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int lengthArr = arr.length;
        System.out.println("Длинна массива равна " + lengthArr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < lengthArr; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        System.out.println();
        System.out.println("После обработки получаем следующий массив: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Задание №2
    private static void doTask2() {
        System.out.println("Задание №2:");
        int[] autoArr = new int[8];
        for (int i = 0, j = 0; i < 8; i++) {
            autoArr[i] = j;
            j += 3;
        }
        for (int i = 0; i < autoArr.length; i++) {
            System.out.print(autoArr[i] + " ");
        }
    }

    // Задание №3
    private static void doTask3() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println();
        System.out.println("Задание №3:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println();
        System.out.println("После выполнения задачи получаем следующий массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Задание №4
    private static void doTask4() {
        System.out.println();
        System.out.println("Выполняем задачу №4");
        System.out.println("Введите длину стороны массива: ");
        Scanner scanner = new Scanner(System.in);


        int arrLength = scanner.nextInt();
        scanner.close();
        int arrWidth = arrLength;
        int[][] qadArr = new int[arrWidth][arrLength];

        for (int i = 0; i < arrLength; i++) {
            qadArr[i][i] = 1;
        }
        for (int i = 0; i < qadArr.length; i++) {
            for (int j = 0; j < qadArr[i].length; j++) {
                System.out.print(qadArr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Задание №5
    private static void doTask5() {
        System.out.println();
        System.out.println("Выполняем задачу №5:");
        int[] array = {12, 65, 25, 7, 36, 12, 88, -6, -17, 92, 11, -10, -33, 3};
        System.out.println("Имеем следующий массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int min = array[0];
        int max = array[0];

//Ищем наименьшее значение и записываем в переменную min
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
//Ищем наибольшее значение и записываем его в переменную max
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }
}
