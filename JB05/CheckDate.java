public class CheckDate
{
	public static void main(String[] args)
	{
		String input = args[0];
		String pattern= "[0-9]{1,4}[\\-/]?[0-9]{1,2}[\\-/]?[0-9]{1,4}";
		if (input.matches(pattern))
		{
			System.out.print("日期格式正確！");
		}
		else
		{
			System.out.print("你輸入的不是日期！");
		}
	}
}