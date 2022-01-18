package Day83;

import java.util.ArrayList;
import java.util.List;

public class PallindromeLinkedList {
    public class ListNode {
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

    }

    public boolean isPalindrome(ListNode head) {
        Boolean answer = false;
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            arrayList.add(curr.val);
            curr = curr.next;
        }
        int i = 0;
        int j = arrayList.size() - 1;
        while (i <= j) {
            if (arrayList.get(i) != arrayList.get(j)) {
                answer = false;
                return answer;
            }
            i++;
            j--;
        }
        return true;
    }
}
