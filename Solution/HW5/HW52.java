/**************************************************************
 * 驗證網址程式：HW52.java
 * 請用正規表示法設計一個可以驗證是否為真實網址的程式
 * 網址的規則：
 * 一定是 http:// 開頭
 * 至少有一個 . (dot)、最後一個 . 後面的只能為英文字母
 * 最後一個 . 前面至少有一個字元
 * 例：http://google.com、http://tw.yahoo.com、http://www.ntu.edu.tw
**************************************************************/

public class HW52
{
	public static void main(String[] args)
	{
		// 取得使用者輸入的字串
		String input = args[0];
		System.out.println("你輸入的是:" + input);

		// 公式：http://.+\\.[a-zA-Z]+
		// http:// 開頭
		// 最後一個 . (\\.) 後是英文字母 [a-zA-Z]+ 一個或多個
		if (input.matches("http://.+\\.[a-zA-Z]+"))
		{
			System.out.print("你輸入的是網址！");
		}
		else
		{
			System.out.print("你輸入的不是網址！");
		}
	}
}