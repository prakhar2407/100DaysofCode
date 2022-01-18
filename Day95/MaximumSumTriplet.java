package Day95;

import java.util.ArrayList;
import java.util.TreeSet;

public class MaximumSumTriplet {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 8, 10, 0};
        System.out.println(new MaximumSumTriplet().solve(arr));
    }
    public int solve(int[] A) {
        int n= A.length;
        int suffix[]= new int[n];
        suffix[n-1]= A[n-1];
        for(int i=n-2;i>=0;i--)
            suffix[i]= Math.max(A[i], suffix[i+1]);

        int ans=0;
        TreeSet<Integer> set= new TreeSet<>();
        set.add(A[0]);

        for(int i=1;i<n-1;i++){
            set.add(A[i]);
            Integer left= set.lower(A[i]);
            int right= suffix[i];
            if(right!=A[i] && left!=null)
                ans= Math.max(ans,left+A[i]+right);
        }

        return ans;
    }
}
