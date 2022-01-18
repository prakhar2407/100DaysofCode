package Day93.CodeforcesPluseOneSubset;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] elements = new int[N];
            for (int i = 0; i < elements.length; i++) {
                elements[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] > max) {
                    max = elements[i];
                }
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] < min) {
                    min = elements[i];
                }
            }
            System.out.println(max - min);
            T--;
        }
    }
}
