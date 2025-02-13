package sub_array;

public class FindMaxSubArraysSumUsingPrefixSum {

	public static int printSubArrays(int arr[]) {
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int prefixSum[] = new int[arr.length];

		prefixSum[0] = arr[0];

		// calculate prefix array
		for (int i = 1; i < prefixSum.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print("[ ");
			for (int j = i; j < arr.length; j++) {
				System.out.print("( ");

				currentSum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];
				if (currentSum > maxSum) {
					maxSum = currentSum;
				}
				System.out.print(currentSum + " )");
			}
			System.out.println(" ]");
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10 };
		System.out.println("Maximum Sum of subarray is : " + printSubArrays(arr));
	}
}
