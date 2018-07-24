/*

Created by EnergyOverflow

28. Implement strStr()
https://leetcode-cn.com/problems/implement-strstr/description/

 */

public class Implement_strStr {
    public static int strStr(String haystack, String needle) {
//        if (needle.length() > haystack.length()) {
//            return -1;
//        }
//        if (needle.length() == 0) {
//            return 0;
//        }
//        int firstIndex = -1;
//        int needleIndex = 0;
//        for (int i = 0; i < haystack.length(); i++) {
//            if (haystack.charAt(i) == needle.charAt(needleIndex)) {
//                if (firstIndex < 0) {
//                    firstIndex = i;
//                }
//                if (++needleIndex > needle.length() - 1) {
//                    return firstIndex;
//                }
//            } else {
//                firstIndex = -1;
//                needleIndex = 0;
//            }
//        }
//        return firstIndex;
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        int result = strStr("hello", "ll");
        CommonTools.assertEqual(result, 2);

        result = strStr("aaaaa", "bba");
        CommonTools.assertEqual(result, -1);

        result = strStr("abcdefg", "a");
        CommonTools.assertEqual(result, 0);

        result = strStr("abcdefgg", "g");
        CommonTools.assertEqual(result, 6);

        result = strStr("abcdefg", "");
        CommonTools.assertEqual(result, 0);

        result = strStr("", "a");
        CommonTools.assertEqual(result, -1);

        result = strStr("mississippi", "issip");
        CommonTools.assertEqual(result, 4);

    }

}
