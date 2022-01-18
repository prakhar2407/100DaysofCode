package Day75;


public class BalancedBinaryTree {
    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public static void main(String[] args) {

    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if ((Math.abs(leftHeight - rightHeight) > 1) && !isBalanced(root.left) && !isBalanced(root.right)) {
            return false;
        }
        return true;
    }
    public static int height(TreeNode root) {
        if (root == null) {
            return 1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
