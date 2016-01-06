public class CheckEmail
{
	public static void main(String[] args)
	{
		String input = args[0];
		String pattern = "[^@]+@[a-zA-Z0-9\\._\\-]+\\.[a-zA-Z]+";
		if (input.matches(pattern))
		{
			System.out.print("Email 格式正確！");
		}
		else
		{
			System.out.print("你輸入的不是Email！");
		}
	}
}