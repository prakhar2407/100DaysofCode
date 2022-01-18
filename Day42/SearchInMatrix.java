package Day42;

public class SearchInMatrix {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[i].length - 1;
        while (i < matrix.length && j > -1) {
            if (matrix[i][j] == target) {
                return true;
            }
            else {
                if (matrix[i][j] > target) {
                    j--;
                }
                else {
                    i++;
                }
            }
        }
        return false;
    }
}
