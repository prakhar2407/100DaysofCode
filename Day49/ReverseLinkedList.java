package Day49;
public class ReverseLinkedList {
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
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        printList(node1);
        reverseList(node1);
        printList(node5);
    }

    public static ListNode reverseList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode = currNode.next;
        while (currNode.next != null) {
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            nextNode = currNode.next;
        }
        currNode.next = prevNode;
        head = currNode;
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

