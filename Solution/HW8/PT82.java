/*
 ***********************************************************************
 *串流練習 PT82.java
 ***********************************************************************
 *InputStreamReader 寫一個程式可以分別詢問使用者他的：
 *名字
 *年齡
 *性別
 *輸入完後再將結果印在畫面：
 *Hi "名字" "(先生/小姐)" 你好，你今年 "年齡" 歲
 ***********************************************************************
 */

import java.io.*;

class PT82
{
	// 若不使用例外處理，無法通過編譯，本範例使用 throws 方式將例外丟出
	public static void main(String[] args) throws IOException
	{
		// 預先定義接收使用者輸入用的變數位址
		String name;
		int age;
		String gender;

		// 使用 InputStreamReader 類別，接收使用者鍵盤輸入的資訊
		InputStreamReader ir = new InputStreamReader(System.in);

		// 再使用 BufferedReader 類別將使用者鍵盤輸入的資訊放置在緩衝區中
		BufferedReader br = new BufferedReader(ir);

		// 詢問使用者姓名，再將使用者輸入的資訊存到 name (String) 變數中
		System.out.print("請輸入姓名：");
		name = br.readLine();

		// 詢問使用者年齡，再將使用者輸入的資訊存到 age (int) 變數中
		System.out.print("請輸入年齡：");
		age = Integer.parseInt(br.readLine());

		// 詢問使用者性別，假設輸入可能為 M 或 F，存進 gender (String) 變數中
		System.out.print("請輸入性別 (M/F)：");
		gender = br.readLine();

		// 另外處理 gender 變數，將 M 轉成先生，F 轉成小姐
		// 非必須！
		String sex = (gender.equals("M")) ? "先生" : "小姐";

		// 最後將結果輸出
		System.out.println("Hi "+ name +" "+ sex +" 你好，你今年 "+ age +" 歲");

	}
}