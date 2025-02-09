package insert_bottom_element;

import java.util.Stack;

public class InsertBottomUsingRecursion {
	public static void insertAtElementBottom(Stack<Integer> st, int x) {
		// Base case: If the stack is empty, push the new element
		if (st.isEmpty()) {
			st.push(x);
			return;
		}
		// Recursive case: Pop the top element
		int top = st.pop();

		// Call the function recursively
		insertAtElementBottom(st, x);

		// Restore the top element into the stack
		st.push(top);
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
