package Day86;

import java.util.Arrays;

public class WeightedJobProblem {
    static class Job implements Comparable<Job> {
        int startTime;
        int endTime;
        int price;

        public Job(int startTime, int endTime, int price) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.price = price;
        }

        @Override
        public int compareTo(Job o) {
            if (this.endTime > o.endTime) {
                return 1;
            }
            else if (this.endTime < o.endTime) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        int[] startTime = {1, 2, 3, 4, 6};
        int[] endTime = {3, 5, 10, 6, 9};
        int[] profit = {20, 20, 100, 70, 60};
        System.out.println(jobScheduling(startTime, endTime, profit));
    }
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Job[] jobArray = new Job[startTime.length];
        int[] hlprArr = new int[jobArray.length];
        for (int i = 0; i < startTime.length; i++) {
            Job job = new Job(startTime[i], endTime[i], profit[i]);
            jobArray[i] = job;
        }
        Arrays.sort(jobArray);
        for (int i = 0; i < hlprArr.length; i++) {
            hlprArr[i] = jobArray[i].price;
        }
        for (int i = 1; i < hlprArr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (jobArray[i].startTime >= jobArray[j].endTime) {
                    hlprArr[i] = Math.max(hlprArr[j] + jobArray[i].price, hlprArr[i]);
                }
            }
            hlprArr[i] = Math.max(hlprArr[i],hlprArr[i - 1]);
        }
        return hlprArr[hlprArr.length - 1];
    }
}
