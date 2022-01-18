package Day100;

import java.util.ArrayDeque;
import java.util.Queue;

public class DeepestLeavesSum {
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
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node8 = new TreeNode(8, null, null);
        TreeNode node4 = new TreeNode(4, node7, null);
        TreeNode node5 = new TreeNode(5, null, null);
        TreeNode node6 = new TreeNode(6, null, node8);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3, null, node6);
        TreeNode node1 = new TreeNode(1,node2, node3);
//        System.out.println(treeHeight(node1));
        System.out.println(deepestLeavesSum(node1));
    }

//    public static int deepestLeavesSum(TreeNode root) {
//        int height = treeHeight(root);
//        return deepestLeavesSum2(root, height - 1, 0);
//    }
//
//    public static int deepestLeavesSum2(TreeNode root, int height, int countHeight) {
//        if (root == null) {
//            return 0;
//        }
//        if (countHeight == height && root.left == null && root.right == null) {
//            return root.val;
//        }
//        int left = deepestLeavesSum2(root.left, height, countHeight + 1);
//        int right = deepestLeavesSum2(root.right, height, countHeight + 1);
//        return left + right;
//    }
//
//    public static int treeHeight(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int leftHeight = treeHeight(root.left);
//        int rightHeight = treeHeight(root.right);
//        int finalHeight = Math.max(leftHeight + 1, rightHeight + 1);
//        return finalHeight;
//    }

    public static int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> hlprQ = new ArrayDeque<>();
        hlprQ.add(root);
        int levelSum = 0;
        while (!hlprQ.isEmpty()) {
            levelSum = 0;
            int size = hlprQ.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = hlprQ.peek();
                if (node.left != null) {
                    hlprQ.add(node.left);
                }
                if (node.right != null) {
                    hlprQ.add(node.right);
                }
                levelSum += hlprQ.poll().val;
            }
        }
        return levelSum;
    }
}
