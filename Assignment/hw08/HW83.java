import java.io.*;

public class HW83
{
	public static void main(String[] args) throws IOException
	{
		// 使用 InputStreamReader 類別，接收使用者鍵盤輸入的資訊
		InputStreamReader ir = new InputStreamReader(System.in);

		// 再使用 BufferedReader 類別將使用者鍵盤輸入的資訊放置在緩衝區中
		BufferedReader br = new BufferedReader(ir);

		// 實體化 Guess 類別成為物件 g
		Guess g = new Guess();

		System.out.print("請輸入一個 1~100 之間的數字吧!");
		
		while (true) {
			int input = Integer.parseInt(br.readLine());

			// 將使用者輸入的整數傳入 g.judge 中比較結果
			System.out.println(g.judge(input));

			if (g.judge(input) == "答對了！") 
				break;
		}
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
			return "太小了！\n再試一次吧！";
		}
		else if (this.answer < answer)
		{
			return "太大了！\n再試一次吧！";
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