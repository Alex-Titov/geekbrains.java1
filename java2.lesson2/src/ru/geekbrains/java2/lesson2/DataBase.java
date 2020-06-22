package ru.geekbrains.java2.lesson2;

public class DataBase {

    static String[][] array = {
            {"5","7","5","17"},
            {"7","0","1","12"},
            {"8","1","2","3"},
            {"3","8","1","12"}
    };

    public static String[][] getArray() {
        return array;
    }

    public static void setArray(String[][] array) {
        DataBase.array = array;
    }


}
