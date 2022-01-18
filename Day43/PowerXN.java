package Day43;

public class PowerXN {
    public static void main(String[] args) {
        PowerXN pwr = new PowerXN();
        System.out.println(pwr.myPow(2.0000,-2));

    }
    public double myPow(double x, int n) {
        double ans = 1.0;
        long n2 = n;
        if (n2 < 0) {
            n2 = -1 * n2;
        }
        while (n2 != 0) {
            if (n2 % 2 == 0) {
                x = x * x;
                n2 = n2 / 2;
            }
            else {
                ans *= x;
                n2--;
            }
        }
        if (n < 0) {
            return 1 / ans;
        }
        else {
            return ans;
        }
    }
}
