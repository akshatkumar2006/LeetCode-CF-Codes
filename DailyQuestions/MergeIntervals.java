package DailyQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
	class Solution {
		public int[][] merge(int[][] inter) {
			Arrays.sort(inter, (a, b) -> a[0] - b[0]);
			ArrayList<int[]> ll = new ArrayList<>();
			for (int[] p : inter) {
				if (ll.size() == 0 || ll.get(ll.size() - 1)[1] < p[0]) {
					ll.add(p);
				} else {
					// ll.set(ll.size()-1,new int
					// []{ll.get(ll.size()-1)[0],Math.max(ll.get(ll.size()-1)[1],p[1]))});
					ll.get(ll.size() - 1)[1] = Math.max(ll.get(ll.size() - 1)[1], p[1]);
				}
			}
			return ll.toArray(new int[ll.size()][]);

		}
	}
}
