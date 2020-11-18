package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean res = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                return false;
            }
        }
        return res;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean res = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                return false;
            }
        }
        return res;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] res = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            res[i] = board[i][i];
        }
        return res;
    }

    public static boolean isWin(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                return monoVertical(board,  i) || monoHorizontal(board, i);
            }
        }
        return false;
    }

}
