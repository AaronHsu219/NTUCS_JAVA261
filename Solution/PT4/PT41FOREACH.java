public class PT41FOREACH
{
	public static void main(String[] args)
	{
		int total = 0;
		int[] sum = {13, 25, 39, 19, 9, 47, 10, 57, 58, 283, 43, 349};

		for (int n : sum)
		{
			total += n;
		}

		System.out.print("Á`©M¬°: " + total);
	}
}