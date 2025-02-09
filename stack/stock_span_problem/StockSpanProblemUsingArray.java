package stock_span_problem;

import java.util.Stack;

public class StockSpanProblemUsingArray {

	public static void calculateStockPlan(int stocks[], int spanArr[]) {
		Stack<Integer> stack = new Stack<Integer>();
		
		//bydefault(1st index) value
		spanArr[0] = 1;
		stack.push(0);

		for (int i = 1; i < stocks.length; i++) {
			int currPrice = stocks[i];

			while (!stack.isEmpty() && currPrice > stocks[stack.peek()]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				spanArr[i] = i + 1;
			} else {
				int prevHigh = stack.peek();
				spanArr[i] = i - prevHigh;
			}
			stack.push(i);
		}
		
		//bydefault(last index) value [add one]
		spanArr[spanArr.length - 1] = spanArr[spanArr.length - 1] + 1;
	}

	public static void main(String[] args) {
		int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
		int spanArr[] = new int[stocks.length];

		calculateStockPlan(stocks, spanArr);

		for (int span : spanArr) {
			System.out.print(span + "  ");
		}

	}

}
