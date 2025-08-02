package LinkedList;

class Node{
	int data;
	Node next;
	Node(int data1, Node next1){
		this.data = data1;
		this.next = next1;
	}
}

public class Introduction {
	static Node convertArrll(int[] arr) {
		Node head = new Node(arr[0], null);
		Node mover = head;
		for(int i = 1; i<arr.length; i++) {
			Node temp = new Node(arr[i], null);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	public static void main(String[] args) {
		int[] arr = {2, 5, 6, 7};
//		Node y = new Node(arr[0], null);
//		System.out.println(y.data + " " + y.next);
		// array to linked list
		Node head = convertArrll(arr);
		System.out.println(head.data);
	}

}
