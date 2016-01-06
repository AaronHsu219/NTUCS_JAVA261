import java.util.*;
public class HW53 {
	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		double[] num = new double[n];

		// Set pattern
		String pattern = "^[0-9]?\\.?[0-9]*";

		// Read in array length and numbers
		for (int i = 0; i < n ; i++) {
			if (args[i+1].matches(pattern)) {
				num[i] = Double.parseDouble(args[i+1]);
			}
			else
			{
				System.out.println("You need to input actual numbers.");
				System.exit(0);
			}
		}

		// Sort array
		double[] sortnum = new double[n];
		sortnum = num;
		Arrays.sort(sortnum);

		// Print array
		for (int i = 0; i < n ; i++) {
			System.out.print(sortnum[i] + " ");
		}

	}
}