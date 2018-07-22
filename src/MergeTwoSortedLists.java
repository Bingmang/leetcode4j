/*

Created by EnergyOverflow

21. Merge Two Sorted Lists
https://leetcode-cn.com/problems/merge-two-sorted-lists/description/
*/

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode l3 = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l3.next = l1;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        l3.next = l1 == null ? l2 : l1;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(6);
        ListNode a4 = new ListNode(8);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        ListNode result = mergeTwoLists(n1, a1);
        CommonTools.assertEqual(CommonTools.isSorted(result), true);
    }

}

