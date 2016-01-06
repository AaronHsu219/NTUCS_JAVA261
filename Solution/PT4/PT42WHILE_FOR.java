public class PT42WHILE_FOR
{
	public static void main(String[] args)
	{
		int[][] math = {
			{1,7,15},
			{9,3,4},
			{6,8,13},
			{11,5,2},
			{10,7,9}
		};

		System.out.println("math.length = " + math.length);

		int total = 0;

		int i = 0;
		while (i < math.length)
		{
			for (int j = 0; j < math[i].length; j++)
			{
				total += math[i][j];
			}
			++i;
		}

		System.out.println("Á`¦X¬O: " + total);
	}
}