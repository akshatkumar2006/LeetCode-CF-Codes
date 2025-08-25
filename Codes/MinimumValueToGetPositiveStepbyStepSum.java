package Codes;

public class MinimumValueToGetPositiveStepbyStepSum {
	class Solution {
	    public int minStartValue(int[] nums) {
	        int startValue = 1;

	        int sum = startValue;
	        for (int i = 0; i < nums.length; i++) {
	            sum += nums[i];
	            if (sum < 1) {
	                int diff = 1 - sum;
	                startValue += diff;
	                sum += diff;
	            }
	        }
	        return startValue;
	    }
	}
}
