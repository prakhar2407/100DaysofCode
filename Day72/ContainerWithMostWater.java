package Day72;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,4};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while (i < j) {
            int currArea = (j - i) * Math.min(height[i],height[j]);
            if (currArea > maxArea) {
                maxArea = currArea;
            }
            if (height[i] >= height[j]) {
                j--;
            }
            else {
                i++;
            }
        }
        return maxArea;
    }
}
