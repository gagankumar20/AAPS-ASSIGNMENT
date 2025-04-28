/*
13. How to merge two sorted linked lists into one sorted list.
    Write its algorithm, program. Find its time and space complexities.
    Explain with suitable example.
*/

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MergeSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        if (l1 != null) tail.next = l1;
        else tail.next = l2;
        
        return dummy.next;
    }

    public static void main(String[] args) {
        // Example creation
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode merged = mergeTwoLists(l1, l2);
        System.out.print("Merged list: ");
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}

/*
Time Complexity: O(n + m), where n and m are lengths of lists
Space Complexity: O(1)

Example:
Input: [1->2->4], [1->3->4]
Output: [1->1->2->3->4->4]
*/
