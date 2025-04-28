// 31. Reverse a linked list.
// Write its algorithm, program.

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/*
Example:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Time Complexity: O(n)
Space Complexity: O(1)
*/
