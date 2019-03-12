import java.util.*;

public class DataAnalyze {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter sample size: ");
		int smp = s.nextInt();

		int min = 999999, max = -999999;
		int[][] arr = new int[4][smp];
		int[] avg = new int[4];

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter numbers for Trial " + i);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter sample #" + j + ": ");
				arr[i][j] = s.nextInt();
				avg[i] += arr[i][j];
			}
			System.out.println();
			avg[i] /= arr[i].length;
		}

		System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");

		for (int i = 0; i < arr[0].length; i++) {
			System.out.print("\t" + i + "\t");
			for (int j = 0; j < arr.length; j++) {
				System.out.print("\t" + arr[j][i]);
			}
			System.out.println();
		}

		System.out.println("-------------------------------------------------------");
		System.out.print("\t" + "Average:");

		for (int i = 0; i < avg.length; i++) {
			System.out.print("\t" + avg[i]);
			if (avg[i] > max) max = avg[i];
			if (avg[i] < min) min = avg[i];
		}

		System.out.println("\n\n\tMax average: " + max);
		System.out.println("\tMin average: " + min);

		if (max == min) System.out.println("The trials match EXACTLY!");
		else if (max < 2 * min) System.out.println("The trials concur with each other!");
		else System.out.println("The trials do not concur!");

		s.close();
		
	}

}