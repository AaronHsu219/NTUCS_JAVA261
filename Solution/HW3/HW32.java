/**************************************************************
 * 質數判斷程式 (HW32.java)
 * 請設計一個程式可以任何輸入一個小於100的數字，
 * 並判斷該數字是否為質數。
 * 若是質數則印出 "pass"，否則印出 "fail"
 * 質數定義：除了本身和 1 以外並沒有任何其他因子。
 * 例如 2，3，5，7 是質數，4，6，8，9 則否
**************************************************************/

public class HW32
{
	public static void main(String[] args)
	{
		// 存放使用者輸入數字的變數
		int input;
		input = Integer.parseInt(args[0]);

		// 一開始先假定使用者輸入的數字為質數
		boolean result = true;

		// 若輸入值介於 0 ~ 100 間，則執行判斷
		if (input <= 100 && input > 0)
		{

			// 任何數一定可以被 1 分解，因此迴圈從 2 開始執行，跑到 input - 1 為止
			// 例：使用者輸入 30 則迴圈從 2~29；輸入 73 則迴圈從 2~72
			for (int i = 2; i < input; i++)
			{
				// 將每個 i 拿出與 input 做 mod 運作，2~n-1有任何一個可以把 input 整除則是質數
				if (input % i == 0)
				{
					// 若被 i 整數，確定不為質數，將 result 設為 false，並中止迴圈 (因為已確定質數)
					System.out.println(input + "%" + i + "=" + (input % i));
					result = false;
					break;
				}
			}
			if (result)
			{
				System.out.println("你輸入的 "+ input +" 是質數");
			}//
			else
			{
				System.out.println("你輸入的 "+ input +" 不是質數");
			}
		}
		else
		{
			System.out.println("請輸入一個 1~100 中間的數字。");
		}
	}
}