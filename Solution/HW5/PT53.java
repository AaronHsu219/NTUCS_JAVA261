/****************************************************************
 * 電話號碼格式驗證：PT53.java
 * 使用正規表示法寫一個能驗證是否符合電話號碼 (含行動電話) 的程式
 * 手機號碼：0912345678 / 0912-345-678
 * 一般號碼：(02)23939889 / 02-2393-9889
 * 電話號碼規則：
 * 最少大約6個號碼
 * 最多呢？
 * 只有 0~9、( )、- 與空白
****************************************************************/

public class PT53
{
	public static void main(String[] args)
	{

		/*
		System.out.println("args[0] = " + args[0]);
		System.out.println("args[1] = " + args[1]);
		System.out.println("args[2] = " + args[2]);
		System.exit(0);
		*/

		String input = "";

		for (int i = 0; i < args.length; i++)
		{
			input += " " + args[i];
		}
		input = input.trim();

		System.out.println("input: " + input);
		//System.exit(0);

		if (input.matches("[\\(\\)0-9\\- ]{6,}"))
		{
			System.out.print("你輸入的是電話號碼！");
		}
		else
		{
			System.out.print("你輸入的不是電話號碼！");
		}
	}

}