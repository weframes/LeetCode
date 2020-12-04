package leetcode.两数之和;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述： <br>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 <br>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 <br>
 * 示例： <br>
 * 给定 nums = [2, 7, 11, 15], target = 9 <br>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1] <br>
 * 
 * @author zhuxiaoliang
 * @date 2020年12月4日 下午2:42:10
 * 
 */
public class Solution {
	/**
	 * 解题思路： 创建一个map用于接收目标值与遍历数组当前值的差和当前索引，每次遍历判断当前值是否在map中，存在则表示已经找到了
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int num;
		for (int i = 0; i < nums.length; i++) {
			num = nums[i];
			if (map.containsKey(num)) {
				return new int[] { map.get(num), i };
			} else {
				map.put(target - num, i);
			}
		}

		return new int[0];
	}

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		// 开始时间
		long startTime = System.currentTimeMillis();
		int[] result = new Solution().twoSum(nums, target);
		// 结束时间
		long endTime = System.currentTimeMillis();
		System.out.println("花费时间：" + (endTime - startTime) + "ms，结果：" + Arrays.toString(result));
	}
}
