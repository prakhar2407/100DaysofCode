package Day94.OnlineAssessment;

import java.util.Arrays;

public class PrisonCell {
    public static void main(String[] args) {
        PrisonCell prisonCell = new PrisonCell();
        int[] arr = new int[] {1,0,0,1,0,0,1,0};
        int days = 1000000000;
        System.out.println(Arrays.toString(prisonCell.prisonAfterNDays(arr, days)));
    }
    public int[] prisonAfterNDays(int[] cells, int n) {
        int[] refArr = new int[cells.length];
        for (int i = 0; i < cells.length; i++) {
            refArr[i] = cells[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cells.length; j++) {
                if (j == 0) {
                    if (refArr[j] == 1) {
                        cells[j] = 0;
                    }
                }
                else if (j == cells.length - 1) {
                    if (refArr[j] == 1) {
                        cells[j] = 0;
                    }
                }
                else {
                    if (refArr[j - 1] == 1 && refArr[j + 1] == 1) {
                        cells[j] = 1;
                    }
                    else if (refArr[j - 1] == 0 && refArr[j + 1] == 0) {
                        cells[j] = 1;
                    }
                    else if (refArr[j] == 1) {
                        cells[j] = 0;
                    }
                }
            }
            for (int k = 0; k < cells.length; k++) {
                refArr[k] = cells[k];
            }
        }
        return cells;
    }
}
