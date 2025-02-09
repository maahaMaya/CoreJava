package insert_bottom_element;

import java.util.Stack;

public class InsertBottomUsingAuxiliaryStack {

	Stack<Integer> mainStack = new Stack<Integer>();

	public void insertBottomOfStack(int insertDataInBottomOfStack) {
		// Create an extra auxiliary stack
		Stack<Integer> auxilaryStack = new Stack<Integer>();

		/*
		 * Step 1: Pop all elements from the main stack and push them into the auxiliary
		 * stack
		 */
		while (!mainStack.isEmpty()) {
			int popDataFromMainStack = mainStack.pop();
			auxilaryStack.push(popDataFromMainStack);
		}

		// Step 2: Push the new element into the main stack
		mainStack.push(insertDataInBottomOfStack);

		/*
		 * Step 3: Restore the original order by popping each element from the auxiliary
		 * stack and push back to main stack
		 */
		while (!auxilaryStack.isEmpty()) {
			int popDataFromAuxiliaryStack = auxilaryStack.pop();
			mainStack.push(popDataFromAuxiliaryStack);
		}
	}

	public static void main(String[] args) {

		InsertBottomUsingAuxiliaryStack insertBottomUsingAuxiliaryStack = new InsertBottomUsingAuxiliaryStack();
		
		insertBottomUsingAuxiliaryStack.mainStack.push(1);
		insertBottomUsingAuxiliaryStack.mainStack.push(2);
		insertBottomUsingAuxiliaryStack.mainStack.push(3);
		insertBottomUsingAuxiliaryStack.mainStack.push(4);

		System.out.println("Original Stack: " + insertBottomUsingAuxiliaryStack.mainStack);
		//Original Stack: [1, 2, 3, 4]

		//calling method 
		insertBottomUsingAuxiliaryStack.insertBottomOfStack(5);

		System.out.println("Stack after inserting 0 at the bottom: " + insertBottomUsingAuxiliaryStack.mainStack);
		//Stack after inserting 0 at the bottom: [5, 1, 2, 3, 4]
		
		// printing stack bottom to top
		for (int element : insertBottomUsingAuxiliaryStack.mainStack) {
			System.out.println(element);
		}

		//print peek and pop
		while (!insertBottomUsingAuxiliaryStack.mainStack.isEmpty()) {
			System.out.print("< - " + insertBottomUsingAuxiliaryStack.mainStack.peek());
			insertBottomUsingAuxiliaryStack.mainStack.pop();
		}
		//< - 4< - 3< - 2< - 1< - 5
	}

}
