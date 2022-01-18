//package Day9;
//import
//
//public class RemoveNodeWithValue {
//    public static void main(String[] args) {
//
//    }
//    public static Node removeNodes(Node node, int value) {
//        if (node == null) {
//            return null;
//        }
//        if (node.data == value) {
//            return null;
//        }
//        Node resultNode = node;
//        node.left = removeNodes(node.left, value);
//        node.right = removeNodes(node.right, value);
//        return resultNode;
//    }
//}
