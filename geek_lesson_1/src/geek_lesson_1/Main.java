package geek_lesson_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task_3();

        System.out.println(task_4(5, 12));

        task_5(-1);

        System.out.println(task_6(-3));

        task_7("Alex");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        task_8(year);

//Задача 2

        short sh = 12;
        int in = 156;
        byte by = 6;
        long lo = 465465;
        float fl = 12.23;
        double do = 123.33;
        char ch = '\u0000';
        boolean bool = false;
        String str = "string";

    }

    //Задача 3
    public static float task_3() {
        float a, b, c, d, result;
        a = 12f;
        b = 33f;
        c = -12f;
        d = 234.223f;
        result = a * (b + (c / d));
        System.out.println(result);
        return result;
    }


    public static boolean task_4(int a, int b) {
        boolean bool;
        int result = a + b;
        if (result >= 10 && result <= 20) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    public static void task_5(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean task_6(int a) {
        boolean bool;
        if (a < 0) {
            bool = true;

        } else {
            bool = false;
        }
        return bool;
    }

    public static void task_7(String name) {
        System.out.println("Hello " + name);
    }

    public static void task_8(int year) {
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не висакосный");
        }
    }
}
