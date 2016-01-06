/**************************************************************
 * 進階排序程式：HW53.java
 * 請寫一個程式讓使用者可以用自己輸入的數字做排序
 * 用正規表示法檢查使用者輸入的是否是數字
 * 並輸出排序後的結果
**************************************************************/

// 本題使用 Arrays 工具排序，因此 import java.util.*;
import java.util.*;

public class HW53
{
	public static void main(String[] args)
	{
		/*
		Arrays.sort(args);
		for (int i = 0; i < args.length; i++)
		{
			System.out.print(args[i] + " ");
		}
		System.exit(0);
		*/

		System.out.println("排序前為：");

		// 將使用者輸入的內容轉成 int 陣列
		int[] strToInt = new int[args.length];
		for (int i = 0; i < args.length; i++)
		{
			System.out.print(args[i] + " ");
			// 此處使用自訂函數 toInt() 來轉換字串到整數
			strToInt[i] = toInt(args[i]);
		}
		System.out.println();

		// 將 int 陣列排序 (使用 Arrays.sort 方法)//
		Arrays.sort(strToInt);

		//System.out.println(strToInt);

		// 輸出排序結果
		System.out.println("排序後為：");
		for (int i = 0; i < strToInt.length; i++)
		{
			System.out.print(strToInt[i] + " ");
		}
	}

	public static int toInt(String input)
	{
		// 檢查使用者輸入的是否為數字
		if (input.matches("[0-9]+"))
		{
			// 若是數字，則轉成 int 型態後回傳
			return Integer.parseInt(input);
		}
		// 若不是數字
		else
		{
			// 則回傳 0
			return 0;
		}
	}
}