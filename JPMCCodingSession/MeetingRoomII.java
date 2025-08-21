package JPMCCodingSession;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 30 },
				{ 5, 10 }, 
				{ 15, 20 },
				{ 2, 6 },
				{ 12, 18 },
				{ 19, 25 },
				{ 1, 5 },
				{ 3, 5 } };
		System.out.println(meetingRoom(arr));
	}

	static int meetingRoom(int[][] intervals) {
//		Arrays.sort(arr);
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[1] - b[1]);
		pq.add(intervals[0]);
		int room = 1;
		for (int i = 1; i < intervals.length; i++) {
			if (pq.peek()[1] > intervals[i][0]) {
				room++;
				pq.add(intervals[i]);
			} else {
				pq.remove();
				pq.add(intervals[i]);
			}
		}
		return room;
	}
}
