package searching;

public class LinearSearch {

	public void linarSearchAlgo(int[] arr, int checkingValue) {
		int index = 0;
		for(int ar : arr) {
			if(ar == checkingValue) {
				System.out.println("Value found in Array " + checkingValue + " & index is at " + index);
				return;
			}
			index++;
		}
		System.out.print("Value is not present in the array");
	}
	public static void main(String[] args) {
		
		int[] intArr = {3, 6, 5, 9, 3, 2,99};
		LinearSearch linearSearch = new LinearSearch();
		linearSearch.linarSearchAlgo(intArr, 9);
		linearSearch.linarSearchAlgo(intArr, 19);
	}
}
