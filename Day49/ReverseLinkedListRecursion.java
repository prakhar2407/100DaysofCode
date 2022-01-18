package Day49;

import java.util.prefs.NodeChangeEvent;

public class ReverseLinkedListRecursion {
    static class ListNode {
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
//        printList(reverseList2(node1));
        printList(reverseList(node1));
        printList(reverse(node1));

    }

    public static ListNode reverseList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode headNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return headNode;
    }

    public static ListNode reverseList2(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode Newnode=reverseList2(head.next);
        ListNode nextNode=head.next;
        nextNode.next=head;
        head.next=null;
        return Newnode;
    }

    static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        ListNode headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }

    public static void printList(ListNode head) {
        while (head.next != null) {
            System.out.print(head.val + "==>");
            head = head.next;
        }
        System.out.println(head.val);
    }
}
