package day_2;

public class SwappingNodesinaLinkedList_1721 {
    
}

class Solution_0 {
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        for (var curr = head; curr != null; curr = curr.next, ++len);
        ListNode curr = head, a = null, b = null;
        for (var i = 1; i <= len; i++, curr = curr.next) {
            if (i == k) a = curr;
            if (i == len + 1 - k) b = curr;
        }
        int c = a.val; a.val = b.val; b.val = c; // swapping
        return head;
    }
}

class Solution_1 {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head, n1 = head, n2 = head;
        for (int i = 1; i < k; i++, fast = fast.next, n1 = n1.next);
        for (; fast.next != null; fast = fast.next, n2 = n2.next);
        int t = n1.val; n1.val = n2.val; n2.val = t; // swapping
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/*
 * Solution_0: O(n) time, O(1) space
 */