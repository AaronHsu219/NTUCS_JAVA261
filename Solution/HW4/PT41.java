/***********************************************************
 * 一維陣列操作練習 (pt41.java)
 *請寫一個 JAVA 程式，把下面的數字依序存放在一個整數陣列中，
 *並使用任何一種迴圈將所有值加總起來：
 *13, 25, 39, 19, 9, 47, 10, 57, 58, 283, 43, 349
 *正確答案是 952
***********************************************************/

public class PT41
{
	public static void main(String[] args)
	{
		// 初始化一個加總的 int 變數，值為 0
		int total = 0;

		// 定義 int 陣列 sum
		int[] sum = {13, 25, 39, 19, 9, 47, 10, 57, 58, 283, 43, 349};

		// 跑一個迴圈，將 sum 陣列從 0 到 sum.length
		for (int i = 0; i < sum.length; i++)
		{
			// 將 sum[i] 取出加總到 total 總合變數中
			total += sum[i];
		}

		// 迴圈執行完後 total 即為總合，將之輸出
		System.out.print("總合是：" + total);
	}
}