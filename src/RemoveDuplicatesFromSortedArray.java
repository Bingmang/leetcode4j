/*

Created by EnergyOverflow

26. Remove Duplicates from Sorted Array
https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/description/

 */

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int firstShowPoint = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[firstShowPoint]) {
                nums[++firstShowPoint] = nums[i];
            }
        }
        return firstShowPoint + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = { 0, 0, 1, 1, 2, 2, 3, 3, 4 };
        int result = removeDuplicates(nums1);
        CommonTools.assertEqual(result, 5);
        CommonTools.assertNoDuplicates(nums1, 0, 4);

        int[] nums2 = { 0 };
        result = removeDuplicates(nums2);
        CommonTools.assertEqual(result, 1);
        CommonTools.assertNoDuplicates(nums2, 0, 0);

        int[] nums3 = { 0, 1, 2, 2, 3, 4, 9, 9, 10, 11, 12, 12, 12};
        result = removeDuplicates(nums3);
        CommonTools.assertEqual(result, 9);
        CommonTools.assertNoDuplicates(nums3, 0, 8);



    }

}
