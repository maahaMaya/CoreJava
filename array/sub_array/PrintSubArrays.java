package sub_array;

public class PrintSubArrays {

	public static void printSubArrays(int arr[]) {
		for(int i = 0; i < arr.length; i ++) {
			System.out.print("[ ");
			for(int j = i; j < arr.length;  j++) {
				System.out.print("( ");
				for(int k = i; k <= j; k ++) {
					System.out.print(arr[k] + " ");
				}
				System.out.print(" )");
			}
			System.out.println(" ]");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 8, 10};
		printSubArrays(arr);
	}

}
