package Day86;

import java.util.Scanner;

public class SaveEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int i = 0;
        int totalEnergy = 0;
        for (int j = 1; j < N - 1; j++) {
            if (A[j] < 0) {
                totalEnergy += calculateEnergy(j, i, A);
                i = j;
            }
        }
        int energy = calculateEnergy(N - 1, i, A);
        totalEnergy += energy;
        System.out.println(totalEnergy);
    }

    public static int calculateEnergy(int j, int i, int[] A) {
        int leftEquation = (j - i) * A[i];
        int rightEquation = (int) ((Math.pow(j,2) - Math.pow(i,2)) * Math.pow(A[i],2));
        return leftEquation + rightEquation;
    }
}
