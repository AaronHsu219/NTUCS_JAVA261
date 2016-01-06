/*********************************************************
 * 猜數字程式：HW61.java
 * 設計一個猜數字的類別(Guess)
 * 並定義一個private資料成員 int answer 存放正確解答
 * 同時設計建構子以完成以下的要求：
 * 預設建構子：使用「Math.random( )」方法，初始答案
 * 答案必需小於或等於100，大於或是等於1
 * 再設計以下的方法：
 * Public String judge(int answer)
 * //判斷猜的數字是否正確，如果正確，傳回「答對了」
 * //如果猜的數字太小，傳回「太小了」
 * //如果猜的數字太大，傳回「太大了」
 * public int getAnswer( )		//傳回答案
*********************************************************/
public class HW61
{
	public static void main(String[] args)
	{
		// 存放使用者輸入的變數
		int input = Integer.parseInt(args[0]);

		// 實體化 Guess 類別成為物件 g
		Guess g = new Guess();

		// 將使用者輸入的整數傳入 g.judge 中比較結果
		System.out.println(g.judge(input));

		// 回傳正確答案到主程式
		System.out.println("答案是：" + g.getAnswer());
	}
}

// 猜數字類別
class Guess
{
	// private 資料成員 answer 負責存放答案
	private int answer;

	// 建構子初始化一個隨機答案介於 1~100
	Guess()
	{
		this.answer = (int)(Math.random()*100 + 1);
	}

	// judge 方法比較使用者輸入的數字跟正確答案
	// 判斷猜的數字是否正確，如果正確，傳回「答對了」
	// 如果猜的數字太小，傳回「太小了」
	// 如果猜的數字太大，傳回「太大了」
	public String judge(int answer)
	{
		if (this.answer > answer)
		{
			return "太小了！";
		}
		else if (this.answer < answer)
		{
			return "太大了！";
		}
		else
		{
			return "答對了！";
		}
	}

	//傳回答案
	public int getAnswer()
	{
		return this.answer;
	}
}