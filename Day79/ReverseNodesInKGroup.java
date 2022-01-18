package Day79;

public class ReverseNodesInKGroup {
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
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        System.out.println(countNode(node1));
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        int lengthLL = countNode(head);
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy , nex = dummy, pre = dummy;
        while(lengthLL >= k){
            cur = pre.next;
            nex = cur.next;
            for(int i = 1; i < k; i++){
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            lengthLL-=k;
        }
        return dummy.next;
    }

    public static int countNode(ListNode head) {
        int countNodes = 0;
        ListNode curr = head;
        while (curr != null) {
            countNodes++;
            curr = curr.next;
        }
        return countNodes;
    }

}
