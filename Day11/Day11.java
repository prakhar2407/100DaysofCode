package Day11;

import java.util.ArrayList;

public class Day11 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    public static Node createBst(int[] arr, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        Node node = new Node(arr[mid]);
        node.left = createBst(arr,low,mid - 1);
        node.right = createBst(arr,mid + 1,high);
        return node;
    }

    public static boolean findBst (Node node, int numberToFind) {
        if (node == null) {
            return false;
        }
        boolean result = false;
        if (numberToFind > node.data) {
            result = findBst(node.right,numberToFind);
        }
        else if (numberToFind < node.data) {
            result = findBst(node.left,numberToFind);
        }
        else {
            result = true;
        }
        return result;
    }

    public static void addNode(Node node, int data) {
        if (node == null) {
            return;
        }
        Node nodeToAdd = new Node(data);
        if (data > node.data) {
            addNode(node.right,data);
        }
        else {
            addNode(node.left,data);
        }
        if (node.left == null && data <= node.data) {
            node.left = nodeToAdd;
        }
        else if (node.right == null && data > node.data ){
            node.right = nodeToAdd;
        }
    }

    public static void displayBST(Node node) {
        if (node == null) {
            return;
        }
        String str = "";
        if (node.left == null) {
            str += " . ";
        }
        else {
            str += node.left.data;
        }
        str += " <== " + node.data + " ==> ";
        if (node.right == null) {
            str += " . ";
        }
        else {
            str += node.right.data;
        }
        System.out.println(str);
        displayBST(node.left);
        displayBST(node.right);
    }

    public static void removeNode(Node node,Node parent, boolean isLeft, int item) {
        if (node == null) {
            return;
        }
        if (item > node.data) {
            removeNode(node.right, node, false, item);
        }
        else if (item < node.data) {
            removeNode(node.left, node, true, item);
        }
        else {
            if (node.left == null && node.right == null) {
                if (isLeft) {
                    parent.left = null;
                }
                else {
                    parent.right = null;
                }
            }
            else if (node.left == null) {
                if (isLeft) {
                    parent.left = node.right;
                }
                else {
                    parent.right = node.right;
                }
            }
            else if (node.right == null) {
                if (isLeft) {
                    parent.left = node.left;
                }
                else {
                    parent.right = node.left;
                }
            }
            else {
                int maxNum = maxNode(node.left);
                node.data = maxNum;
                removeNode(node.left, node, true, maxNum);
            }
        }
    }

    public static void allOrdersTraversal(Node node,ArrayList<Integer> inOrder) {
        if (node == null) {
            return;
        }
        allOrdersTraversal(node.left,inOrder);
        inOrder.add(node.data);
        allOrdersTraversal(node.right,inOrder);
    }

    public static int maxNode(Node node) {
        if (node.right == null) {
            return node.data;
        }
        else {
            return maxNode(node.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        Node root = createBst(arr,0, arr.length - 1);
//        displayBST(root);
//        addNode(root,55);
//        addNode(root,45);
//        addNode(root,95);
//        addNode(root,94);
        ArrayList<Integer> inOrder = new ArrayList<>();
        allOrdersTraversal(root,inOrder);
        displayBST(root);
//        System.out.println(maxNode(root));
        removeNode(root,null,false, 30);
        removeNode(root,null,false, 20);
        removeNode(root,null,false, 60);
        removeNode(root,null,false, 50);
        System.out.println();
        System.out.println("------------------------");
        System.out.println();
        displayBST(root);
    }


}
