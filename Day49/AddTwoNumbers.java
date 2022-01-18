package Day49;

public class AddTwoNumbers {
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
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        addTwoNumbers(node1, node4);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = l1.val;
        int num2 = l2.val;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null) {
            num1 = (num1 * 10) + l1.val;
            l1 = l1.next;
        }

        while (l2 != null) {
            num2 = (num2 * 10) + l2.val;
            l2 = l2.next;
        }
        int sum = num1 + num2;
        ListNode head = new ListNode(sum % 10);
        sum = sum / 10;
        ListNode pointerNode = head;
        while (sum != 0) {
            pointerNode.next = new ListNode(sum % 10);
            sum = sum / 10;
            pointerNode = pointerNode.next;
        }
        return head;
    }
}
