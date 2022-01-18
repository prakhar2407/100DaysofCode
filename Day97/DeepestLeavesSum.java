package Day97;

public class DeepestLeavesSum {
    public class TreeNode {
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

    public int deepestLeavesSum(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }
        if (root.left == null || root.right == null) {
            return 0;
        }
        int leftSum = deepestLeavesSum(root.left);
        int rightSum = deepestLeavesSum(root.right);
        return leftSum + rightSum;
    }
    public void deepestLeavesSum(TreeNode root, int sum) {

    }
}
