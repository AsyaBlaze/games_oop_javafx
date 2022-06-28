package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board) {
        boolean result = true;
        int counter = 0;
        for (int k = 0; k < board.length; k++) {
            for (int i = 0; i < board.length; i++) {
                if ((board[k][i] != 1)  && (counter < 5)) {
                    result = false;
                    break;
                } else {
                    counter++;
                    result = true;
                }
            }
        }

        return result;
    }
    public static boolean monoVertical(int[][] board) {
        boolean result = true;
        int counter = 0;
        for (int k = 0; k < board.length; k++) {
            for (int i = 0; i < board.length; i++) {
                if ((board[i][k] != 1) && (counter < 5)) {
                    result = false;
                    break;
                } else {
                    counter++;
                    result = true;
                }
            }
        }

        return result;
    }

    public static boolean check(int[][] board) {
        boolean result = false;
        if (monoHorizontal(board) || monoVertical(board)) {
            result = true;
        }
        return result;
    }
}
