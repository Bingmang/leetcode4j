import java.util.Arrays;

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

    public static void assertNoDuplicates(Comparable[] source, int begin, int end) {
        if (end > source.length - 1) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = begin; i < end; i++) {
            if (source[i].equals(source[i+1])) {
                throw new RuntimeException("assert failed: found duplicated " + source[i]);
            }
        }
        System.out.println("assertNoDuplicates succeed: " + Arrays.toString(source));
    }

    public static void assertNoDuplicates(int[] source, int begin, int end) {
        if (end > source.length - 1) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = begin; i < end; i++) {
            if (source[i] == source[i+1]) {
                System.out.println(Arrays.toString(source));
                throw new RuntimeException("assert failed: found duplicated " + source[i]);
            }
        }
        System.out.println("assertNoDuplicates succeed: " + Arrays.toString(source));
    }

}
