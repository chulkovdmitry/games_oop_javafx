package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int ind = 0; ind < board.length; ind++) {
            if (board[ind][ind] == 1 && (monoHorizontal(board, ind) || monoVertical(board, ind))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int row){
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(int[][] board, int col) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
