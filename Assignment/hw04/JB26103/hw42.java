public class hw42 {
	public static void main(String[] args) {
		int[][] num = {
			{1,7,15},
			{9,3,4},
			{6,8,13},
			{11,5,2},
			{10,7,9}
		};

		double sum = 0;
		double[] avg = new double[5];

		int i = 0;

		for(int[] firstArray : num)//���o�Ĥ@���}�C������
		{
			int M = i + 1; // Studnet ID
			System.out.print("Student " + M + " score ");

			for(int element : firstArray)//���o�ĤG���}�C������
			{
				System.out.print(element + "\t");
				sum += element;
			}
			avg[i] = sum/3;
			sum = 0;
			i++;
			System.out.println();
		}

		System.out.println("============================================");
		System.out.println("Calculate the average score of each student:");
		System.out.println("============================================");

		for (int j = 0; j < avg.length; j++) {
			int N = j + 1; // Student ID
			System.out.println("The average score of studnet " + N + " is " + avg[j]);
		}

	}
}