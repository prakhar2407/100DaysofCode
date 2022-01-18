package Day74;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class ConvertSortedArraytoBinarySearchTree {
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
        int[] arr = new int[]{0,1,2,3,4,5};
//        System.out.println(sortedArrayToBST(arr).val);
//        System.out.println(sortedArrayToBST(arr).left.val + " " + sortedArrayToBST(arr).right.val);
        System.out.println();
//        preOrder(sortedArrayToBST(arr));
//        System.out.println();
//        inOrder(sortedArrayToBST(arr));
//        System.out.println();
//        postOrder(sortedArrayToBST(arr));
        levelOrder(sortedArrayToBST(arr));
    }

    public static void levelOrder(TreeNode node) {
        Queue<TreeNode> treeNodeQueue = new ArrayDeque<>();
        treeNodeQueue.add(node);
        while (!treeNodeQueue.isEmpty()) {
            TreeNode node2 = treeNodeQueue.remove();
            System.out.print(node2.val + " ");
            if (node2.left != null) {
                treeNodeQueue.add(node2.left);
            }
            if (node2.right != null) {
                treeNodeQueue.add(node2.right);
            }
        }
    }

    public static void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    public static void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST2(nums, 0, nums.length - 1);
    }
    public static TreeNode sortedArrayToBST2(int[] nums, int left, int right) {
        if (left > right) return null;
        if (left == right) {
            TreeNode node1 = new TreeNode(nums[left]);
            return node1;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST2(nums, left, mid - 1);
        node.right = sortedArrayToBST2(nums, mid + 1, right);
        return node;
    }
}
