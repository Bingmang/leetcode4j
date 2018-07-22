public class CommonTools {
    public static boolean isSorted(ListNode head) {
        ListNode p = head;
        while (p.next != null) {
            if (p.val > p.next.val) {
                return false;
            }
            p = p.next;
        }
        return true;
    }

    public static void assertEqual(Comparable source, Comparable target) {
        if (source.equals(target)) {
            System.out.println("assertEqual succeed: " + source);
            return;
        } else {
            throw new RuntimeException("assert failed: " + source + " != " + target);
        }
    }

}
