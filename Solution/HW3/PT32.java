/*****************************************
 * 巢狀迴圈操作練習 (pt32.java)
 * 請寫一個 JAVA 程式，利用巢狀迴圈將：
 *
 **
 ***
 ****
 *****
 * 這樣的圖形印在畫面中
*****************************************/

public class PT32
{
	public static void main(String[] args)
	{
		int i, j;
		for (i = 1; i <= 5; i++)
		{
			for (j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			//System.out.print("\n");
		}
	}
}