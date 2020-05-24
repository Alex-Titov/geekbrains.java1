package ru.geekbrains.java1.lesson4_1_1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * Tic Tac Toe
     * <p>
     * 1. Инициализровать игровое поле
     * 2. Игрок - Х, Компьютер - О
     * 3. Игрок всегда ходит первый
     * 4. Реализовать ход игрока по координатам [X, Y]
     * 5. Реализовать ход компьютера по координатам [X, Y]
     * 6. Защита от неверных координат [X, Y] введенных игроком
     * 7. Защита от попытки ввести координаты [X, Y] в уже занятую ячейку
     * 8. Игра до победы
     * 9. Проверка победы
     * 10. Победа
     * 11. Проверка ничьи TODO
     */

// Вызываем метод, запускающий игру
    public static void main(String[] args) {
        playTicTacToe();
    }

    //Основной игровой код в этом методе
    static void playTicTacToe() {
        char[][] field = getField();
        drawField(field);
//Создаем переменные, в которых хранятся символы игроков.
        char playerSign = 'X';
        char computerSign = 'O';
//Создаем переменную для текущего игрока, и присваиваем ей символ Х, так как игрок ходит первым
        char currentPlayerSign = playerSign;
//Создаем переменную с именем игрока, и записываем в нее "Player", так как игрок ходит первым
        String currentPlayerName = "Player";

//Создаем булеву переменную, которая отвечает за определение, была ли победа, то есть по сути, она определяет конец игры
        boolean isWin = false;
        boolean isDraw = false;
//Основной игровой цикл
        do {
//Метод, в котором происходит ход
            move(field, currentPlayerSign);
//Переменная, в которую записывается была ли победа, если да, то конец игры
            isWin = checkWin(field, currentPlayerSign);
            isDraw = checkDraw(field);
//Меняем значение переменной с текущего игрока на другово, при условии, что победа не достигнута. И отрисовываем поле.
            if (!isWin) {
                currentPlayerSign = currentPlayerSign == playerSign ? computerSign : playerSign;
                currentPlayerName = currentPlayerSign == playerSign ? "Саша" : "Computer";
                drawField(field);
            }
            //TODO Проверка на ничью
        } while (!isWin && !isDraw);

//Вывод в консоль поздравления с победой
        if (isWin) {
            System.out.println(String.format("Congrats!!! You are winner Mr. %s", currentPlayerName));
        } else if (isDraw) {
            System.out.println("Nobody win!");
        }

        drawField(field);
    }

    // Метод, который определяет, какой игрок ходит.
    static void move(char[][] field, char currentPlayerSign) {
        if (currentPlayerSign == 'X') {
            movePlayerSign(field, currentPlayerSign);
        } else {
            moveComputer(field, currentPlayerSign);
        }
    }

    //Метод, проверяющий победу
    static boolean checkWin(char[][] field, char currentPlayerSign) {
        if (checkHorizontalWin(field, currentPlayerSign)) {
            return true;
        }
        if (checkVerticalWin(field, currentPlayerSign)) {
            return true;
        }
        //TODO Diagonal СДЕЛАНО
        if (checkDiagonalWin(field, currentPlayerSign)) {
            return true;
        }
        return false;
    }

    //Метод проверяющий, есть ли победа по горизонтали
    static boolean checkHorizontalWin(char[][] field, char currentPlayerSing) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == currentPlayerSing && field[i][1] == currentPlayerSing && field[i][2] == currentPlayerSing) {
                return true;
            }
        }
        return false;
    }

    //Метод, проверяющий, есть ли победа по вертикали
//    static boolean checkVerticalWin(char[][] field, char currentPlayerSing) {
//        // TODO Улучшить до цикла. Сделано, код ниже
//        if (field[0][0] == currentPlayerSing && field[1][0] == currentPlayerSing && field[2][0] == currentPlayerSing) {
//            return true;
//        }
//        if (field[0][1] == currentPlayerSing && field[1][1] == currentPlayerSing && field[2][1] == currentPlayerSing) {
//            return true;
//        }
//        if (field[0][2] == currentPlayerSing && field[1][2] == currentPlayerSing && field[2][2] == currentPlayerSing) {
//            return true;
//        }
//        return false;
//    }


    //Метод, проверяющий, есть ли победа по вертикали, улучшенный до цикла
    static boolean checkVerticalWin(char[][] field, char currentPlayerSing) {
        char isDraw = '-';
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == currentPlayerSing && field[1][i] == currentPlayerSing && field[2][i] == currentPlayerSing) {
                    return true;
            }
        }
        return false;
    }



    //Метод, проверяющий победу по диагонали
    static boolean checkDiagonalWin(char[][] field, char currentPlayerSing) {
        //TODO СДЕЛАНО
        if (field[0][0] == currentPlayerSing && field[1][1] == currentPlayerSing && field[2][2] == currentPlayerSing) {
            return true;
        }
        if (field[0][2] == currentPlayerSing && field[1][1] == currentPlayerSing && field[2][0] == currentPlayerSing) {
            return true;
        }
        return false;
    }

    //Метод, в котором происходит ход компьютера
    static void moveComputer(char[][] field, char computerSign) {
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellEmpty(field, x, y));

        System.out.println("Computer's move ...");
        System.out.println(String.format("Computer decided choose coordinates [%s, %s]", x + 1, y + 1));
        field[x][y] = computerSign;
    }

    //Метод, в котором происходит ход игрока
    static void movePlayerSign(char[][] field, char playerSign) {
        int x;
        int y;
        boolean isEmptyCell;

        do {
            boolean isCorrectCoordinates;
            do {
//игрок вводит координаты своего хода
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input X-coordinates [1, 2, 3]");
                x = scanner.nextInt() - 1;
                System.out.println("Input Y-coordinates [1, 2, 3]");
                y = scanner.nextInt() - 1;

                isCorrectCoordinates = checkCoordinates(x, y);
                notifyIncorrectCoordinates(isCorrectCoordinates);
            } while (!isCorrectCoordinates);

            isEmptyCell = isCellEmpty(field, x, y);
            notifyOccupiedCell(isEmptyCell, x, y);
        } while (!isCellEmpty(field, x, y));

        field[x][y] = playerSign;
    }

    // Метод проверяет, занята ли ячейка
    static boolean isCellEmpty(char[][] field, int x, int y) {
        return field[x][y] == '-';
    }

    // вывод сообщения в консоль, о том, что ячейка уже занята
    static void notifyOccupiedCell(boolean isOccupied, int x, int y) {
        if (!isOccupied) {
            System.out.println(String.format("Input coordinates are incorrect. Cell of coordinates [%s, %s] is already occupied", x, y));
        }
    }

    // метод выводящий в консоль предупреждение, если введены не корректные данные
    static void notifyIncorrectCoordinates(boolean isCorrect) {
        if (!isCorrect) {
            System.out.println("Input coordinates are incorrect. Available coordinates in range [1, 2, 3]");
        }
    }

    //Метод проверяющий, что бы игрок вводил корректные данные
    static boolean checkCoordinates(int x, int y) {
        return (x >= 0 && x <= 2) && (y >= 0 && y <= 2);
    }

    // Метод выводящий на печать игровое поле
    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    // Иницилизируем игровое поле
    static char[][] getField() {
        return new char[][]{
                {'O', 'X', 'O'},
                {'-', '-', '-'},
                {'X', 'O', 'X'}
        };
    }


    //Метод, проверяющий ничью
    static boolean checkDraw(char[][] field) {
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != '-') {
                    count++;
                }
            }
        }

        if (count == 9) {
            return true;
        }
        return false;
    }
}