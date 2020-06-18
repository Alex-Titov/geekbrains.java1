package ru.geekbrains.java2.lesson2;

public class Main {

    public static void main(String[] args) {
        ArrayProcessing arrayProcessing = new ArrayProcessing();

        try {
            arrayProcessing.checkSize(DataBase.getArray());
            arrayProcessing.valueToInt(DataBase.getArray());
        } catch (MyArraySizeException e) {
            System.out.println(String.format("Array size is improper: %s", e.getMessage()));
        } catch (MyArrayDataException e) {
            System.out.println(String.format("Array value is not integer: %s", e.getMessage()));
        }
    }
}
