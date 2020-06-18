package ru.geekbrains.java2.lesson2;

public class ArrayProcessing {

    private static final int SIZE = 4;

    public void checkSize(String[][] matrix) {
        if (matrix.length != SIZE) {
            throw new MyArraySizeException(String.format("Array size [%s] is not equal to %s of array %s", matrix.length, SIZE, matrix));
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != SIZE) {
                throw new MyArraySizeException(String.format("Inner array size [%s] is not equal to %s of array %s", matrix[i].length, SIZE, matrix[i]));
            }
        }
    }

    public void valueToInt(String[][] matrix) {
        int val = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                try {
                    int integerVal = Integer.parseInt(matrix[i][j]);
                    val += integerVal;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Array value with index[%s][%s] contains no integer [%s]", i, j, matrix[i][j]));
                }
            }
        }
        System.out.println("Сумма чисел массива равна: " + val);
    }









//    public static void SumArray(String[][] array) throws MyArraySizeException{
//        try {
//           int n = array[0].length ;
//           int b = array[1].length ;
//        } catch (MyArraySizeException e){
//            System.out.println(e.getMessage());
//        }
//
//        int sum = 0;
//        for (int i = 0; array.length > i; i++) {  //идём по строкам
//            for (int j = 0; array.length > j; j++) {//идём по столбцам
//                sum += Integer.parseInt(array[i][j]);
//                System.out.print(" " + array[i][j] + " "); //вывод элемента
//            }
//            System.out.println();//перенос строки ради визуального сохранения табличной формы
//        }
//        System.out.println("Сумма чисел массива равна " + sum);
//    }
}
