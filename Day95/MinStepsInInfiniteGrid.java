package Day95;

public class MinStepsInInfiniteGrid {
    public static void main(String[] args) {
        int[] A = {0, 1, 1};
        int[] B = {0, 1, 2};
        MinStepsInInfiniteGrid m = new MinStepsInInfiniteGrid();
        System.out.println(m.coverPoints(A,B));
    }
    public int coverPoints(int[] A, int[] B) {
        int steps = 0;
        for (int i = 1; i < A.length; i++) {
            steps += Math.max(Math.abs(A[i] - A[i - 1]), Math.abs(B[i] - B[i - 1]));
        }
        return steps;
    }
}
