package Day54;

public class CheckPathExists {
    public static void main(String[] args) {
        int[][] edges = {{0,1},{1,2},{2,0}};
        System.out.println(validPath(3, edges, 0, 2));
    }
    public static boolean validPath(int n, int[][] edges, int start, int end) {
        if (start == end) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                if (edges[i][j] == start) {
                    return validPath(n, edges, j,end);
                }
                if (edges[j][i] == start) {
                    return validPath(n, edges, i, end);
                }
            }
        }
        return false;
    }
}
