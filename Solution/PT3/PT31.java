/**************************************************
 * 多項執行敘述操作練習 (pt31.java)
 * 把你/妳的血型放在程式中的一個 char 型別變數中：
 * 例 char blood = 'A';
 * 然後使用 switch-case 判斷你/妳是什麼血型
**************************************************/

public class PT31
{
	public static void main(String[] args)
	{
		char blood = 'X';

		switch (blood)
		{
			case 65:
				System.out.print("你的血型是 A 型");
				break;
			case 'B':
				System.out.print("你的血型是 B 型");
				break;
			case 79:
				System.out.print("你的血型是 O 型");
				break;
			default:
				System.out.print("你的血型是 AB 型或其他");
		}
	}
}