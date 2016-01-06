import java.util.*;
public class PT51 {
	public static void main(String[] args) {

		char[] strToChar = args[0].toCharArray();

		for (int i = 0;i < strToChar.length;  i++)
		{
			if (strToChar[i] >= 65 && strToChar[i] <= 90)
			{
				strToChar[i] += 32;
			}
			else if (strToChar[i] >= 97 && strToChar[i] <= 122) // 97~122 小寫
			{
				strToChar[i] -= 32;  // 轉大寫 -32
			}
			else
			{

			}
			System.out.print((char)strToChar[i]);
		}
	}
}