package Day94;

public class PickFromBothSides {
    public static void main(String[] args) {
        PickFromBothSides pfbs = new PickFromBothSides();
        int[] arr = new int[] {5,-2,3,1,2};
        System.out.println(pfbs.solve(arr, 3));
    }
    public int solve(int[] A, int B) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        int minSum = Integer.MAX_VALUE;
        int i = 0, j = A.length - B - 1;
        int currSum = 0;
        for (int k = i; k <= j; k++) {
            currSum += A[k];
        }
        if (currSum < minSum) {
            minSum = currSum;
        }

        while (j < A.length - 1) {
            currSum = (currSum - A[i]) + A[j + 1];
            if (currSum < minSum) {
                minSum = currSum;
            }
            i++;
            j++;
        }
        return sum - minSum;
    }
}
