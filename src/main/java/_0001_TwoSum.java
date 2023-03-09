import java.util.HashMap;
import java.util.Map;

/**
 * <h2>1. 两数之和</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/two-sum/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class TwoSum_Solution {
    /**
     * 非暴力手段解法，复杂度为O(n)
     * @param nums 数组参数
     * @param t 目标值
     * @return 符合条件的两数对应下标
     */
    public int[] twoSum(int[] nums, int t) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            int b = t - nums[i];
            // 切记if和put的顺序不要颠倒了
            if (map.containsKey(b)) {
                // 返回符合条件的两数对应下标
                return new int[]{map.get(b), i};
            }
            // 以数组的值与索引来作为键值对的key和value是常用的小技巧
            map.put(nums[i], i);
        }
        return null;
    }
}
