package Day87;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }
    public static List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        paranthesis(n, 0, 0, "", ans);
        return ans;
    }
    public static void paranthesis (int n, int left, int right, String ans, ArrayList<String> arr) {
        if (left == n && right == n) {
            arr.add(ans);
            return;
        }
        if (left > n || right > n) {
            return;
        }
        paranthesis(n, left + 1, right, ans + "(", arr);
        if (left > right) {
            paranthesis(n , left, right + 1, ans + ")", arr);
        }
    }
}
