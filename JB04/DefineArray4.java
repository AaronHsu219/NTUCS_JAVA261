public class DefineArray4 {
	public static void main(String[] args)
	{
		int[] math_score= new int[3];
		int i;

		System.out.println("三位學生的成績分別為：");

		for (i = 0; i < 3; i++)
		{
			System.out.println("第" + (i+1) + "位學生的成績是：" + math_score[i]);
		}
	}
}