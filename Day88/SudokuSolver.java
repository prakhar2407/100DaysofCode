package Day88;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] arr = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(arr);
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.print(arr[i][j] + "|");
//            }
//            System.out.println();
//        }
    }

    public static void solveSudoku(char[][] board) {
        sudoku(board, 0, 0);
    }

    public static void sudoku(char[][] board, int i, int j) {
        if (j >= 9) {
            sudoku(board, i + 1, 0);
            return;
        }
        if (i >= 9) {
            for (int k = 0; k < 9; k++) {
                for (int l = 0; l < 9; l++) {
                    System.out.print(board[k][l] + "|");
                }
                System.out.println();
            }
            return;
        }
        if (board[i][j] == '.') {
            for (char k = '1'; k <= '9'; k++) {
                if (validateSudoku(board, i, j, k)) {
                    board[i][j] = k;
                    sudoku(board, i, j + 1);
                    board[i][j] = '.';
                }
            }
        } else {
            sudoku(board, i, j + 1);
        }
    }

    public static boolean validateSudoku(char[][] board, int ro, int co, char po) {
        char element = po;
        int countElementRow = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[ro][i] == element) {
                countElementRow++;
                if (countElementRow >= 1) {
                    return false;
                }
            }
        }

        int countElementCol = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][co] == element) {
                countElementCol++;
                if (countElementCol >= 1) {
                    return false;
                }
            }
        }

        int countElementBox = 0;
        int startRow = (ro / 3) * 3;
        int startCol = (co / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == element) {
                    countElementBox++;
                    if (countElementBox >= 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
