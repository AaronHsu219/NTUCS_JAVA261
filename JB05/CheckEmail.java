public class CheckEmail
{
	public static void main(String[] args)
	{
		String input = args[0];
		String pattern = "[^@]+@[a-zA-Z0-9\\._\\-]+\\.[a-zA-Z]+";
		if (input.matches(pattern))
		{
			System.out.print("Email �榡���T�I");
		}
		else
		{
			System.out.print("�A��J�����OEmail�I");
		}
	}
}