package Day50;

public class IntersectionOfTwoLinkedList {
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
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0;
        ListNode dummyA = headA;
        while (dummyA != null) {
            dummyA = dummyA.next;
            countA++;
        }

        int countB = 0;
        ListNode dummyB = headB;
        while (dummyB != null) {
            dummyB = dummyB.next;
            countB++;
        }

        int diff = Math.abs(countA - countB);
        if (countA > countB) {
            int countStart = 0;
            while (countStart != diff) {
                headA = headA.next;
                countStart++;
            }
        }
        else if (countB > countA){
            int countStart = 0;
            while (countStart != diff) {
                headB = headB.next;
                countStart++;
            }
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
