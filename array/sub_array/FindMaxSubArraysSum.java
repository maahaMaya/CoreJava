package sub_array;

public class FindMaxSubArraysSum {

	public static int printSubArrays(int arr[]) {
		int finalSubArraySum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[ ");
			for (int j = i; j < arr.length; j++) {
				System.out.print("( ");
				int subArraySum = 0;
				for (int k = i; k <= j; k++) {
					subArraySum = subArraySum + arr[k];
				}
				if (subArraySum > finalSubArraySum) {
					finalSubArraySum = subArraySum;
				}
				System.out.print(subArraySum + " )");
			}
			System.out.println(" ]");
		}
		return finalSubArraySum;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10 };
		System.out.println("Maximum Sum of subarray is : " + printSubArrays(arr));
	}
}
