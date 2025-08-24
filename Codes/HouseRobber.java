package Codes;

import java.util.Arrays;

public class HouseRobber {
	class Solution {
	    public int rob(int[] nums) {
	        int[] dp = new int[nums.length];
	        Arrays.fill(dp, -1);
	        return robber(nums, 0, dp);
	    }

		public int robber(int[] arr, int i, int[] dp) {
			// TODO Auto-generated method stub
			if (i >= arr.length) {
				return 0;
			}
			if (dp[i] != -1) {
				return dp[i];
			}
			int rob = arr[i] + robber(arr, i + 2, dp);
			int dont_rob = robber(arr, i + 1, dp);
			return dp[i] = Math.max(rob, dont_rob);
		}
	}
}
