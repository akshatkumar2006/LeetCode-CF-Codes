package DailyQuestions;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
	class Solution {
	    public int findMaxLength(int[] nums) {
	        int ans = 0;
	        Map<Integer, Integer> mp = new HashMap<>();
	        mp.put(0, -1);  // diff 0 at index -1 (before array starts)
	        int zero = 0, one = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] == 0) zero++;
	            else one++;
	            int diff = zero - one;
	            if (mp.containsKey(diff)) {
	                ans = Math.max(ans, i - mp.get(diff));
	            } else {
	                mp.put(diff, i);
	            }
	        }
	        return ans;
	    }
	}
}
