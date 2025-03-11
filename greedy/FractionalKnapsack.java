import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
	
	public static void main(String[] args) {
		int value[] = {60, 100, 120};
		int weight[] = {10, 20, 30};
		
		int totalWeightToSell = 50;
		
		//OthIndex => idx; & 1stIndex => ratio
		double ratioValueVsWeight[][] = new double[value.length][2];
		
		for(int i = 0; i < value.length; i++) {
			ratioValueVsWeight[i][0] = i;
			ratioValueVsWeight[i][1] = value[i]/(double)weight[i];
		}
		
		//Sort AscOrder_ratioValueVsWeight
		Arrays.sort(ratioValueVsWeight, Comparator.comparingDouble(o -> o[1]));
		
		int currentCapacity = totalWeightToSell;
		int finalSellValue = 0;
		
		for(int i = ratioValueVsWeight.length - 1; i >= 0; i--) {
			int idx = (int) ratioValueVsWeight[i][0];
			if(currentCapacity >= weight[idx]) {
				finalSellValue += value[idx];
				currentCapacity -= weight[idx];
			}
			else {
				//include fractional item
				finalSellValue += (ratioValueVsWeight[i][1] * currentCapacity);
				currentCapacity = 0;
				break;
			}
		}
		
		System.out.print("finalSellValue : " + finalSellValue);
		}
}