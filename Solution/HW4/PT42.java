/***********************************************************
 * 二維陣列操作練習 (pt42.java)
 * 請寫一個 JAVA 程式來計算下列二維陣列所有元素的總和：
 * {{1,7,15},{9,3,4},{6,8,13},{11,5,2},{10,7,9}}
 * 正確答案是 110
***********************************************************/

public class PT42
{
	public static void main(String[] args)
	{
		// demo 加總過程中所需要的變數及 total 為存放總和的變數
		int i = 0, total = 0;

		// 定義題目中所需的二維陣列
		int[][] sum = {{1,7,15},{9,3,4},{6,8,13},{11,5,2},{10,7,9}};

		// foreach 迴圈，第一圈拆解 sum 這個二維陣列成為 array 這個一維陣列
		for(int[] array : sum)
		{
			// foreach 迴圈，第二圈拆解 array 這個一維陣列成為變數 num
			for (int num : array)
			{
				System.out.println("第"+ ++i +"項內容值是: " + num);
				System.out.println("total 目前是: " + total);
				total += num;
				System.out.println("total + " + num + " 後變成: " + total);
			}
		}

		System.out.print("總和是：" + total);
	}
}