import java.util.HashMap;

public class UniquePaths {
    public static void main(String[] args) {
        UniquePaths up = new UniquePaths();
        System.out.println(up.uniquePaths(10,10));
    }
//    public int uniquePaths(int m, int n) {
//        int[][] arr = new int[m][n];
//        return pathsHelper(0,0,m-1,n-1, arr);
//    }

    public static int pathsHelper(int sr, int sc, int er, int ec, int[][] arr) {
        if (sr == er && sc == ec) {
            return 1;
        }
        if (sr > er || sc > ec) {
            return 0;
        }
        if (arr[sr][sc] != 0) {
            return arr[sr][sc];
        }
        int ans1 = pathsHelper(sr + 1, sc, er, ec, arr);
        int ans2 = pathsHelper(sr, sc + 1, er, ec, arr);
        return arr[sr][sc] = ans1 + ans2;
    }

    public int uniquePaths(int m, int n) {
        int totalValues = n + m - 2; // Total Numbers of possible directions
        int dir = m - 1; //Only the right direction ones from total
        double res = 1;
        // Total values chooses single dir meaning C(totalValues,dir)
        for (int i = 1; i <= dir; i++) {
            res = res * (totalValues - dir + i) / i;
        }
        return (int) res;
    }


}
