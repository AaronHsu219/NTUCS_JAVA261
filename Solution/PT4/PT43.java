/**************************************************
 * 成績統計程式 (pt43.java)
 * 設計一個程式可以：
 * 儲存10個學生的數學成績
 * 將成績由大至小印出
 * 計算出「及格」與「不及格」的人數
**************************************************/

import java.util.*;

public class PT43
{
	public static void main(String[] args)
	{
		//  隨意定義一個一維陣列 math 表示全班的數學成績
		int[] math = {50, 65, 80, 48, 35, 93, 57, 90, 86, 77};

		// 存放及格人數的變數 pass
		int pass = 0;

		// 利用 Arrays.sort 的工具將 math 排序
		Arrays.sort(math);

		System.out.println("排序後：");

		// 預設排序是由小到大，因此跑一個反向迴圈，將陣列由大到小輸出
		for (int i = math.length - 1; i >= 0; i--)
		{
			System.out.print(math[i]);
			if (i != 0)
			{
				System.out.print(", ");
			}
			else
			{
				System.out.println();
			}

			// 若及格 (大於 60 分)，則將 pass 加 1
			if (math[i] >= 60)
			{
				++pass;
			}
		}

		System.out.println("及格的有：" + pass + "人");
		System.out.println("不及格的有：" + (math.length - pass) + "人");

	}
}//