/*******************************************************************************
 * 大小寫轉換程式：PT51.java
 * 設計一個程式：
 * 能將輸入的英文字串字母中大寫的部份轉為小寫、小寫部份轉為大寫。
 * 例如：
 * 輸入的字串為：Hello_Java
 * 輸出的字串為：hELLO_jAVA
*******************************************************************************/

public class PT51
{
	public static void main (String args[])
	{
		// 將使用者輸入的字串轉成 char array
		//char[] strToChar = args[0].toCharArray();

		// 或將使用者輸入的字串轉成 byte array
		byte[] strToChar = args[0].getBytes();

		System.out.println("原始字串：" + args[0]);

		System.out.print("轉換之後：");

		// 將轉換完的陣列執行迴圈
		for (int i = 0; i < strToChar.length; i++)
		{
			// 檢查每個元素
			// 若介於 65 ~ 90 則為大寫 (65 + 25 = 90)
			if(strToChar[i] >= 65 && strToChar[i] <= 90)
			{
				// 大寫字元轉小寫 +32 (65 + 32 = 97)
				strToChar[i] += 32;
			}

			// 若介於 97 ~ 122 則為小寫 (97 + 25 = 122)
			else if(strToChar[i] >= 97 && strToChar[i] <= 122)
			{
				// 小寫字元轉大寫 -32 (97 - 32 = 65)
				strToChar[i] -= 32;
			}

			// 並非上列兩個區段則不是英文字母
			else
			{
				// 非英文
			}

			// 轉換完後輸出時需強制轉換型別成 (char)
			System.out.print((char)strToChar[i]);
		}

	}
}//