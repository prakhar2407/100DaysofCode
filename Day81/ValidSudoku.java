//package Day81;
//
//import java.util.HashMap;
//import java.util.HashSet;
//
//public class ValidSudoku {
//    public static void main(String[] args) {
//        String[][] arr = {{"5", "3", ".", ".", "7", ".", ".", ".", "."}
//                , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
//                , {".", "9", "8", ".", ".", ".", ".", "6", "."}
//                , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
//                , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
//                , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
//                , {".", "6", ".", ".", ".", ".", "2", "8", "."}
//                , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
//                , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};
//        System.out.println(new ValidSudoku().isValidSudoku(arr));
//    }
//
//    public boolean isValidSudoku(char[][] board) {
//        HashSet<String> helperSet = new HashSet<>();
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                if (board[i][j] == '.') {
//                    continue;
//                }
//                if (helperSet.contains("ROW+" + i + "+" + board[i][j]) || helperSet.contains("COL+" + j + "+" + board[i][j]) || helperSet.contains("BOX+" + i / 3 + "+" + j / 3 + "+" + board[i][j])) {
//                    return false;
//                }
//                helperSet.add("ROW+" + i + "+" + board[i][j]);
//                helperSet.add("COL+" + j + "+" + board[i][j]);
//                helperSet.add("BOX+" + i / 3 + "+" + j / 3 + "+" + board[i][j]);
//            }
//        }
//        return true;
//    }
//}
