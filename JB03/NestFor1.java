public class NestFor1 {
	public static void main (String[] args){

		int  i, j;

		for (i = 1; i <= 9; i++)
		{	//�`�N�����Ai����
			for (j = 1; j <= 9; j++)
			{
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}

			System.out.println();
		}

		System.out.println("�{�����槹��");
//		System.out.println("i = " + i);
//		System.out.println("j = " + j);
	}
}