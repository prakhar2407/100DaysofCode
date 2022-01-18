package Day29;

import java.util.ArrayList;
import java.util.List;

public class PascalTriange {
    public static void main(String[] args) {
        PascalTriange pt = new PascalTriange();
        System.out.println(pt.generate(10));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rowList = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            List<Integer> colList = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                colList.add(fact(row) / (fact(col) * fact(row - col)));
            }
            rowList.add(colList);
        }
        return rowList;
    }

    public int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
