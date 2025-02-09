package insert_bottom_element;

import java.util.Stack;

public class InsertBottomUsingTemporaryVariable {

	public static void insertAtElementBottom(Stack<Integer> st, int x) {
		// Temporary variable to hold elements
		int[] temp = new int[st.size()];
		int index = 0;

		// Transfer elements to temporary variable
		while (!st.isEmpty()) {
			temp[index++] = st.pop();
		}

		// Push the new element into the stack
		st.push(x);

		// Restore elements from temporary variable
		for (int i = temp.length - 1; i >= 0; i--) {
			st.push(temp[i]);
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
