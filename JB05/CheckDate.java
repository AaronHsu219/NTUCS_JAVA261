public class CheckDate
{
	public static void main(String[] args)
	{
		String input = args[0];
		String pattern= "[0-9]{1,4}[\\-/]?[0-9]{1,2}[\\-/]?[0-9]{1,4}";
		if (input.matches(pattern))
		{
			System.out.print("����榡���T�I");
		}
		else
		{
			System.out.print("�A��J�����O����I");
		}
	}
}