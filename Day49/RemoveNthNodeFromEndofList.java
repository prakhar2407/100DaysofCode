package Day49;

public class RemoveNthNodeFromEndofList {
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
//        ListNode node6 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
//        node5.next = node6;
        printList(node1);
        printList(removeNthFromEnd(node1,5));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode helperNode = new ListNode(0,head);
        ListNode fastPointer = helperNode;
        ListNode slowPointer = helperNode;
        int count = 0;
        while (count < n) {
            fastPointer = fastPointer.next;
            count++;
        }
        if (fastPointer.next == null) {
            head = slowPointer.next.next;
            return head;
        }
        while (fastPointer.next != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = slowPointer.next.next;
        return head;
    }

    public static void printList(ListNode head) {
        while (head.next != null) {
            System.out.print(head.val + "==>");
            head = head.next;
        }
        System.out.println(head.val);
    }
}
