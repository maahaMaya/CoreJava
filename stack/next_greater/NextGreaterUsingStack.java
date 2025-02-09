package next_greater;

import java.util.Stack;

public class NextGreaterUsingStack {
	
	public static void main(String[] aegs) {
		int arr[] = {6, 8, 0, 1, 3};
		Stack<Integer> stack = new Stack<Integer>();
		int nxtGreater[] = new int[arr.length];
		
		for(int i = arr.length - 1; i >= 0; i--) {
			//step_1 : while
			while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
				stack.pop();
			}
			
			//step_2 : if_else
			if(stack.isEmpty()) {
				nxtGreater[i] = -1;
			}else {
				nxtGreater[i] = arr[stack.peek()];
			}
			
			//step_3 : push   
			stack.push(i);
		}
		
		for(int i : arr) {
			System.out.print(i + "  ");
		}
		
		System.out.println();
		
		for(int i : nxtGreater) {
			System.out.print(i + "  ");
		}
	}
}

//next greater right side
//next greater left side
//next smaller right side
//next smaller left side

