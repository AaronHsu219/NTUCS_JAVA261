public class NestFor1 {
	public static void main (String[] args){

		int  i, j;

		for (i = 1; i <= 9; i++)
		{	//注意執行後，i的值
			for (j = 1; j <= 9; j++)
			{
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}

			System.out.println();
		}

		System.out.println("程式執行完畢");
//		System.out.println("i = " + i);
//		System.out.println("j = " + j);
	}
}