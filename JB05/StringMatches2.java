public class StringMatches2
{
	public static void main(String[] args)
	{
		if (args[0].matches("[Aa]llan"))
		{
			System.out.print("Hi Allan 歡迎你！");
		}
		else
		{
			System.out.print("請問你是哪位？");
		}
	}
}