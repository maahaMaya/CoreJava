package insert_bottom_element;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class InsertBottomUsingQueue {

	public static void insertAtElementBottom(Stack<Integer> st, int x) {
		// Create a queue to hold elements
		Deque<Integer> queue = new LinkedList<>();

		// Step 1: add elements from the stack to the queue
		while (!st.isEmpty()) {
			queue.add(st.pop());
		}

		// Step 2: Push the new element into the stack
		st.push(x);

		// Step 3: get back elements from the queue to the stack
		while (!queue.isEmpty()) {
			st.push(queue.pollLast());
		}
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);

		System.out.println("Original Stack: " + st);
		insertAtElementBottom(st, 5);
		System.out.println("Stack after inserting 5 at the bottom: " + st);
	}
}
