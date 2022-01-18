package Day71;

public class SymmetricTree {
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

    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric2(root.left, root.right);
    }

    public static boolean isSymmetric2(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        return isSymmetric2(node1.left, node2.right) && isSymmetric2(node1.right, node2.left);
    }

//    class InvertBinaryTree {
//        public boolean check(TreeNode p, TreeNode q) {
//            // p and q are null
//            if (p == null && q == null) return true;
//            // one of p and q is null
//            if (q == null || p == null) return false;
//            if (p.val != q.val) return false;
//            return true;
//        }
//
//        public boolean isSameTree(TreeNode p, TreeNode q) {
//            if (p == null && q == null) return true;
//            if (!check(p, q)) return false;
//
//            // init deques
//            ArrayDeque<TreeNode> deqP = new ArrayDeque<TreeNode>();
//            ArrayDeque<TreeNode> deqQ = new ArrayDeque<TreeNode>();
//            deqP.addLast(p);
//            deqQ.addLast(q);
//
//            while (!deqP.isEmpty()) {
//                p = deqP.removeFirst();
//                q = deqQ.removeFirst();
//
//                if (!check(p, q)) return false;
//                if (p != null) {
//                    // in Java nulls are not allowed in Deque
//                    if (!check(p.left, q.left)) return false;
//                    if (p.left != null) {
//                        deqP.addLast(p.left);
//                        deqQ.addLast(q.left);
//                    }
//                    if (!check(p.right, q.right)) return false;
//                    if (p.right != null) {
//                        deqP.addLast(p.right);
//                        deqQ.addLast(q.right);
//                    }
//                }
//            }
//            return true;
//        }
//    }
}
