/*******************************************************************************
 * 骰子遊戲：HW43.java
 * 程式隨機依序擲出3顆骰子，有兩種中獎的可能：
 * a. 三顆骰子點數都一樣，中頭獎
 * b. 三顆骰子剛好從小排到大，例如 135、246，中二獎
 * 其他狀況就銘謝惠顧
*******************************************************************************/

import java.util.*;

public class HW43
{
	public static void main(String[] args)
	{
		// 準備兩個常數存放骰子的面向及個數
		final int howManyDice = 3;			// 3 顆骰子
		final int howManyEdge = 6;			// 每顆骰子有 6 面

		System.out.println("你擲出的點數分別是：");

		// 準備一個陣列來存放骰子擲出後的結過 n 個骰子就有 n 個空間
		int[] dice = new int[howManyDice];

		// 開始擲骰子
		for (int i = 0; i < howManyDice; i++)
		{
			// 用 Math.random() 隨機取一個介於 0~1 的小數 * 以骰子面向再加 1
			dice[i] = (int) (Math.floor(Math.random() * howManyEdge) + 1);
			System.out.println(dice[i]);
		}

		// 呼叫 checkEqual() 函數，確認是否每個骰子的點數都相同
		if (checkEqual(dice) == true)
		{
			System.out.println("哇！恭喜你！"+ howManyDice +"個骰子的點數全部一樣！中頭獎了！");
		}

		// 若每個骰子的點數沒有全然相同的話
		else
		{
			// 準備一個暫存用陣列 sortedDice
			int[] sortedDice;

			// 將目前的骰子擲出的結果複製一份到暫存陣列 sortedDice 中
			sortedDice = dice.clone();

			// 排序暫存陣列 sortedDice (由小到大)
			Arrays.sort(sortedDice);

			// 若排序過的陣列的內容與排序前的剛好相同，代表原本就剛好擲出了順子 (由小到大)
			// 採用 Arrays.equals() 方法，比較排序前後的陣列是否相同
			if (Arrays.equals(dice, sortedDice) == true)
			{
				// 相同代表骰子是由小到大的，中二獎
				System.out.println("手氣還不錯！擲出了順子！中二獎了！");
			}
			else
			{
				System.out.println("銘謝惠顧...下次手氣會更好！");
			}
		}

	}

	// 確認所有骰子的結果是否都剛好相同
	public static boolean checkEqual(int[] array)
	{
		// 一開始初始認為是都剛好相同
		boolean returnValue = true;

		// 以 array[0] 當基準點，其他骰子都跟 array[0] 相比較
		for (int i = 1; i < array.length; i++)
		{
			// 若有一顆骰子跟 array[0] 不同的話就回傳 false
			if (array[0] != array[i])
			{
				returnValue = false;
				break;
			}
		}

		return returnValue;
	}
}