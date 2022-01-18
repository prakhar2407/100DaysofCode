package Day69;

public class RemoveDuplicatesFromSortedLinkedList {
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
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node4 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        node.next = node2;
        node2.next = node4;
        node4.next = node3;
        printLL(node);
        printLL(deleteDuplicates(node));
    }

    public static ListNode deleteDuplicates(ListNode head) {
         if (head == null || head.next == null) {
             return head;
         }
        ListNode curr = head;
        while (curr.next != null) {
            ListNode after = curr.next;
            while (curr.val == after.val) {
                if (after.next == null) {
                    curr.next = null;
                    return head;
                }
                after = after.next;
            }
            curr.next = after;
            curr = curr.next;
        }
        return head;
    }

    public static void printLL(ListNode head) {
        System.out.println();
         while (head != null) {
             System.out.print(head.val + " ");
             head = head.next;
         }
    }
}
