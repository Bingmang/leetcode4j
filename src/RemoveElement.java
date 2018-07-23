/*

Created by EnergyOverflow

27. Remove Element
https://leetcode-cn.com/problems/remove-element/description/

 */

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int point = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[point++] = nums[i];
            }
        }
        return point;
    }

    public static void main(String[] args) {
        int[] num1 = { 3, 2, 2, 3 };
        int result = removeElement(num1, 3);
        CommonTools.assertEqual(result, 2);
        System.out.println(Arrays.toString(num1));

        int[] num2 = { 0, 1, 2, 2, 3, 0, 4, 2};
        result = removeElement(num2, 2);
        CommonTools.assertEqual(result, 5);
        System.out.println(Arrays.toString(num2));

        int[] num3 = { 0, 0, 0, 0, 0};
        result = removeElement(num3, 0);
        CommonTools.assertEqual(result, 0);
        System.out.println(Arrays.toString(num3));

        int[] num4 = { 0, 0, 0, 0, 0};
        result = removeElement(num4, 3);
        CommonTools.assertEqual(result, 5);
        System.out.println(Arrays.toString(num4));
    }

}
