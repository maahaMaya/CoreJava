import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionWithoutEndTimeSorting {

	// TC O(n)
	public static void main(String[] args) {
		int startTime[] = { 1, 3, 0, 5, 8, 5 };
		int endTime[] = { 2, 4, 6, 7, 9, 9 };

		// sortingEndTime
		int activities[][] = new int[startTime.length][3];
		for (int i = 0; i < startTime.length; i++) {
			activities[i][0] = i;
			activities[i][1] = startTime[i];
			activities[i][2] = endTime[i];
		}

		// shorting logic array based on 2nd column
		Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

		// end time basis sorted
		int maxActivity = 0;
		ArrayList<Integer> ans = new ArrayList<>();

		// lastActivity(1st case)
		maxActivity = 1;
		ans.add(activities[0][2]);
		int lastEndTime = activities[0][2];

		// general logic
		for (int i = 1; i < endTime.length; i++) {
			// ActivitySelectedLogic
			if (activities[i][1] >= lastEndTime) {
				maxActivity++;
				ans.add(activities[i][0]);
				lastEndTime = activities[i][2];
			}
		}

		System.out.println("Max Activites = " + maxActivity);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print("A[" + ans.get(i) + "] ");
		}
	}
}
