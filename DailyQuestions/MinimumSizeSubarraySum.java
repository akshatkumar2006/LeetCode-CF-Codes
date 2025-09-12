package DailyQuestions;

public class MinimumSizeSubarraySum {
	class Solution {
	    public int minSubArrayLen(int target, int[] nums) {
	        int n = nums.length;
	        int l = 0, r = 0;

	        int currSum = 0;

	        int ans = n + 1;

	        while (r < n) {
	            // grow
	            currSum += nums[r];

	            // shrink

	            while (currSum >= target && l <= r) {
	                if (currSum >= target) {
	                    ans = Math.min(ans, r - l + 1);
	                }
	                currSum -= nums[l];
	                l++;
	            }

	            // update

	            r++;
	        }

	        return ans == n + 1 ? 0 : ans;
	    }
	}
}
