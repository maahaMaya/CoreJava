

public class TrappingRainWater {

	public static int trapRainWater(int arr[]) {
		int arrayLength = arr.length;
		// calculate left max boundary - array
		int leftMax[] = new int[arrayLength];
		leftMax[0] = arr[0];
		for(int i = 1; i < arrayLength; i++) {
			leftMax[i] = Math.max(arr[i], leftMax[i-1]);
		}
		
		// calculate left max boundary - array
		int rightMax[] = new int[arrayLength];
		rightMax[arrayLength - 1] = arr[arrayLength - 1];
		for(int i = arrayLength - 2; i >= 0; i--) {
			rightMax[i] = Math.max(arr[i], rightMax[i+1]);
		}
		
		int trappedWater = 0;
		//loop
		for(int i = 0; i < arrayLength; i++) {
			// waterLevel = min(leftMaxWaterBoundary, rightMaxWaterBoundary)
			int waterLevel = Math.min(leftMax[i], rightMax[i]);
			
			// trapped water = waterLevel -  height[i]
			trappedWater += waterLevel - arr[i];
		}
		return trappedWater;
	}
	
	public static void main(String[] args) {
		int arr[] = {4, 2, 0, 6,3, 2, 5};
		
		System.out.println(trapRainWater(arr));

	}

}
