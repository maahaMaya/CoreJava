import java.util.ArrayList;
import java.util.Iterator;

public class ActivitySelectionWithEndTimeSorting {

	public static void main(String[] args) {
		int startTime[] = {1, 3, 0, 5, 8, 5};
		int endTime[] = {2, 4, 6, 7, 9, 9};
		
		//end time basis sorted
		int maxActivity = 0;
		ArrayList<Integer> ans = new ArrayList<>();
		
		//lastActivity(1st case)
		maxActivity = 1;
		ans.add(0);
		int lastEndTime = endTime[0];
		
		//general logic
		for(int i = 1; i < endTime.length; i ++) {
			//ActivitySelectedLogic
			if(startTime[i] >= lastEndTime) {
				maxActivity++;
				ans.add(i);
				lastEndTime = endTime[i];
			}
		}
		
		System.out.println("Max Activites = " + maxActivity);
		for(int i = 0; i < ans.size(); i++) {
			System.out.print("A["+ans.get(i)+"] ");
		}
	}

}
