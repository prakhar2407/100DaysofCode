package Day70;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.right = t2;
        t2.left = t3;
        System.out.println(inorderTraversal(t1));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            List<Integer> dummyList = new ArrayList<>();
            return dummyList;
        }
        List<Integer> arr = new ArrayList<>();
        inorderTraversal(root.left);
        arr.add(root.val);
        inorderTraversal(root.right);
        return arr;
    }
}
