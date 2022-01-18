package Day77;

import com.sun.source.tree.Tree;

public class PathSum {
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
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node8 = new TreeNode(8);
        TreeNode node11 = new TreeNode(11);
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node13 = new TreeNode(13);
        TreeNode node4_2 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1);
        node5.left = node4;
        node5.right = node8;
        node4.left = node11;
        node11.left = node7;
        node11.right = node2;
        node8.left = node13;
        node8.right = node4_2;
        node4_2.right = node1;
//        System.out.println(true && false);
//        System.out.println(true || false);
        System.out.println(hasPathSum(node5, 22));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return sum (root, targetSum, 0);
    }

    public static boolean sum (TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return false;
        }
        sum = sum + root.val;
        boolean leftResult = sum (root.left, targetSum, sum);
        if ((root.left == null && root.right == null) && (sum == targetSum)) {
            return true;
        }
        boolean rightResult = sum (root.right, targetSum, sum);
        if ((root.left == null && root.right == null) && (sum == targetSum)) {
            return true;
        }
        return leftResult || rightResult ;
    }
}
