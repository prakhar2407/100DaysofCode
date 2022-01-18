package Day93.MakeAP;

import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            //Consider 0,1 in AP
            double ap3 = (double) b + (b - a);
            if ((double) ap3 % c == 0) {
                System.out.println("YES");
                continue;
            }

            //Consider 0,2 in AP
            double ap2 = (double) a + ((c - a) / 2);
            if ((double) ap2 % b == 0) {
                System.out.println("YES");
                continue;
            }

            //Consider 2,3 in AP
            double ap1 = (double) b - (c - b);
            if ((double) ap1 % a == 0) {
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
            T--;
        }
    }
}
