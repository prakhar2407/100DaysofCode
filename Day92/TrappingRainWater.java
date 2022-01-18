package Day92;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(new TrappingRainWater().trap(new int[] {4,2,0,3,2,5}));
    }
    public int trap(int[] height) {
        int maxL = 0;
        int maxR = 0;
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        while (left < right) {
            if (height[left] > maxL) {
                maxL = height[left];
            }
            if (height[right] > maxR) {
                maxR = height[right];
            }
            if (height[left] <= height[right]) {
                if (height[left] < maxL) {
                    ans = ans + (Math.min(maxL, height[right]) - height[left]);
                }
                left++;
            }
            else {
                if (height[right] < maxR) {
                    ans = ans + (Math.min(maxR, height[left]) - height[right]);
                }
                right--;
            }
        }
        return ans;
    }
}
