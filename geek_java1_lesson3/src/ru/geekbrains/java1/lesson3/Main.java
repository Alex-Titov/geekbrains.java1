package ru.geekbrains.java1.lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        doTask1();
//        doTask2();
    }
    public static void doTask1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру *Угадай число*");
        System.out.println("Вам будет загадано число от 1 до 9. У вас будет 3 попытки, что бы угадать его.");
        int newGame = 1;
        while (newGame == 1) {

            for (int i = 1; i <= 3; i++) {
                int random = (int) (Math.random() * (9 - 1 + 1) + 1);
                System.out.println("Введите число: ");
                int answer = scanner.nextInt();
                if (answer == random) {
                    System.out.println("Поздравляем, вы угадали!");
                    break;
                } else if (answer < random) {
                    System.out.println("Загаданное число больше!");
                } else {
                    System.out.println("Загаданное число меньше!");
                }
            }

            System.out.println("Хотите сыграть еще раз? 1 - да. 2 - нет");
            newGame = scanner.nextInt();

        }
        scanner.close();
    }

//    public static void doTask2(){
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        int randomWordNumber = (int) (Math.random() * (words.length - 1 + 1) + 1);
//        System.out.println(words[randomWordNumber]);
//        String randomWord = words[randomWordNumber];
//        System.out.println("Введите слово:");
//        Scanner scan = new Scanner(System.in);
//        String wordAnswer = scan.nextLine();
//
//        if (wordAnswer == randomWord) {
//            System.out.println("Вы угадали!");
//        } else {
//            System.out.println("Вы не угадали!");
//        }
//    }




}
