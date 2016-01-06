public class pt41 {
	public static void main(String[] args) {


		int n = args[0];
		
		int[] num = new int[12];

		num[0] = 13;
		num[1] = 25;
		num[2] = 39;
		num[3] = 19;
		num[4] = 9;
		num[5] = 47;
		num[6] = 10;
		num[7] = 57;
		num[8] = 58;
		num[9] = 283;
		num[10] = 43;
		num[11] = 349;

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}

		System.out.println("The summation of these numbers is " + sum);
	}
}