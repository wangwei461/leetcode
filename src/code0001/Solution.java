package code0001;

import util.ArrayUtil;
import util.TimerUtil;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Solution {
    public static void main(String[] args) {
        int nums[] = {3, 2, 3};
        int target = 6;

        TimerUtil timer = new TimerUtil();
        nums = new Solution().twoSum(nums, target);
        timer.end();

        ArrayUtil.print(nums);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0, j, k = nums.length; i < k; i++) {
            // 判断差值是否存在数组内
            j = getIndex(nums, nums[i], i, target - nums[i]);
            if (j >= 1) {
                return new int[]{i, j};
            }
        }

        return new int[]{};
    }

    private int getIndex(int[] nums, int a, int idx, int t) {
        for (int i = 0, k = nums.length; i < k; i++) {
            // 处理数组重复值
            if (nums[i] == a && idx == i) {
                continue;
            }

            if (nums[i] == t) {
                return i;
            }
        }

        return -1;
    }
}
