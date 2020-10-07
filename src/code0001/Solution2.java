package code0001;

import util.ArrayUtil;
import util.TimerUtil;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        int nums[] = {3, 2, 3};
        int target = 6;

        TimerUtil timer = new TimerUtil();
        nums = new Solution2().twoSum(nums, target);
        timer.end();

        ArrayUtil.print(nums);
    }

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>(len);
        for (int i = 0; i < len; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

