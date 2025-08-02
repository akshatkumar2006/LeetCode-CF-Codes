package JPMCCodingSession;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_Or_Heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(27);
		pq.add(327);
		pq.add(21);
		pq.add(2);
		pq.add(-23);
		pq.add(32);
		pq.add(-42);
		System.out.println(pq.size());
		System.out.println(pq.peek()); // view
		System.out.println(pq.poll()); // delete
		System.out.println(pq);
	}

}
