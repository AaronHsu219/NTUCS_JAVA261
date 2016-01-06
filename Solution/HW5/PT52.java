/**************************************************************
 * 加密程式：PT52.java
 * 設計一個加密程式
 * 該程式能夠將定的各英文字元傳換成下一個字元順序的字元
 * 例如：輸入a，輸出b
 * 轉換完成後，再將字串反向輸出
 * 例如：輸入「Hello」會得到「Ifmmp」，反向後輸出為「pmmfI 」
**************************************************************/

public class PT52
{
	public static void main(String[] args)
	{
		System.out.println("輸入為：" + args[0]);
		// 首先一樣將使用者輸入的字串轉換成 char array
		char[] strToChar = args[0].toCharArray();
		//byte[] strToChar = args[0].getBytes();

		// 將每個字元取出 + 1 (變成下一個字，輸入 A 得到 B)
		for (int i = 0; i < strToChar.length; i++)
		{
			strToChar[i] += 1;
			//strToChar[i] = strToChar[i] + 1;
		}

		// 將轉換完的字元陣列轉回字串
		String charToString = new String(strToChar);

		// 將字串再轉回 StringBuffer
		StringBuffer encoded = new StringBuffer(charToString);

		// 利用 StringBuffer 物件中的 reverse() 方法轉向
		encoded.reverse();

		// 最後輸出結果
		System.out.println("加密後：" + encoded);

	}
}