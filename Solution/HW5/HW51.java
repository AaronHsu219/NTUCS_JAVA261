 /**************************************************************
 * 解密程式：HW51.java
 * 設計一個能將 PT52.java 的程式加密過的字串解密回原始字串的解密程式
**************************************************************/

class HW51
{
	public static void main(String[] args)
	{
		System.out.println("輸入為：" + args[0]);

		// 首先一樣將使用者輸入的字串轉換成 char array
		byte[] strToChar = args[0].getBytes();

		// 將每個字元取出 - 1 (變成前一個字，輸入 B 得到 A)
		for (int i = 0; i < strToChar.length; i++)
		{
			strToChar[i]--;
		}

		// 將轉換完的字元陣列轉回字串
		String charToString = new String(strToChar);

		// 將字串再轉回 StringBuffer
		StringBuffer encoded = new StringBuffer(charToString);

		// 利用 StringBuffer 物件中的 reverse() 方法轉向
		encoded.reverse();

		// 最後輸出結果
		System.out.println("解密後：" + encoded);
	}
}