/*******************************************************************************
 * 判斷元素是否在陣列中：HW41.java
 * 請利用陣列儲存以下的水果名稱，apple、grape、tomato、banana、orange
 * 然後設計一個程式可供使用者輸入一個字串，並判斷該字串是否存在於陣列中
*******************************************************************************/

// 本題使用 Arrays 類別做搜尋與排序，因此先 import java.util.*
import java.util.*;

public class HW41
{
	public static void main(String[] args)
	{
		// 建立水果陣列
		String[] fruit = {"apple", "grape", "tomato", "banana", "orange"};

		// 使用 boolean 變數存放最後是否找的到
		boolean flag = false;

		// 由於做二元搜尋之故，先使用 Arrays.sort() 來排序
		Arrays.sort(fruit);

		// 二元搜尋若有找到會回傳 >= 0 的值，因此在此使用三元運算子做有沒有找到的判斷
		flag = (Arrays.binarySearch(fruit, args[0]) >= 0) ? true : false;

		if (flag == true)
		{
			System.out.println("找到了！"+ args[0] +"在陣列中！");
		}
		else
		{
			System.out.println("找不到...");
		}
	}
}