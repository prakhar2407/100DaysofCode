package Day48;

import java.util.HashMap;

public class SubarrayWithGivenXOR {
    public static void main(String[] args) {
        System.out.println(new SubarrayWithGivenXOR().solve(new int[] {4,2,2,6,4}, 6));
    }
    public int solve(int[] A, int B) {
        int XOR = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            XOR = XOR ^ A[i];
            if (XOR == B) {
                count++;
            }
            else if (map.containsKey(XOR ^ B)) {
                count = count + map.get(XOR ^ B);
            }
            if (map.containsKey(XOR)){
                int oldValue = map.get(XOR);
                map.put(XOR, oldValue + 1);
            }
            else {
                map.put(XOR, 1);
            }
        }
        return count;
    }
}
