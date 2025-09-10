package DailyQuestions;

public class MinCostClimbingStairs {
	
	public static void main(String[] args) {
		int[] cost = {10,15,20};
		MinCostClimbingStairs m = new MinCostClimbingStairs();
		
		Solution solver = m.new Solution();
		int ans = solver.minCostClimbingStairs(cost);
		
		System.out.println(ans);
	}
	
	// forward dp table fill
//	class Solution {
//	    public int minCostClimbingStairs(int[] cost) {
//	    	int n = cost.length;
//	    	int[] dp = new int[n];
//	        return Math.min(getCost(cost, n - 1, dp), getCost(cost, n - 2, dp));
//	    }
//
//		public int getCost(int[] cost, int i, int[] dp) {
//			// TODO Auto-generated method stub
//			if(i<0) {
//				return 0;
//			}
//			
//			if(i == 0 || i == 1) {
//				return cost[i];
//			}
//			
//			if(dp[i] != 0) {
//				return dp[i];
//			}
//			
//			int singleStep = getCost(cost, i - 1, dp);
//			int doubleStep = getCost(cost, i - 2, dp);
//			
//			return dp[i] =  cost[i] + Math.min(singleStep, doubleStep);
//		}
//	}
	
	// backward dp table fill
//	class Solution {
//	    public int minCostClimbingStairs(int[] cost) {
//	        int n = cost.length;
//	        int[] dp = new int[n];
//	        return Math.min(getCost(0, cost, dp), getCost(1, cost, dp));
//	    }
//
//	    public int getCost(int i, int[] cost, int[] dp) {
//	        int n = cost.length;
//
//	        // If you step beyond the last index, no cost
//	        if (i >= n) return 0;
//
//	        // Already solved
//	        if (dp[i] != 0) return dp[i];
//
//	        // Either take one step or two steps from here
//	        int oneStep = getCost(i + 1, cost, dp);
//	        int twoSteps = getCost(i + 2, cost, dp);
//
//	        dp[i] = cost[i] + Math.min(oneStep, twoSteps);
//
//	        return dp[i];
//	    }
//	}
	
	class Solution {
	    public int minCostClimbingStairs(int[] cost) {
	        int n = cost.length;
	        int first = cost[0];
	        int second = cost[1];
	        for(int i = 2; i<n; i++) {
	        	int curr = cost[i] + Math.min(first , second);
	        	first = curr;
	        	second = first;
	        }
	        
	        return first;
	    }
//	    public int minCostClimbingStairs(int[] cost) {
//	    	int n = cost.length;
//	    	int[] dp = new int[n];
//	    	for(int i = 0; i<n; i++) {
//	    		if(i<2) dp[i] = cost[i];
//	    		else dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
//	    	}
//	    	return Math.min(dp[n - 1], dp[n - 2]);
//	    }
	}

}
