/*
 ***********************************************************************
 *猜數字程式 v2 HW83.java
 ***********************************************************************
 *請改進 HW61.java的猜數字程式。
 *以BufferedReader的方法讓使用者可以一直猜，直到猜對正確答案為止
 ***********************************************************************
 */
import java.io.*;

public class HW83
{
	public static void main(String[] args) throws IOException
	{
		// 主程式先實體化 Guess() 類別
		Guess g = new Guess();

		// 用 BufferedReader 接收使用者輸入的資料
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		System.out.println("請輸入一個 1~100 之間的數字吧！");
//
		// 執行一個無窮迴圈，只有在猜到正確答案時才結束迴圈
		while(true)
		{
			// answer 用來接收使用者輸入的內容
			int answer = Integer.parseInt(br.readLine());

			// 如果使用者輸入的數字跟正確答案不同，則輸出「太小了！」或「太大了！」
			if (answer != g.getAnswer())
			{
				System.out.println(g.judge(answer));
			}
			// 如果相同，則輸出「答對了！」並用 break 離開迴圈
			else
			{
				System.out.println("答對了！");
				break;
			}

			// 如果迴圈還需要繼續跑，就輸出「再試一次把！」請使用者再重新作答
			System.out.println("再試一次吧！");
		}

	}
}

// 猜數字類別
class Guess
{
	// 私有成員 int answer 拿來存放正確答案
	private int answer;

	// 在建構子中隨機產生一個 1~100 之中的整數值
	Guess()
	{
		this.answer = (int)(Math.random() * 100 + 1);
	}

	// judge 方法會回傳使用者是否作答正確
	public String judge(int answer)
	{
		// 如果使用者輸入的 answer 比正確答案 this.answer 小的話就說太小了
		if (this.answer > answer)
		{
			return "太小了！";
		}
		// 如果使用者輸入的 answer 比正確答案 this.answer 大的話就說太大了
		else if (this.answer < answer)
		{
			return "太大了！";
		}
		// 如果不比正確答案小、也不比它大，就是答對了
		else
		{
			return "答對了！";
		}
	}

	// getAnswer() 會回傳正確答案值給主程式
	public int getAnswer()
	{
		return this.answer;
	}
}