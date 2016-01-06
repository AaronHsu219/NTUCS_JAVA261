/**************************************************************
 * 所得稅計算程式 (HW31.java)
 * 請設計一個程式可以計算所得稅，
 * 公式：收入30萬內的稅率為6%，超過30萬元的部份，稅率13%
 * 例如：收入為40萬元，則繳3萬1仟元的稅金
**************************************************************/

public class HW31
{
	public static void main(String[] args)
	{
		// 準備一個變數來處理使用者傳入的參數 (年收入)
		int income;
		income = Integer.parseInt(args[0]);

		// 30 萬為門檻值
		int threshold = 300000;

		// 30 萬以內的稅率 1
		double tax_rate1 = 0.06;

		// 超過 30 萬的稅率 2
		double tax_rate2 = 0.13;

		// 最後要繳交的總稅額
		double tax;

		System.out.println("年收入為：" + income + "元");

		// 若使用者的年收入在 30 萬 (門檻值) 以內
		if (income <= threshold)
		{
			// 則只要將年收入 * 稅率 1 就是繳稅總額
			tax = income * tax_rate1;
		}

		// 若超過 30 萬的門檻值
		else
		{
			// 則 30 萬的部份先乘以稅率 1
			tax = threshold * tax_rate1;

			// 將超過 30 萬的部份乘以稅率 2
			income -= threshold;
			tax += income * tax_rate2;
		}

		System.out.println("今年要繳的稅為：" + tax + "元");
	}
}