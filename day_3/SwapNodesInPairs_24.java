public class SwapNodesInPairs_24 {
    // Problem Link: https://leetcode.com/problems/swap-nodes-in-pairs/
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode nn = head.next.next;
        ListNode n = head.next;
        n.next=head;
        head.next = swapPairs(nn);
        return n;
    }
}

// Time Complexity: O(n) => T(n) = T(n-2) + O(1)
// Space Complexity: O(n)