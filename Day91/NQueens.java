package Day91;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        ArrayList<String> map = new ArrayList<>();
        String row = "";
        for (int i = 0; i < n; i++) {
            row = row + '.';
        }
        for (int i = 0; i < n; i++) {
            map.add(row);
        }
        nQueens(n, 0, map,ans);
        return ans;
    }

    public static void nQueens(int n, int col, ArrayList<String > childChessMap, List<List<String>> parentChessMap) {
        if (col >= n) {
            parentChessMap.add(childChessMap);
            System.out.println(parentChessMap);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (validateBoard(childChessMap, row, col, n)) {
                String res = childChessMap.get(row);
                res = res.substring(0,col) + 'Q' + res.substring(col + 1);
                childChessMap.set(row, res);
                nQueens(n, col + 1, childChessMap, parentChessMap);
                String remove = "";
                for (int i = 0; i < n; i++) {
                    remove = remove + '.';
                }
                childChessMap.set(row, remove);
            }
        }
    }

    public static boolean validateBoard(ArrayList<String> chessMap, int row, int col, int n) {
        int tempRow = row;
        int tempCol = col;
        while (tempCol >= 0 && tempRow >= 0) {
            if (chessMap.get(tempRow).charAt(tempCol) == 'Q') {
                return false;
            }
            tempCol--;
            tempRow--;
        }

        tempCol = col;
        tempRow = row;
        while (tempCol >= 0) {
            if (chessMap.get(tempRow).charAt(tempCol) == 'Q') {
                return false;
            }
            tempCol--;
        }

        tempCol = col;
        tempRow = row;
        while (tempCol >= 0 && tempRow < n) {
            if (chessMap.get(tempRow).charAt(tempCol) == 'Q') {
                return false;
            }
            tempCol--;
            tempRow++;
        }
        return true;
    }
}
