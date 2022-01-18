package Day95;

public class LeetcodeContest275Q1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,1,2},{2,3,1}};
        System.out.println(new LeetcodeContest275Q1().checkValid(arr));
    }

    public boolean checkValid(int[][] matrix) {
        int sum = (matrix.length * (matrix.length + 1)) / 2;
        for (int i = 0; i < matrix.length; i++) {
            int currSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                currSum += matrix[i][j];
            }
            if (currSum != sum) {
                return false;
            }
        }

        for (int j = 0; j < matrix.length; j++) {
            int currSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                currSum += matrix[i][j];
            }
            if (currSum != sum) {
                return false;
            }
        }
        return true;
    }
}
