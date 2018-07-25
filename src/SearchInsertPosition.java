/*

Created by EnergyOverflow

35. Search Insert Position
https://leetcode-cn.com/problems/search-insert-position/description/

Note: 只是减去开头校验、使用左闭右开区间的思想，少减了一次1，先比较相等，就能获得两倍的性能。
TODO: 不知道为什么在计算mid的时候使用位移 >> 1 性能反而降低许多

 */

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        // [0, len) 开区间
        // 不需要校验，浪费性能，其实下面相当于校验了，由于是开区间，所以right取length
        int left = 0, right = nums.length;

        // 因为是前闭后开，所以 left = right 的时候就没意义了
        while (left < right) {
            // 这里用位移的话反而慢很多，不知道为什么
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid]) {
                right = mid;    // 右边是开区间，右边是刚好不会取到mid的（跳过mid元素）
            } else {
                left = mid + 1; // 左边是闭区间，为了不取到mid，只能 +1
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        CommonTools.assertEqual(searchInsert(nums, 5), 2);
        CommonTools.assertEqual(searchInsert(nums, 2), 1);
        CommonTools.assertEqual(searchInsert(nums, 7), 4);
        CommonTools.assertEqual(searchInsert(nums, 0), 0);
    }
}
