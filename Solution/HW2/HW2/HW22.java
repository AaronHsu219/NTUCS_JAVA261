/************************************************************************************
 * 分數計算程式 (HW22.java)：
 * 請設計一個程式可供使用者輸入：「國文」、「數學」、「英文」，三科成績，
 * 並幫他計算出他的總分以及平均分數
 ************************************************************************************/

public class HW22
{
	public static void main(String[] args)
	{
		// 準備四個整數變數來存放「國文」、「數學」、「英文」，三科成績與總分
		int chn, math, eng, total;

		// 準備一個浮點數變數來存放平均值 (會有小數)
		double avg;

		// 將使用者輸入的 args[0] 轉成整數當做國文成績
		chn = Integer.parseInt(args[0]);

		// 將使用者輸入的 args[1] 轉成整數當做數學成績
		math = Integer.parseInt(args[1]);

		// 將使用者輸入的 args[2] 轉成整數當做英文成績
		eng = Integer.parseInt(args[2]);

		// 總分計算，將國文、數學、英文三科分數加總起來
		total = chn + math + eng;

		// 除以 3 之後存到 avg 中當平均
		avg = (double)total / 3;

		// 輸出結果
		System.out.println("國文：" + chn);
		System.out.println("數學：" + math);
		System.out.println("英文：" + eng);
		System.out.println("總分：" + total);
		System.out.println("平均：" + avg);
	}
}