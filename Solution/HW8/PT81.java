/*
 ***********************************************************************
 *例外練習 PT81.java
 ***********************************************************************
 *設計一個程式在執行時需要輸入一個整數數值。
 *請考慮可能產生的例外情況，例如：未輸入數值，數值格式不正確等情形。
 *如果例外產生，請使用throw 的方式直接丟出例外，並顯示相關訊息。
 *如果沒有例外產生，請利用該數值計算正方形的面積。
 ***********************************************************************
 */
//
public class PT81
{
	public static void main(String[] args)
	{
		int input, answer;

		// 若使用者沒有輸入任何參數
		if (args.length == 0)
		{
			// 例外處理 - 自行定義的例外
			try
			{
				// 建立一個自訂的匿名例外，錯誤訊息為「沒有輸入數字！」
				throw new Exception("沒有輸入數字！");
			}
			// 補捉自行定義的的匿名例外
			catch(Exception e)
			{
				// 並將錯誤訊息列印出來
				System.out.println(e.toString());
			}
		}

		// 若使用者有輸入參數
		else
		{
			// 例外處理 - 轉型是否錯誤
			try
			{
				// 可能發出的例外 - NumberFormatException
				// 原因：將字串 args[0] 轉成 Integer 過程中，
				// 若使用者輸入的 args[0] 原本就不是數字，如中英文字
				input = Integer.parseInt(args[0]);

				// 若上一行沒有發生例外，則在此繼續將 input 平方取得面積
				answer = input * input;
				System.out.println("正方形面積為：" + answer);
			}
			// 若例外發生，則補捉 NumberFormatException
			catch(NumberFormatException e)
			{
				System.out.println("數字格式例外！" + e.getMessage());
			}
			// 若發生其他例外，則丟給父親類別處理
			catch(Exception e)
			{
				System.out.println("其他預期以外的錯誤！" + e.getMessage());
			}
		}
	}
}//