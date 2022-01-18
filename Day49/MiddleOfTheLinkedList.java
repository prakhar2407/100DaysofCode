package Day49;

public class MiddleOfTheLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        System.out.println(middleNode(node1).val);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode oneStepNode = head;
        ListNode twoStepNode = head;
        while (twoStepNode.next != null && twoStepNode.next.next != null) {
            twoStepNode = twoStepNode.next.next;
            oneStepNode = oneStepNode.next;
        }
        if (twoStepNode.next != null) {
            return oneStepNode.next;
        }
        return oneStepNode;
    }

}
