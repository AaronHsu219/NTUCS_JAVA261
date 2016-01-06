/*
 ***********************************************************************
 *存款利息計算程式 HW82.java
 ***********************************************************************
 *假定有以下的資料型態：
 *String name;		//儲存姓名的資料
 *float premium;	//代表銀行存款的本金數額
 *float iRate;		//代表銀行的存款利率
 *請設計一個程式，使用者可以由鍵盤依次輸入上述的資料，輸入完成後，
 *再將輸入的內容顯示在螢幕上，並依輸入的本金和利率，再計算一年的存款利息
 ***********************************************************************
 */

// 使用 burrfered reader 記得 import java.io 套件
import java.io.*;

class HW82
{
	// 主程式中使用 BufferedReader 時必須要有 exception 處理
	public static void main(String[] args) throws IOException
	{
		// 準備我們要接收資料的變數空間
		String name;	//儲存姓名的資料
		float premium;	//代表銀行存款的本金數額
		float rate;		//代表銀行的存款利率

		// 準備一個紀錄最後利息的變數
		float result;

		// 用 BufferedReader 接收使用者輸入的資料
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		System.out.print("請輸入存戶姓名：");
		name = br.readLine();

		// 本金數、利率是 float 型態，因此需用 Float.parseFloat() 轉成 float
		System.out.print("請輸入本金數額：");
		premium = Float.parseFloat(br.readLine());

		System.out.print("請輸入存款利率%：");
		rate = Float.parseFloat(br.readLine());

		System.out.println("存款利息公式：本金 * 存款利率%：");

		// 使用者輸入的利率假設是 %，則需將使用者的輸入除以 100 得到實際小數
		result = premium * (rate / 100);
		System.out.println(name + "你的利息是：" + result);
		System.out.println("本金加利息總共是：" + (premium + result));

	}
}