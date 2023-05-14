package day_1;

// https://leetcode.com/problems/add-two-numbers/description/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d = new ListNode();
        ListNode cu = d;

        int s=0;
        while(l1 != null || l2 != null || s == 1) {
            if(l1!=null) { s+=l1.val; l1 = l1.next; }
            if(l2!=null) { s+=l2.val; l2 = l2.next; }
            cu.next = new ListNode(s%10);
            s=(int)s/10;

            cu = cu.next;
        }
        return d.next;
    }
}

/*
 * Time complexity : O(max(m,n)). Assume that m and n represents the length of
 * l1 and l2 respectively, the algorithm above iterates at most max(m,n) times.
 * Space complexity : O(max(m,n)). The length of the new list is at most
 * max(m,n)+1.
 */